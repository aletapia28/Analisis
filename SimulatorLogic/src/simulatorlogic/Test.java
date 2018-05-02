/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatorlogic;

import java.util.HashMap;

/**
 *
 * @author Víctor Alonso
 */
public class Test {
    HashMap<Integer,HashMap<Integer, Integer>>Timeline;
    public Test(){
        Timeline=new HashMap<Integer,HashMap<Integer,Integer>>();
    }
    public void crearSlot(int slots, HashMap<Integer,Integer>relacion){
        Timeline.put(slots, relacion);
    }
    public HashMap<Integer, Integer> getSlots(int slots){
        return Timeline.get(slots);
    }   

public static void main(String[] args) {    
        Test t1 =new Test();
        int [] slots = {1,2,3,4,5,6,67,9};
        HashMap<Integer,Integer> aux = new HashMap<Integer,Integer>();
        aux.put(1,0);
        aux.put(2,0);
        aux.put(3,0);
        aux.put(4,0);
 //       t1.crearSlot(2,aux); 
    }    
}
