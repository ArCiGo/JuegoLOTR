package com.bootcamp.ejercicio1.core.characters;

public class Humano {
    public int ataqueHumano = 6;
    public int agilidadHumano = 6;
    public int defensaHumano = 6;
    public int magiaHumano = 6;
    public int vidaHumano = 6;

    public String nombreHumano;

    public Humano(String nombreHumano) {
        this.nombreHumano = nombreHumano;
    }

    public String getHumanName() {
        return this.nombreHumano;
    }
}