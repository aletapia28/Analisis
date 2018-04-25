/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author aleta
 */
public class Node {
    public String Nombre;
    public ArrayList <Node> vecinos;
    
     public Node(String id) {
        this.Nombre = id;
        this.vecinos = new ArrayList<>();
}

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Node> getVecinos() {
        return vecinos;
    }

    public void setVecinos(ArrayList<Node> vecinos) {
        this.vecinos = vecinos;
    }
     
    
}
