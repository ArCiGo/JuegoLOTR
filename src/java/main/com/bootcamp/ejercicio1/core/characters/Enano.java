package com.bootcamp.ejercicio1.core.characters;

public class Enano extends Personaje {
    private int ataque;
    private int agilidad;
    private int defensa;
    private int magia;
    private int vida ;

    private String nombre;
    private int edad;
    private char sexo;

    public Enano(String nombre, int edad, char sexo) {
        setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
		setVida(6);
		setAgilidad(4);
		setDefensa(6);
		setMagia(4);
		setAtaque(8);
    }
}