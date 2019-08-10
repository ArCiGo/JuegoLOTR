package com.bootcamp.ejercicio1.core.weapons;

public class Arco extends Arma implements LargoAlcance {
    
    private int flecha;
    private int carcaj = 30;

    public Arco(int flecha) {
        this.flecha= flecha;
    }
    
    public int getCarcaj(){
        return carcaj;
    }
    public void setFlecha(int flecha) {
        this.flecha= flecha;
    }
    
    public getflecha() {
        return flecha;
    }
}