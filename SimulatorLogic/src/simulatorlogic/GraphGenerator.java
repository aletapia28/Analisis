package simulatorlogic;

import java.util.ArrayList;

import Graph.Edge;
import Graph.Graph;
import Graph.Vertex;


public class GraphGenerator {
		private Graph graph;
		//private final ArrayList< Vertex> Stations1;
		//private final ArrayList <Edge> Edge;
		//private  int Stations = 2;
		
		
		
		public GraphGenerator() {
		//	this.Stations = new ArrayList<Vertex>();
	//		this.Edges= new ArrayList<Edge>();
			this.graph= new Graph(Constants.STATIONS_NUMBER);
			ModifyDistance(graph);
			
		}
		
		public void CreateStations() {
			ArrayList <Vertex> Stations = new ArrayList <Vertex>() ;
		
			
		}
		
		
		public void ModifyDistance(Graph g) {
			for(int i =0; i<= Constants.STATIONS_NUMBER; i++) {
					
				Vertex v = g.getVertex(i);
			 	v.xpos=Constants.N1.xpos;
			 	v.ypos=2;
			 	
			}
		}
		
		public double CalculateWeight(Graph g, int origin, int destination) {
			
			double Weigth=0;		
			
			Weigth= Math.sqrt(Math.abs(g.getVertex(origin).xpos+g.getVertex(destination).xpos)
					+ Math.abs(g.getVertex(origin).ypos + g.getVertex(destination).ypos)) ;
						  
			
			return Weigth;
		
			
			
		}
		
		public void GenerateEdge(Graph g, int Origin) {
			// ver cual es la distancia mas corta
			// ver si ya tiene min de arcos
			//si no agrega uno mas
			
			Vertex v=g.getVertex(Origin);
			if (v.EdgeNumber <= Constants.EDGE_NUMBER) {
				// ver cuales son los vecinos cercanos
				
			}
			
		}
		
		
		
		
		
	//	 graph.addEdge(0, 1, 4); g.addEdge(0, 7, 8);
		
}
