/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;
import controller.Constants;
import controller.GraphGenerator;


/**
 *
 * @author
 */
public class Graph {
    private ArrayList<Vertex> vertices;
    
    
	public Graph(int numberVertices){
		vertices = new ArrayList<Vertex>(numberVertices);
		for(int i=0;i<numberVertices;i++){
			//vertices.add(Constants.N1);
			vertices.add(new Vertex(i));
<<<<<<< HEAD
			System.out.println(vertices.get(i).name);
=======
			
			
			//System.out.println(vertices.get(i).name);
>>>>>>> dev
		}
		for (int j=0; j< numberVertices;j++) {
			GenerateEdge(j);
		}
		
	}
	
<<<<<<< HEAD
	public int posicionNodo(int nodo) {
        for(int i=0; i<vertices.size(); i++) {
            if(vertices.get(i).name ==nodo) return i;
        }
        return -1;
    }

=======
	
	
	
	
//	public Graph (ArrayList <Vertex> vertexs) {		
	
//	}
>>>>>>> de81ceeb24127ef3210eac70fb215c62f733fb04

	
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
	
	
	public void GenerateEdge( int Origin) {
		
		Vertex v= getVertex(Origin);
		//System.out.println(v.name);
		
				
		for (int i=0; i< Constants.EDGE_NUMBER; i++) {
			if (v.EdgeNumber <= Constants.EDGE_NUMBER) {
				//System.out.println("ENTRO");
				// hay que saber cual es la ruta mas corta y su peso
				int origin=Origin;
				int destination=(int) (Math.random() * Constants.STATIONS_NUMBER) ; //Dikstra 
				int weight=(int) (Math.random() * 100) ; //CalculateWeight( origin, destination);	
				//System.out.println(origin);
				//System.out.println(destination);
				//System.out.println(weight);
				addEdge(origin, destination, weight);
				v.EdgeNumber++;
				
			}
		}
	}
	
	
	
	public int CalculateWeight( int origin, int destination) {
		
		int Weigth=0;		
		
		Weigth= (int) Math.sqrt(Math.abs(getVertex(origin).xpos+getVertex(destination).xpos)
				+ Math.abs(getVertex(origin).ypos + getVertex(destination).ypos)) ;
					  
		return Weigth;
		
	}
	
	
}

