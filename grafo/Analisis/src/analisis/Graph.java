/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisis;

import java.util.List;
/**
 *
 * @author ariel
 */
public class Graph {
    private static List<Vertex> vertexes;
    private static List<Edge> edges;

    public Graph(List<Vertex> vertexes1, List<Edge> edges1) {
        vertexes = vertexes1;
        edges = edges1;
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public List<Edge> getEdges() {
        return edges;
    }
}
