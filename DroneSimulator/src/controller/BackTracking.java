package controller;

public class BackTracking {
	public void resolverProblemaBT(int posicion) {
        double  pesoMochila=getPeso(tmpMochila);    // peso de la solucion temporal
        double valorMochila=getValor(tmpMochila);   // valor de la solucion temporal
 
        if( posicion>=almacen.size() ) {            // si ya se tuvieron en cuenta todos los elementos
            if(valorMochila>valorMaximo) {          // si el valor es mayor que el máximo anterior
                valorMaximo=valorMochila;           // se actualiza el valor mayor
                mochila.clear();
                mochila.addAll(tmpMochila);
            }
            return;
        }
        Elemento e = almacen.get(posicion);
        // Si el elemento se puede agregar, se envía a la mochila temporal
        if(pesoMochila + e.peso <= pesoMaximo) {
                tmpMochila.add(e);                  // Se agrega a la mochila temporal
                resolverProblemaBT(posicion+1);     // se revisa para el siguiente elemento
                tmpMochila.remove(e);               // Se retira el elemento
        }
        // Si no se pudo agregar, o ya se agregó y se retiró, se revisa para el siguiente
        resolverProblemaBT(posicion+1);
    }
 
    double getPeso(List<Elemento> tmp) {
        double respuesta=0;
        for(Elemento e: tmp) respuesta+=e.peso;
        return respuesta;
    }
 
    double getValor(List<Elemento> tmp) {
        double respuesta=0;
        for(Elemento e: tmp) respuesta+=e.valor;
        return respuesta;
    }
    
    public static void main(String[] args) {
        ProblemaMochila pm = new ProblemaMochila(20);
        pm.resolverProblemaBT(0);       // Inicia en el primer elemento disponible
        pm.mostrarMochila();
    }
    
}

