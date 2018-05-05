/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.*;

/**
 *
 * @author 
 */
public class Vertex implements Comparable<Vertex>{
    public final int name;
    public int xpos=0;
    public int ypos=0;
    public int EdgeNumber=0;
    
    public ArrayList<Edge> neighbours;
    public LinkedList<Vertex> path;
    public double minDistance = Double.POSITIVE_INFINITY;
    public Vertex previous;
    Vertex procedencia = null;
    public int compareTo(Vertex other){
		return Double.compare(minDistance,other.minDistance);		
	}
	public Vertex(int name){
		this.name = name;
		neighbours = new ArrayList<Edge>();
		path = new LinkedList<Vertex>();         
	}
       /* public Vertex(int name,int x,int y){
		this.name = name;
		neighbours = new ArrayList<Edge>();
		path = new LinkedList<Vertex>();
                this.xpos=x;
                this.ypos=y;
	}*/
        
        Vertex(int x, double d, Vertex p) { name=x; minDistance=d; procedencia=p; }
		
		public int getXpos() {
			return xpos;
		}
		public void setXpos(int xpos) {
			this.xpos = xpos;
		}
		public int getYpos() {
			return ypos;
		}
		public void setYpos(int ypos) {
			this.ypos = ypos;
		}
		public int getName() {
			return name;
		}

}
