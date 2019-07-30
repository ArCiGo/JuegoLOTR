package com.bootcamp.ejercicio1.core.characters;

import java.util.Map;

public class Personaje {

    /* attributes */

    private int ataque;
    private int agilidad;
    private int defensa;
    private int magia;
    private int vida;

    private String nombre;
    private int edad;
    private char sexo;
    private static final int NUM_VIDAS_DEFAULT = 3;

    /* constructor */

    public Personaje() {}

    /* setter and getters */

    public void setNombre(String nombre) {
        if(nombre.length() > 0 && nombre.length() <= 8) {
            this.nombre = nombre;
        } else {
            System.err.println("Nombre inválido. Escribe un nombre válido");
        }
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        if(edad > 10 && edad <= 150) {
            this.edad = edad;
        } else {
            System.err.println("Edad inválida. Escribe una edad válida");
        }
    }

    public int getEdad() {
        return this.edad;
    }

    public void setSexo(char sexo) {
        if((Character.toLowerCase(sexo) == 'm' || Character.toLowerCase(sexo) == 'h')) {
            this.sexo = sexo;
        } else {
            System.err.println("Sexo inválido. Escribe un sexo válido");
        }
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setVida(int vida) {
        if(vida > 0 && vida <= 100) {
            this.vida = vida;
        } else {
            System.err.println("Personaje muerto, o vida llena");
        }
    }

    public int getVida() {
        return this.vida;
    }

    public void setAgilidad(int agilidad) {
        if(agilidad > 0 && agilidad <= 50) {
            this.agilidad = agilidad;
        } else {
            System.err.println("El valor para agilidad es inválido");
        }
    }

    public int getAgilidad() {
        return this.agilidad;
    }

    public void setDefensa(int defensa) {
        if(defensa > 0 && defensa <= 50) {
            this.defensa = defensa;
        } else {
            System.err.println("El valor para defensa es inválido");
        }
    }

    public int getDefensa() {
        return this.defensa;
    }

    public void setMagia(int magia) {
        if(magia > 0 && magia <= 50) {
            this.magia = magia;
        } else {
            System.err.println("El valor para magia es inválido");
        }
    }

    public int getMagia() {
        return this.magia;
    }

    public void setAtaque(int ataque) {
        if(ataque > 0 && ataque <= 50) {
            this.ataque = ataque;
        } else {
            System.err.println("El valor para ataque es inválido");
        }
    }

    public int getAtaque() {
        return this.ataque;
    }

    /** methods */

    public int ataque() {
        int ataqueTotal = this.ataque + this.magia;

        return ataqueTotal;
    }

    public void ataque(Personaje... personajes) {
        int ataqueTotal = this.ataque();

        for(Personaje item : personajes) {
            System.out.println("El personaje: " + this.nombre + " atacó a: " + item.nombre);

            if(item.vida <= 0) {
                System.out.println("El personaje: " + item.nombre + " está muerto");
            } else {
                item.defender(ataqueTotal, this);

                System.out.println("La vida restante del personaje: " + item.nombre + " es: " + item.vida);
            }
        }
    }

    public void defender(int ataqueTotal, Personaje personajeA) {
        int defensaTotal = this.defensa + this.agilidad;

        this.vida = this.vida - (ataqueTotal - defensaTotal);

        if(this.vida <= 0) {
            System.out.println("El personaje: " + this.nombre + " murió");
        }
    }

    public void initSkills(Map<String, Integer> skills) {
        this.setAtaque(this.ataque + skills.get("Ataque"));
        this.setDefensa(this.defensa + skills.get("Defensa"));
        this.setAgilidad(this.agilidad + skills.get("Agilidad"));
        this.setMagia(this.magia + skills.get("Magia"));
        this.setVida(this.vida + skills.get("Vida"));
    }

    /** overwriting methods */

    @Override
	public boolean equals(Object obj) {
		if (this == obj) {	//Si me paso a mi mismo regresar True
			return true;
		}
		//Comprobar que el objeto tambien es un Personaje
		if (obj instanceof Personaje) { 
			//Declaro una variable de metodo tipo personaje,
			//para pasar el objeto ya convertido a tipo personaje
			Personaje personaje = (Personaje)obj;

			//Verificar que todos los atributos sean iguales
			if (this.nombre.equals(personaje.getNombre())
				&& this.sexo == personaje.getSexo() 
				&& this.edad == personaje.getEdad()
				&& this.ataque == personaje.getAtaque()
				&& this.defensa == personaje.getDefensa()
				&& this.agilidad == personaje.getAgilidad()
				&& this.magia == personaje.getMagia()
				&& this.vida == personaje.getVida()) {
				  return true;
			} else { 
				return false;
			}
		} else {
			return false;
		}
	}

    @Override
    public String toString() {
        return "El personaje " + this.nombre + " de edad " + this.edad 
		+ " tiene los atributos de:\nAtaque: " + this.ataque
		+ "\nDefensa: " + this.defensa + "\nMagia: " + this.magia
		+ "\nAgilidad: " + this.agilidad + "\nVida: " + this.vida;
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