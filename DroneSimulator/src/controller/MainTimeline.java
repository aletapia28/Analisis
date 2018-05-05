package controller;

import java.util.ArrayList;
import controller.Constants;
import controller.Calculations;
import java.util.HashMap;

public class MainTimeline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Timeline timeline  = new Timeline();
        int cantidad = Constants.STATIONS_NUMBER;
        
        
        for(int i=0;i<cantidad;i++){
            HashMap<Integer,Integer>aux=new HashMap<Integer,Integer>();
            for(int y=0;y< 100; y++){
                aux.put(y,0);
            }
            timeline.madeSlot(i, aux);
        }
        
        
        int[] ruta1= {1,3,4};
        int[] ruta2= {4,3,5};
        int[] ruta5= {5,1};
        
        ArrayList<int[]> rutas = new ArrayList<int[]>();
        rutas.add(ruta1);
        rutas.add(ruta2);
        rutas.add(ruta5);
        
        for(int j=0;j<rutas.size();j++){
            for(int z=0;z<rutas.get(j).length;z++){
                System.out.print(rutas.get(j)[z]);
            }
            System.out.print("\n");
        }
        
        for(int todasrutas=0;todasrutas<rutas.size();todasrutas++){
            for(int ruta=0;ruta<rutas.get(todasrutas).length;ruta++){
                if(timeline.ocupated(rutas.get(todasrutas)[0], 0)==false){
                
                	timeline.updateSlot(rutas.get(todasrutas)[0],0);
                }
                
            }
        }
        timeline.updateSlot(5, 4);
        timeline.updateSlot(1, 20);
        
        for(int i=0;i<cantidad;i++){
            System.out.print(i+ "->" +timeline.getSlot(i)+"\n");
        }
        System.out.print(timeline.getSlot(0)+"\n");
        if(timeline.ocupated(5,4)==true){
            System.out.print("Esta Ocupado");
        }
        else{
            System.out.print("No esta");
        }
	}

}
