/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatorlogic;
import Graph.Dijkstra;
import Graph.Graph;
import java.util.HashMap;
import simulatorlogic.Constants;

/**
 * 
 *
 * @author ariel
 */
public class SimulatorLogic {
    
     public static void main(String[] args) {
      
   
       Calculations c = new Calculations();
       c.getCapacity(Constants.ROAD_WIDTH, Constants.ROAD_HIGH, Constants.DRONE_NUMBER);
       //int a= c.getCapacity(Constants.ROAD_WIDTH, Constants.ROAD_HIGH, Constants.DRONE_NUMBER);
       // System.out.println(a);
       //c.getTravelNumbers(Constants.DRONE_NUMBER);
       
       Dijkstra obj = new Dijkstra();
		
	// Create a new graph.
	Graph g = new Graph(9);
		
	// Add the required edges.
        g.addEdge(0, 1, 4); g.addEdge(0, 7, 8);
	g.addEdge(1, 2, 8); g.addEdge(1, 7, 11); g.addEdge(2, 1, 8);
	g.addEdge(2, 8, 2); g.addEdge(2, 5, 4); g.addEdge(2, 3, 7);
	g.addEdge(3, 2, 7); g.addEdge(3, 5, 14); g.addEdge(3, 4, 9); 
	g.addEdge(4, 3, 9); g.addEdge(4, 5, 10); 
	g.addEdge(5, 4, 10); g.addEdge(5, 3, 9); g.addEdge(5, 2, 4); g.addEdge(5, 6, 2);
	g.addEdge(6, 7, 1); g.addEdge(6, 8, 6); g.addEdge(6, 5, 2);
	g.addEdge(7, 0, 8); g.addEdge(7, 8, 7); g.addEdge(7, 1, 11); g.addEdge(7, 6, 1);
	g.addEdge(8, 2, 2); g.addEdge(8, 7, 7); g.addEdge(8, 6, 6);
                
        obj.calculate(g.getVertex(8));
        obj.PrintGraph(g);
        
        
        
    
        
    }
    
}
