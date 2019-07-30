package com.bootcamp.ejercicio1.app;

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

        /*Personaje personaje1 = new Personaje(6, 6, 6, 6, 6, "Armando", 27, 'H');
        Personaje personaje2 = new Personaje(6, 4, 6, 4, 9, "Eduardo", 18, 'H');
        Personaje personaje3 = new Personaje(6, 6, 5, 8, 6, "Paola", 25, 'M');

        // Creating a new character equals to personaje3
        Personaje personaje4 = new Personaje(6, 6, 5, 8, 6, "Paola", 25, 'M');

        // Testing toString() method
        System.out.println(personaje2);*/

        // Testing equals() method
        /*boolean igual = personaje3.equals(personaje4);
        System.out.println("¿personaje3 = personaje4?: " + igual);

        igual = personaje3.equals(personaje1);
        System.out.println("¿personaje3 = personaje1?: " + igual);

        igual = personaje3.equals(personaje3);
        System.out.println("¿personaje3 = personaje43: " + igual);

        personaje1.ataque(personaje2, personaje3);
		personaje2.ataque(personaje1, personaje3);
		personaje3.ataque(personaje2, personaje1);
        personaje1.ataque(personaje2);*/
        
        IniciarJuego ini1 = new IniciarJuego();
        Personaje per1 = ini1.crearPersonaje("Humano", "Mago", "Armando", 27, 'H');

        IniciarJuego ini2 = new IniciarJuego();
        Personaje per2 = ini2.crearPersonaje("Humano", "Guerrero", "Jesús", 21, 'H');

        IniciarJuego ini3 = new IniciarJuego();
        Personaje per3 = ini3.crearPersonaje("Elfo", "Mago", "Paola", 21, 'M');

        per1.ataque(per2, per3);
        per2.ataque(per1, per3);
        per3.ataque(per2, per1);
        per1.ataque(per2);

        System.out.println("Finalizó el juego");
    }
}