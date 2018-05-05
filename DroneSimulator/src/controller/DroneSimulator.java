/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Algorithm;
import model.Dijkstra;
import model.Graph;
import java.util.HashMap;
import controller.Constants;
import controller.GraphGenerator;
import controller.Calculations;

/**
 * 
 *
 * @author ariel
 */
public class DroneSimulator {
    
     public static void main(String[] args) {
      
   
       Calculations c = new Calculations();
       c.getCapacity(Constants.ROAD_WIDTH, Constants.ROAD_HIGH, Constants.DRONE_NUMBER);
       c.getSlots();
       
<<<<<<< HEAD
       Graph g1 = new Graph(9);
       Dijkstra obj = new Dijkstra();
       g1.addEdge(0, 1, 4); g1.addEdge(0, 7, 8);
   	g1.addEdge(1, 2, 8); g1.addEdge(1, 7, 11); g1.addEdge(2, 1, 8);
   	g1.addEdge(2, 8, 2); g1.addEdge(2, 5, 4); g1.addEdge(2, 3, 7);
   	g1.addEdge(3, 2, 7); g1.addEdge(3, 5, 14); g1.addEdge(3, 4, 9); 
   	g1.addEdge(4, 3, 9); g1.addEdge(4, 5, 10); 
   	g1.addEdge(5, 4, 10);g1.addEdge(5, 3, 9); g1.addEdge(5, 2, 4); g1.addEdge(5, 6, 2);
   	g1.addEdge(6, 7, 1); g1.addEdge(6, 8, 6); g1.addEdge(6, 5, 2);
   	g1.addEdge(7, 0, 8); g1.addEdge(7, 8, 7); g1.addEdge(7, 1, 11); g1.addEdge(7, 6, 1);
   	g1.addEdge(8, 2, 2); g1.addEdge(8, 7, 7); g1.addEdge(8, 6, 6);
       obj.calculate(g1.getVertex(8));
       obj.PrintGraph(g1);

=======
      // GraphGenerator g= new GraphGenerator();
  //   c.getTravelNumbers(Constants.DRONE_NUMBER);
       
       Graph g = new Graph(Constants.STATIONS_NUMBER);
       Dijkstra obj = new Dijkstra();
       obj.calculate(g.getVertex(1));
      // obj.PrintGraph(g);
>>>>>>> dev
       
       
       Algorithm nuevo = new Algorithm();
       nuevo.GenerateTravelList();
       
       
       


      



    }
    
}
