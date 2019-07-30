package com.bootcamp.ejercicio1.app;

import com.bootcamp.ejercicio1.core.characters.config.Presets;
import com.bootcamp.ejercicio1.core.characters.Elfo;
import com.bootcamp.ejercicio1.core.characters.Enano;
import com.bootcamp.ejercicio1.core.characters.Humano;
import com.bootcamp.ejercicio1.core.characters.Personaje;

public class IniciarJuego {
    public Personaje crearPersonaje(String raza, String clase, String nombre, int edad, char sexo) {
        Presets pre = Presets.getInstance();
        Personaje personaje = null;

        switch(raza.toLowerCase()) {
            case "humano":
                personaje = new Humano(nombre, edad, sexo);
                try {
                    personaje.initSkills(pre.getPresets().get(clase));
                } catch (Exception e) {
                    System.err.println("No se pudo crear el personaje. Cheque sus entradas");
                    e.printStackTrace();
                }
            break;
            case "elfo":
                personaje = new Elfo(nombre, edad, sexo);

                try {
                    personaje.initSkills(pre.getPresets().get(clase));
                } catch (Exception e) {
                    System.err.println("No se pudo crear el personaje. Cheque sus entradas");
                    e.printStackTrace();
                }
            break;
            case "enano":
                personaje = new Enano(nombre, edad, sexo);
                
                try {
                    personaje.initSkills(pre.getPresets().get(clase));
                } catch (Exception e) {
                    System.err.println("No se pudo crear el personaje. Cheque sus entradas");
                    e.printStackTrace();
                }
            break;
            default:
                System.err.println("La raza no existe");
            break;
        }

        return personaje;
    }
}