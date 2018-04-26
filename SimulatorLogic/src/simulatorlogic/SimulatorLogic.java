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
 * @author ariel
 */
public class SimulatorLogic {
    
    

    
    
    public static void main(String[] args) {
      
   
        Calculations c = new Calculations();
        c.getCapacity(Constants.ROAD_WIDTH, Constants.ROAD_HIGH, Constants.DRONE_NUMBER);
        int a= c.getCapacity(Constants.ROAD_WIDTH, Constants.ROAD_HIGH, Constants.DRONE_NUMBER);
        System.out.println(a);
        
        grafo g = new grafo();
        char[]vertices={'a','b','c'};
        
        HashMap<Character,Integer>aux=new HashMap<Character,Integer>();
        aux.put('b',4);
        aux.put('c',2);
        g.crearVertice('a', aux);
        
        aux=new HashMap<Character,Integer>();
        aux.put('c', 6);
        g.crearVertice('b', aux);
        
        aux=new HashMap<Character,Integer>();
        aux.put('a', 6);
        g.crearVertice('c', aux);
        
        for(int i=0;i<vertices.length;i++){
            System.out.print(vertices[i]+ "-|>" +g.getVertice(vertices[i])+"\n");
        }
    }
    
}
