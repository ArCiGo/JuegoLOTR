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

    public Personaje(int vida, int agilidad, int defensa, int magia, int ataque, String nombre, int edad, char sexo) {
        this.vida = vida;
        this.agilidad = agilidad;
        this.defensa = defensa;
        this.magia = magia;
        this.ataque = ataque;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public int ataque() {
        int ataqueTotal = this.ataque + this.magia;

        return ataqueTotal;
    }

    public Personaje[] ataque(Personaje... personaje) {
        int ataqueTotal = this.ataque();

        for(Personaje item : personaje) {
            if(item.vida <= 0) {
                System.out.println("El personaje: " + item.nombre + " está muerto");
            } else {
                item.defender(ataqueTotal, this);

                System.out.println("Se atacó al personaje: " + item.nombre);
                System.out.println("Vida restante: " + item.vida);
            }
        }

        return personaje;
    }

    public void defender(int ataqueTotal, Personaje personajeA) {
        int defensaTotal = this.defensa + this.agilidad;

        this.vida = this.vida - (ataqueTotal - defensaTotal);

        if(this.vida <= 0) {
            System.out.println("El personaje: " + this.nombre + " murió");
        }
    }

    public String toString() {
        return "Vida: " + vida + ", Agilidad: " + agilidad + ", Defensa" + defensa + ", Magia: " + magia +
        ", Ataque: " + ataque + ", Nombre: " + nombre + ", Edad: " + edad + ", Sexo: " + sexo; 
    }

    // first approach approved by Diego
    /*public Personaje[] ataque(Personaje... personaje) {
        for(int i = 0; i < personaje.length; i ++) {
            personaje[i].defender(this);
        }

        return personaje;
    }

    public void defender(Personaje personajeA) {
        int defensaTotal = this.defensa + this.agilidad;

        this.vida = this.vida - defensaTotal - personajeA.ataque + personajeA.magia ;
    }*/
}