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
 * @author
 */
public class Graph {
    private ArrayList<Vertex> vertices;
    
    
	public Graph(int numberVertices){
		vertices = new ArrayList<Vertex>(numberVertices);
		for(int i=0;i<numberVertices;i++){
			
			vertices.add(new Vertex(i));
		}
	}
	

	public int posicionNodo(int nodo) {
        for(int i=0; i<vertices.size(); i++) {
            if(vertices.get(i).name ==nodo) return i;
        }
        return -1;
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

