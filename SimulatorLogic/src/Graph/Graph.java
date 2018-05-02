/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.*;
import simulatorlogic.Constants;


/**
 *
 * @author ariel
 */
public class Graph {
    private ArrayList<Vertex> vertices;
    
    
	public Graph(int numberVertices){
		vertices = new ArrayList<Vertex>(numberVertices);
		for(int i=0;i<numberVertices;i++){
			String n = "N"+i;
			//System.out.println(name);
			int name = Constants.N1.name;
			int x=Constants.N1.xpos;
			int y= Constants.N10.ypos;
			
			
			vertices.add(new Vertex(1,2,3));
		}
	}
	

	
	public Graph (ArrayList <Vertex> vertexs) {
		
		
	}

	
	public void addEdge(int src, int dest, int weight){
		Vertex s = vertices.get(src);
		Edge new_edge = new Edge(vertices.get(dest),weight);
		s.neighbours.add(new_edge);
	}
	
	public ArrayList<Vertex> getVertices() {
		return vertices;
	}
	
	public Vertex getVertex(int vert){
		return vertices.get(vert);
	}
}

