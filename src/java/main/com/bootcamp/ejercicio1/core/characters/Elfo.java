package com.bootcamp.ejercicio1.core.characters;

public class Elfo {
    public int ataqueElfo = 4;
    public int agilidadElfo = 8;
    public int defensaElfo = 8;
    public int magiaElfo = 8;
    public int vidaElfo = 6;

    public String nombreElfo;

    public Elfo(String nombreElfo) {
        this.nombreElfo = nombreElfo;
    }

    public String getElfName() {
        return this.nombreElfo;
    }
}