package com.bootcamp.ejercicio1;

import com.bootcamp.ejercicio1.core.characters.Elfo;
import com.bootcamp.ejercicio1.core.characters.Enano;
import com.bootcamp.ejercicio1.core.characters.Humano;
import com.bootcamp.ejercicio1.core.characters.Personaje;

public class Init {
    public static void main(String args[]) {
        System.out.println("Bienvenido a mi juego");

        /*Humano humano1 = new Humano("Armando");
        Humano humano2 = new Humano("Jesús");

        Elfo elfo1 = new Elfo("Blanca");
        Elfo elfo2 = new Elfo("Paola");

        Enano enano1 = new Enano("Diego");
        Enano enano2 = new Enano("César");

        //humano1.nombreHumano = "Eduardo";

        System.out.println("El objeto humano1 se llama: " + humano1.getHumanName());
        System.out.println("Asignando el nombre desde la variable nombreHumano: " + humano1.nombreHumano);*/

        /***************** */

        Personaje personaje1 = new Personaje(6, 6, 6, 6, 6, "Armando", 27, 'H');
        Personaje personaje2 = new Personaje(6, 4, 6, 4, 9, "Eduardo", 18, 'H');
        Personaje personaje3 = new Personaje(6, 6, 5, 8, 6, "Paola", 25, 'M');

        personaje1.ataque(personaje2, personaje3);
        personaje2.ataque(personaje1, personaje3);
        personaje3.ataque(personaje2, personaje1);
        personaje1.ataque(personaje2);

        System.out.println("Finalizó el juego");
    }
}