package simulatorlogic;

import java.util.ArrayList;

import Graph.Edge;
import Graph.Graph;
import Graph.Vertex;


public class GraphGenerator {
		private Graph graph;
		//private final ArrayList< Vertex> Stations;
		//private final ArrayList <Edge> Edge;
		//private  int Stations = 2;
		
		
		
		public GraphGenerator() {
			//this.Stations = new ArrayList<Vertex>();
		//	this.Edges= new ArrayList<Edge>();
			this.graph= new Graph(Constants.STATIONS_NUMBER);
			ModifyDistance(graph);
			
		}
		
		public void CreateStations() {
			ArrayList <Vertex> Stations = new ArrayList <Vertex>() ;
			
			
		
			
		}
		
		
		public void ModifyDistance(Graph g) {
			 Vertex v = g.getVertex(10);
			 int ve= v.name;
			 System.out.println(ve);
			
		}
	//	 graph.addEdge(0, 1, 4); g.addEdge(0, 7, 8);
		
}
