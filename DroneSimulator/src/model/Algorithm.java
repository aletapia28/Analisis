package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;


import controller.Constants;
import controller.Timeline;
import controller.Calculations;

public class Algorithm {


	protected int Totaltime;
	public ArrayList<travel> travels;
	
	public Algorithm() {
		this.travels = new ArrayList<travel>();
	}
	

	
    public void GenerateTravelList() {

    	Calculations c= new Calculations();
    	for(int i=0; i< c.getTravelNumbers(Constants.DRONE_NUMBER);i++) {
    	int origen = (int) (Math.random() * Constants.STATIONS_NUMBER) ;
        int destino = (int) (Math.random() * Constants.STATIONS_NUMBER);
     //   System.out.println(destino);
      //  System.out.println(i);
        travel t = new travel(origen,destino);
        travels.add(t);
        System.out.println(t.Origen+","+t.Destino);
        
        
        
        
    }
    	GenerateTimeLine();
    }
    
    
    public void GenerateTimeLine() {
    	Calculations c = new Calculations();
    	Timeline timeline  = new Timeline();
    	int slots = c.getSlots();
    	
        for(int i=0;i<Constants.STATIONS_NUMBER;i++){
            HashMap<Integer,Integer>aux=new HashMap<Integer,Integer>();
            for(int y=0;y<slots; y++){ //monto de slots getslots
                aux.put(y,0);
            }
            timeline.madeSlot(i, aux);
            
        }     
        
        for(int i=0;i<Constants.STATIONS_NUMBER;i++){
            System.out.print(i+ "->" +timeline.getSlot(i)+"\n");
        }
         
        
 
        
        
        
        
        
    }
    
    
    
    
    
    }
    
    

	

	
		
	




	
	

	
	
