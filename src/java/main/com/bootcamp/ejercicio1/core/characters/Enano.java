package com.bootcamp.ejercicio1.core.characters;

public class Enano {
    public int ataqueEnano = 8;
    public int agilidadEnano = 4;
    public int defensaEnano = 6;
    public int magiaEnano = 4;
    public int vidaEnano = 6;

    public String nombreEnano;

    public Enano(String nombreEnano) {
        this.nombreEnano = nombreEnano;
    }

    public String getDwarfName() {
        return this.nombreEnano;
    }
}