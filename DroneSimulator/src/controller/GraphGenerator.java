package controller;

import java.util.ArrayList;

import model.Edge;
import model.Graph;
import model.Vertex;


public class GraphGenerator {
		private Graph graph;
		//private final ArrayList< Vertex> Stations1;
		//private final ArrayList <Edge> Edge;
		//private  int Stations = 2;
		
		
		
		public GraphGenerator() {
		//	this.Stations = new ArrayList<Vertex>();
	//		this.Edges= new ArrayList<Edge>();
			this.graph= new Graph(Constants.STATIONS_NUMBER);
			graph.GenerateEdge(graph, 1);
			
			//GenerateEdge(graph, 1);
			//	ModifyDistance(graph);
			
		}
		
		
		public void CreateStations() {
			ArrayList <Vertex> Stations = new ArrayList <Vertex>() ;
					
		}
		
		
		public void ModifyDistance(Graph g) {
			for(int i =0; i<= Constants.STATIONS_NUMBER; i++) {
					
				
			//	Vertex v = g.getVertex(i);
				//int number = v.name;
				//System.out.println(number);
				
			 	//v.xpos=Constants.N1.xpos;
			 	//v.ypos=2;
			 	
			}
		}
		
		
		public double CalculateWeight(Graph g, int origin, int destination) {
			
			double Weigth=0;		
			
			Weigth= Math.sqrt(Math.abs(g.getVertex(origin).xpos+g.getVertex(destination).xpos)
					+ Math.abs(g.getVertex(origin).ypos + g.getVertex(destination).ypos)) ;
						  
			return Weigth;
			
			
			
		
			
			
		}
		
	
		
		
		
		
		
	//	 graph.addEdge(0, 1, 4); g.addEdge(0, 7, 8);
		
}
