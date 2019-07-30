package com.bootcamp.ejercicio1.core.characters;

public class Elfo extends Personaje {
    private int ataque;
    private int agilidad;
    private int defensa;
    private int magia;
    private int vida ;

    private String nombre;
    private int edad;
    private char sexo;

    public Elfo(String nombre, int edad, char sexo) {
        setNombre(nombre);
		setEdad(edad);
		setSexo(sexo);
		setVida(6);
		setAgilidad(8);
		setDefensa(4);
		setMagia(8);
		setAtaque(4);
    }
}