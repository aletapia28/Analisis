/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import controller.Constants;


/**
 *
 * @author ariel
 */
public class Graph {
    private ArrayList<Vertex> vertices;
    
    
	public Graph(int numberVertices){
		vertices = new ArrayList<Vertex>(numberVertices);
		for(int i=0;i<numberVertices;i++){
			vertices.add(new Vertex(i));
			//System.out.println(vertices.get(i).name);
		}
	}
	
	
//	public Graph (ArrayList <Vertex> vertexs) {		
	
//	}

	
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
	
	
	public void GenerateEdge(Graph g, int Origin) {
		// ver cual es la distancia mas corta
		// ver si ya tiene min de arcos
		//si no agrega uno mas
		
		
		Vertex v= g.getVertex(Origin);
		for (int i=0; i<= Constants.EDGE_NUMBER; i++) {
			//if (v.)
			System.out.println(v.name);
		}
		
		//if (v.EdgeNumber <= Constants.EDGE_NUMBER) {
			// ver cuales son los vecinos cercanos
			// cual lista es la que lo tiene? victor
			
	//	}
		
	}
}

