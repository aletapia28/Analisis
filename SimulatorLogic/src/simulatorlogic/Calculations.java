/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatorlogic;
import simulatorlogic.Constants;
        
/**
 *
 * @author aleta
 */
public class Calculations {
    
    
       
    public int getCapacity(int  ROAD_WIDTH, int ROAD_HIGH, int DRONE_NUMBER){
        
  
        int capacidad =  ROAD_WIDTH / Constants.DRONE_WIDTH;  
        
        return capacidad;
    }
    
}
