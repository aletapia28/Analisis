package controller;
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
    public boolean ocupated(int station, int slot){
        if(timeline.get(station).get(slot)==1){
            return true;
        }
        else{
            return false;
        }
    }
}
