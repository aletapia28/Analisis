/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;

/**
 *
 * @author ariel
 */
public class grafo {
    HashMap<Character,HashMap<Character,Integer>>Grafo;
    public grafo(){
        Grafo=new HashMap<Character,HashMap<Character,Integer>>();
    }
    public void crearVertice(char vertice, HashMap<Character,Integer>relacion){
        Grafo.put(vertice, relacion);
    }
    public HashMap<Character, Integer> getVertice(char vertice){
        return Grafo.get(vertice);
    }
}
