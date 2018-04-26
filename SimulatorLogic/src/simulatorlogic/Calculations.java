/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatorlogic;
import java.util.HashMap;
import simulatorlogic.Constants;
        
/**
 *
 * @author aleta
 */
public class Calculations {
    
    
       
    public int getCapacity(int  ROAD_WIDTH, int ROAD_HIGH, int DRONE_NUMBER){
        
        int WidthCapacity=0,tracks=0, StationCapacity=0;
        
        WidthCapacity =  ROAD_WIDTH / Constants.DRONE_WIDTH; //Saca la cantidad de drones que caben en el ancho de la pista        
        tracks=  1000/ROAD_WIDTH ; // cantidad de pistas que caben en el kilometro
        StationCapacity = tracks* WidthCapacity; // cantidad de drones con todas las pistas
        
        System.out.println(WidthCapacity);
        
                
        return WidthCapacity;
    }
    
    
    public int getTimeSlots (){
        int slots=0; 
        
        return slots;
    }
    
    public int getTravelNumbers(int TravelNumbers){// NUMERO DE VIAJES
        
        int capacity = getCapacity(Constants.ROAD_WIDTH, Constants.ROAD_HIGH, Constants.DRONE_NUMBER);
        int SendsNumber = TravelNumbers/ capacity;
        System.out.print(capacity);
        
                
        return SendsNumber;
    }
            
    
    public int getTimeStation(int weight, int OriginStation, int ArrivalStation, HashMap<String, Float> distancias){// tiempo que se necesita de una estación a otra
       
        int a=0;
        return a;
    }
}

