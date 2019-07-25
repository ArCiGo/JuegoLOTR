package com.bootcamp.ejercicio1.core.characters;

public class Personaje {
    public int ataque;
    public int agilidad;
    public int defensa;
    public int magia;
    public int vida;

    public String nombre;
    public int edad;
    public char sexo;
    public static final int NUM_VIDAS_DEFAULT = 3;

    public Personaje[] ataque(Personaje... personaje) {
        for(int i = 0; i < personaje.length; i ++) {
            personaje[i].defender(this);
        }

        return personaje;
    }

    public void defender(Personaje personajeA) {
        int defensaTotal = this.defensa + this.agilidad;

        this.vida = this.vida - defensaTotal - personajeA.ataque + personajeA.magia ;
    }
}