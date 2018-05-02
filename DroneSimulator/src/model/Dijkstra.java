/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.*;
//import simulatorlogic.Graph; 

/**
 *
 * @author ariel
 */
public class Dijkstra {
   
    public void PrintGraph(Graph g){
     	// Print the minimum Distance.
	for(Vertex v:g.getVertices()){
	System.out.print("Vertex - "+v+" , Dist - "+ v.minDistance+" , Path - ");
	for(Vertex pathvert:v.path) {
        System.out.print(pathvert+" ");
			}
	System.out.println(""+v);
		}
            
            
            
            
        }

	public void calculate(Vertex source){
		// Algo:
		// 1. Take the unvisited node with minimum weight.
		// 2. Visit all its neighbours.
		// 3. Update the distances for all the neighbours (In the Priority Queue).
		// Repeat the process till all the connected nodes are visited.
		
		source.minDistance = 0;
		PriorityQueue<Vertex> queue = new PriorityQueue<Vertex>();
		queue.add(source);
		
		while(!queue.isEmpty()){			
			Vertex u = queue.poll();		
			for(Edge neighbour:u.neighbours){
				Double newDist = u.minDistance+neighbour.weight;
				
				if(neighbour.target.minDistance>newDist){
					// Remove the node from the queue to update the distance value.
					queue.remove(neighbour.target);
					neighbour.target.minDistance = newDist;
					
					// Take the path visited till now and add the new node.s
					neighbour.target.path = new LinkedList<Vertex>(u.path);
					neighbour.target.path.add(u);
					
					//Reenter the node with new distance.
					queue.add(neighbour.target);					
				}
			}
		}
	}
    
}
