package model;

public class NodoPrueba implements Comparable<NodoPrueba> {
    char id;
    int  distancia   = Integer.MAX_VALUE;
    NodoPrueba procedencia = null;
    NodoPrueba(char x, int d, NodoPrueba p) { id=x; distancia=d; procedencia=p; }
    NodoPrueba(char x) { this(x, 0, null); }
    public int compareTo(NodoPrueba tmp) { return this.distancia-tmp.distancia; }
    public boolean equals(Object o) {
        NodoPrueba tmp = (NodoPrueba) o;
        if(tmp.id==this.id) return true;
        return false;
    }
}