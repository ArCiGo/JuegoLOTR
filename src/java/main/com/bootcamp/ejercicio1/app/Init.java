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

        IniciarJuego iniciarJuego = IniciarJuego.getInstance();

        Personaje personaje1 = iniciarJuego.crearPersonaje("Humano", "Arquero", "Jesús", 27, 'H');
		Personaje personaje2 = iniciarJuego.crearPersonaje("Enano", "Guerrero", "Carlos", 20, 'H');
        Personaje personaje3 = iniciarJuego.crearPersonaje("Elfo", "Mago", "Mayra", 19, 'M');
        
        personaje1.ataque(personaje2, personaje3);
		personaje2.ataque(personaje1, personaje3);
		personaje3.ataque(personaje2, personaje1);
        personaje1.ataque(personaje2);
        
        System.out.println("Se acabó el juego");
    }
}