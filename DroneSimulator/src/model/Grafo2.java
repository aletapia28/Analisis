package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

public class Grafo2 {
    char[]  nodos;  // Letras de identificaci�n de nodo
    int[][] grafo;  // Matriz de distancias entre nodos
    String  rutaMasCorta;                           // distancia m�s corta
    int     longitudMasCorta = Integer.MAX_VALUE;   // ruta m�s corta
    List<NodoPrueba>  listos=null;                        // nodos revisados Dijkstra
 
    // construye el grafo con la serie de identificadores de nodo en una cadena
    Grafo2(String serieNodos) {
        nodos = serieNodos.toCharArray();
        grafo = new int[nodos.length][nodos.length];
    }
 
    // asigna el tama�o de la arista entre dos nodos
    public void agregarRuta(char origen, char destino, int distancia) {
        int n1 = posicionNodo(origen);
        int n2 = posicionNodo(destino);
        grafo[n1][n2]=distancia;
        grafo[n2][n1]=distancia;
    }
 
    // retorna la posici�n en el arreglo de un nodo espec�fico
    private int posicionNodo(char nodo) {
        for(int i=0; i<nodos.length; i++) {
            if(nodos[i]==nodo) return i;
        }
        return -1;
    }
     
    // encuentra la ruta m�s corta desde un nodo origen a un nodo destino
    public String encontrarRutaMinimaDijkstra(char inicio, char fin) {
        // calcula la ruta m�s corta del inicio a los dem�s
        encontrarRutaMinimaDijkstra(inicio);
        // recupera el nodo final de la lista de terminados
        NodoPrueba tmp = new NodoPrueba(fin);
        if(!listos.contains(tmp)) {
            System.out.println("Error");
            return "No se pudo";
        }
        tmp = listos.get(listos.indexOf(tmp));
        int distancia = tmp.distancia;  
        // crea una pila para almacenar la ruta desde el nodo final al origen
        Stack<NodoPrueba> pila = new Stack<NodoPrueba>();
        while(tmp != null) {
            pila.add(tmp);
            tmp = tmp.procedencia;
        }
        String ruta = "";
        List<Character> recorrido = new ArrayList<Character>(); //lista recorrido que guarda los nodos utilizados
        // recorre la pila para armar la ruta en el orden correcto
        while(!pila.isEmpty()) {
        	
        	ruta+=(recorrido.add(pila.pop().id)+ " ");
        }
        System.out.println("Ruta utilizada:");
        for (int i = 0; i <= recorrido.size() - 1; i++) {
            System.out.print(recorrido.get(i)+" ");
        }
        System.out.println();
        System.out.println("\nLista con los nodos recorridos: "+recorrido); //lista con los nodos recorridos
        return "La distancia total es: "+ distancia;
        
    }
 
    // encuentra la ruta m�s corta desde el nodo inicial a todos los dem�s
    public void encontrarRutaMinimaDijkstra(char inicio) {
        Queue<NodoPrueba>   cola = new PriorityQueue<NodoPrueba>(); // cola de prioridad
        NodoPrueba            ni = new NodoPrueba(inicio);          // nodo inicial
         
        listos = new LinkedList<NodoPrueba>();// lista de nodos ya revisados
        cola.add(ni);                   // Agregar nodo inicial a la cola de prioridad
        while(!cola.isEmpty()) {        // mientras que la cola no esta vacia
            NodoPrueba tmp = cola.poll();     // saca el primer elemento
            listos.add(tmp);            // lo manda a la lista de terminados
            int p = posicionNodo(tmp.id);   
            for(int j=0; j<grafo[p].length; j++) {  // revisa los nodos hijos del nodo tmp
                if(grafo[p][j]==0) continue;        // si no hay conexi�n no lo evalua
                if(estaTerminado(j)) continue;      // si ya fue agregado a la lista de terminados
                NodoPrueba nod = new NodoPrueba(nodos[j],tmp.distancia+grafo[p][j],tmp);
                // si no est� en la cola de prioridad, lo agrega
                if(!cola.contains(nod)) {
                    cola.add(nod);
                    continue;
                }
                // si ya est� en la cola de prioridad actualiza la distancia menor
                for(NodoPrueba x: cola) {
                    // si la distancia en la cola es mayor que la distancia calculada
                    if(x.id==nod.id && x.distancia > nod.distancia) {
                        cola.remove(x); // remueve el nodo de la cola
                        cola.add(nod);  // agrega el nodo con la nueva distancia
                        break;          // no sigue revisando
                    }
                }
            }
        }
    }
 
    // verifica si un nodo ya est� en lista de terminados
    public boolean estaTerminado(int j) {
        NodoPrueba tmp = new NodoPrueba(nodos[j]);
        return listos.contains(tmp);
    }
 
    // encontrar la ruta m�nima por fuerza bruta
    public void encontrarRutaMinimaFuerzaBruta(char inicio, char fin) {
        int p1 = posicionNodo(inicio);
        int p2 = posicionNodo(fin);
        // cola para almacenar cada ruta que est� siendo evaluada
        Stack<Integer> resultado = new Stack<Integer>();
        resultado.push(p1);
        recorrerRutas(p1, p2, resultado);
    }
 
    // recorre recursivamente las rutas entre un nodo inicial y un nodo final
    // almacenando en una cola cada nodo visitado
    private void recorrerRutas(int nodoI, int nodoF, Stack<Integer> resultado) {
        // si el nodo inicial es igual al final se eval�a la ruta en revisi�n
        if(nodoI==nodoF) {
            int respuesta = evaluar(resultado);
            if(respuesta < longitudMasCorta) {
                longitudMasCorta = respuesta;
                rutaMasCorta     = "";
                for(int x: resultado) rutaMasCorta+=(nodos[x]+" ");
            }
            return;
        }
        // Si el nodoInicial no es igual al final se crea una lista con todos los nodos
        // adyacentes al nodo inicial que no est�n en la ruta en evaluaci�n
        List<Integer> lista = new Vector<Integer>();
        for(int i=0; i<grafo.length;i++) {
            if(grafo[nodoI][i]!=0 && !resultado.contains(i))lista.add(i);
        }
        // se recorren todas las rutas formadas con los nodos adyacentes al inicial
        for(int nodo: lista) {
            resultado.push(nodo);
            recorrerRutas(nodo, nodoF, resultado);
            resultado.pop();
        }
    }
 
    // evaluar la longitud de una ruta
    public int evaluar(Stack<Integer> resultado) {
        int  resp = 0;
        int[]   r = new int[resultado.size()];
        int     i = 0;
        for(int x: resultado) r[i++]=x;
        for(i=1; i<r.length; i++) resp+=grafo[r[i]][r[i-1]];
        return resp;
    }
 
    public static void main(String[] args) {
        Grafo2 g = new Grafo2("abcdef");
        g.agregarRuta('a','b', 3);
        g.agregarRuta('a','e', 6);
        g.agregarRuta('a','f',10);
        g.agregarRuta('b','c', 5);
        g.agregarRuta('b','e', 2);
        g.agregarRuta('c','d', 8);
        g.agregarRuta('c','e', 9);
        g.agregarRuta('c','f', 7);
        g.agregarRuta('d','f', 4);
        g.agregarRuta('e','f', 4);
        g.agregarRuta('e', 'f', 1);
        char inicio = 'a';
        char fin    = 'f';
        String respuesta = g.encontrarRutaMinimaDijkstra(inicio, fin);
        System.out.println(respuesta);
    }
}
