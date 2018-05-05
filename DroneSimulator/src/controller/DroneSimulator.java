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
       
      // GraphGenerator g= new GraphGenerator();
  //   c.getTravelNumbers(Constants.DRONE_NUMBER);
       
       Graph g = new Graph(Constants.STATIONS_NUMBER);
       Dijkstra obj = new Dijkstra();
       obj.calculate(g.getVertex(1));
      // obj.PrintGraph(g);
       
       
       Algorithm nuevo = new Algorithm();
       nuevo.GenerateTravelList();
       
       
       


      



    }
    
}
