/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pista;

/**
 *
 * @author aleta
 */
public class Pista {
    private int ancho;
    private int largo;
    
    
    
    
    public Pista(){
        this.ancho=0;
        this.largo=0;
    }
    
   public Pista(int anchoPista ,int largoPista){
       this.ancho= anchoPista;
       this.largo= largoPista;
   }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }
      
    
}


