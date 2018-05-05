/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.HashMap;
import controller.Constants;
        
/**
 *
 * @author aleta
 */
public class Calculations {
    
    
       
    public int getCapacity(int  ROAD_WIDTH, int ROAD_HIGH, int DRONE_NUMBER){ // numero de drones por pista
        
        int WidthCapacity=0, HighCapacity,  tracks=0, StationCapacity=0;        
        WidthCapacity =  ROAD_WIDTH / Constants.DRONE_WIDTH; //Saca la cantidad de drones que caben en el ancho de la pista  
        HighCapacity= ROAD_HIGH/ Constants.DRONE_HIGH;
        tracks=  1000/ROAD_WIDTH ; // cantidad de pistas que caben en el kilometro
        StationCapacity = (WidthCapacity*HighCapacity); // cantidad de drones por pista
        
        
     //  System.out.println("capacidad"+StationCapacity);
                        
        return StationCapacity;
    }
    
    public double getTimeSlots (){
    	double slot=0; 
        
        slot =  (0.025) *Constants.HOUR_SEC0NDS;
       
        
        return slot;
    }
    
    public int getSlots (){
        double slots=0; 
        
        slots = Constants.SIMULATION_TIME/ getTimeSlots();
        int a  = (int)slots;
      
        
        return a/100;
    }
    
    public int getTravelNumbers(int DroneNumbers){// NUMERO DE VIAJES osea 
        
        int capacity = getCapacity(Constants.ROAD_WIDTH, Constants.ROAD_HIGH, Constants.DRONE_NUMBER);
<<<<<<< HEAD
        
        int SendsNumber = DroneNumbers/ capacity;
        //System.out.print(SendsNumber);
        
                        
=======
        int SendsNumber = TravelNumbers/ capacity;                              
>>>>>>> victor
        return SendsNumber;
    }
    

            
    public int getTimeStation(int weight, int OriginStation, int ArrivalStation, HashMap<String, Float> distancias){// tiempo que se necesita de una estación a otra
       
        int a=0;
        return a;
    }
}

