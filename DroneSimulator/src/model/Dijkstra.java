/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
import model.Graph;
import model.Vertex; 

/**
 *
 * @author Víctor
 */
public class Dijkstra {
<<<<<<< HEAD
	List<Vertex>  listos=null;
	String  rutaMasCorta;                           // distancia más corta
    int     longitudMasCorta = Integer.MAX_VALUE;   // ruta más corta
    int[][] grafo;
    
    
	public String encontrarRutaMinimaDijkstra(char inicio, char fin) {
        // calcula la ruta más corta del inicio a los demás
        encontrarRutaMinimaDijkstra(inicio);
        // recupera el nodo final de la lista de terminados
        Vertex tmp = new Vertex(fin);
        if(!listos.contains(tmp)) {
            System.out.println("Error");
            return "No se pudo";
        }
        tmp = listos.get(listos.indexOf(tmp));
        double distancia = tmp.minDistance;  
        // crea una pila para almacenar la ruta desde el nodo final al origen
        Stack<Vertex> pila = new Stack<Vertex>();
        while(tmp != null) {
            pila.add(tmp);
            tmp = tmp.previous;
        }
        String ruta = "";
        ArrayList<Integer> recorrido = new ArrayList<Integer>(); //lista recorrido que guarda los nodos utilizados
        // recorre la pila para armar la ruta en el orden correcto
        while(!pila.isEmpty()) {
        	
        	ruta+=(recorrido.add(pila.pop().name)+ " ");
        }
        System.out.println("Ruta utilizada:");
        for (int i = 0; i <= recorrido.size() - 1; i++) {
            System.out.print(recorrido.get(i)+" ");
        }
        System.out.println();
        System.out.println("\nLista con los nodos recorridos: "+recorrido); //lista con los nodos recorridos
        return "La distancia total es: "+ distancia;
        
    }
	
    // encuentra la ruta más corta desde el nodo inicial a todos los demás
    public void encontrarRutaMinimaDijkstra(char inicio) {
        Queue<Vertex>   cola = new PriorityQueue<Vertex>(); // cola de prioridad
        Vertex            ni = new Vertex(inicio);          // nodo inicial
         
        listos = new LinkedList<Vertex>();// lista de nodos ya revisados
        cola.add(ni);                   // Agregar nodo inicial a la cola de prioridad
        while(!cola.isEmpty()) {        // mientras que la cola no esta vacia
            Vertex tmp = cola.poll();     // saca el primer elemento
            listos.add(tmp);            // lo manda a la lista de terminados
            Graph a = new Graph(longitudMasCorta);
          //ejecutas el metodo de la clase.
            Vertex b =new Vertex(longitudMasCorta);
            Graph g = new Graph(longitudMasCorta);
            int p = a.posicionNodo(tmp.name);   
            for(int j=0; j<grafo[p].length; j++) {  // revisa los nodos hijos del no1do tmp
                if(grafo[p][j]==0) continue;        // si no hay conexión no lo evalua
                if(estaTerminado(j)) continue;      // si ya fue agregado a la lista de terminados
                Vertex nod = new Vertex(b.path.get(j),tmp.minDistance+grafo[p][j],tmp);
                // si no está en la cola de prioridad, lo agrega
                if(!cola.contains(nod)) {
                    cola.add(nod);
                    continue;
                }
                // si ya está en la cola de prioridad actualiza la distancia menor
                for(Vertex x: cola) {
                    // si la distancia en la cola es mayor que la distancia calculada
                    if(x.name==nod.name && x.minDistance > nod.minDistance) {
                        cola.remove(x); // remueve el nodo de la cola
                        cola.add(nod);  // agrega el nodo con la nueva distancia
                        break;          // no sigue revisando
                    }
                }
            }
        }
    }
 
    // verifica si un nodo ya está en lista de terminados
    Vertex c = new Vertex(longitudMasCorta);
    public boolean estaTerminado(int j) {
    	Vertex tmp = new Vertex(c.path.get(j).name);
        return listos.contains(tmp);
    }
 
    // encontrar la ruta mínima por fuerza bruta
    public void encontrarRutaMinimaFuerzaBruta(char inicio, char fin) {
    	Graph a = new Graph(longitudMasCorta);
        int p1 = a.posicionNodo(inicio);
        int p2 = a.posicionNodo(fin);
        // cola para almacenar cada ruta que está siendo evaluada
        Stack<Integer> resultado = new Stack<Integer>();
        resultado.push(p1);
        recorrerRutas(p1, p2, resultado);
    }
 
    // recorre recursivamente las rutas entre un nodo inicial y un nodo final
    // almacenando en una cola cada nodo visitado
    private void recorrerRutas(int nodoI, int nodoF, Stack<Integer> resultado) {
        // si el nodo inicial es igual al final se evalúa la ruta en revisión
        if(nodoI==nodoF) {
            int respuesta = evaluar(resultado);
            if(respuesta < longitudMasCorta) {
                longitudMasCorta = respuesta;
                rutaMasCorta     = "";
                for(int x: resultado) rutaMasCorta+=(c.path.get(x)+" ");
            }
            return;
        }
        // Si el nodoInicial no es igual al final se crea una lista con todos los nodos
        // adyacentes al nodo inicial que no estén en la ruta en evaluación
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
 
   /* public static void main(String[] args) {
        Graph g = new Graph(4);
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
=======
   
    public void PrintGraph(Graph g){
     	// Print the minimum Distance.
	for(Vertex v:g.getVertices()){
	System.out.print("Vertex - "+v.name+" , Dist - "+ v.minDistance+" , Path - ");
	for(Vertex pathvert:v.path) {
        System.out.print(pathvert+" ");
			}
	System.out.println(""+v.name);
		}
	
            
            
            
            
        }

	public void calculate(Vertex source){
		// Algo:
		// 1. Take the unvisited node with minimum weight.
		// 2. Visit all its neighbours.
		// 3. Update the distances for all the neighbours (In the Priority Queue).
		// Repeat the process till all the connected nodes are visited.
		
		source.minDistance = 0;
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		queue.add(source);
		
		while(!queue.isEmpty()){			
			Vertex u = queue.poll();		
			for(Edge neighbour:u.neighbours){
				Double newDist = u.minDistance+neighbour.weight;
				
				if(neighbour.target.minDistance>newDist){
					// Remove the node from the queue to update the distance value.
					queue.remove(neighbour.target);
					neighbour.target.minDistance = newDist;
										
					// Take the path visited till now and add the new node.s
					neighbour.target.path = new LinkedList<Vertex>(u.path);
					neighbour.target.path.add(u);
					
					//Reenter the node with new distance.
					queue.add(neighbour.target);					
				}
			}
		}
	}
>>>>>>> 63dfd37489cd67c9e412bb5aa387f078c47d885e
    
    }*/
}
