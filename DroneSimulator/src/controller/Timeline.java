package controller;
import controller.Calculations;
import model.travel;

import java.util.ArrayList;
import java.util.HashMap;

public class Timeline {
	HashMap<Integer,HashMap<Integer,Integer>>timeline;
	
	public Timeline() {
		timeline=new HashMap<Integer,HashMap<Integer,Integer>>();
	}
	
	public void madeSlot(int vertice, HashMap<Integer,Integer>relacion){
        timeline.put(vertice, relacion);
    }
	
	
    public HashMap<Integer, Integer> getSlot(int vertice){
        return timeline.get(vertice);
    }
    public void updateSlot(int station, int slot){
        if(timeline.get(station).get(slot)==0){
            timeline.get(station).replace(slot, 1);
        }
        else{
            timeline.get(station).replace(slot, 0);
        }
    }
    
//    public void GenerateTimeLine(ArrayList<int[]> rutas) {
//    	Calculations c = new Calculations();
//    	int slots = c.getSlots();
//        for(int i=0;i<Constants.STATIONS_NUMBER;i++){
//            HashMap<Integer,Integer>aux=new HashMap<Integer,Integer>();
//            for(int y=0;y<slots; y++){ //monto de slots getslots
//                aux.put(y,0);
//            }
//            madeSlot(i, aux);
//            
//        }
//        
//        for(int todasrutas=0;todasrutas<rutas.size();todasrutas++){
//            for(int ruta=0;ruta<rutas.get(todasrutas).length;ruta++){
//                if(ocupated(rutas.get(todasrutas)[0], 0)==false){
//                   updateSlot(rutas.get(todasrutas)[0],0);
//                }
//            }
//            
//        }
//        
//        
//        for(int i=0;i<Constants.STATIONS_NUMBER;i++){
//            System.out.print(i+ "->" +getSlot(i)+"\n");
//        }
//        
//        
//        
//        
//    }
//    
    
    public boolean ocupated(int station, int slot){
        if(timeline.get(station).get(slot)==1){
            return true;
        }
        else{
            return false;
        }
    }
}
