package com.bootcamp.ejercicio1.core.characters.config;

import java.util.HashMap;

public class Presets {
    HashMap<String, HashMap<String, Integer>> presets = new HashMap<String, HashMap<String, Integer>>();

    HashMap<String, Integer> mago = new HashMap<String, Integer>();
    HashMap<String, Integer> guerrero = new HashMap<String, Integer>();
    HashMap<String, Integer> arquero = new HashMap<String, Integer>();

    private static Presets presetInstance;

    private Presets() {
        init();
    }

    public void init() {
        mago.put("Ataque", -2);
		mago.put("Magia", 5);
		mago.put("Defensa", -1);
		mago.put("Agilidad", -1);
        mago.put("Vida", 1);
        
        guerrero.put("Ataque", 3);
		guerrero.put("Magia", -2);
		guerrero.put("Defensa", 2);
		guerrero.put("Agilidad", 1);
        guerrero.put("Vida", 1);
        
        arquero.put("Ataque", 3);
		arquero.put("Defensa", -1);
        arquero.put("Agilidad", 3);
        
        presets.put("Mago", mago);
		presets.put("Guerrero", guerrero);
		presets.put("Arquero", arquero);
    }

    public HashMap<String, HashMap<String, Integer>>  getPresets() {
        return presets;
    }

    public static Presets getInstance() {
        if(presetInstance == null) {
            presetInstance = new Presets();
        }

        return presetInstance;
    }
}