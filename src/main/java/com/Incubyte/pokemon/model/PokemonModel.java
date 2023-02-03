package com.Incubyte.pokemon.model;


public class PokemonModel {
    private String  name;
    private int id;
    private String power;
    private String Url;

    public PokemonModel(){}
    public PokemonModel(String name, int id, String power, String url) {
        this.name = name;
        this.id = id;
        this.power = power;
        this.Url = url;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPower() {
        return power;
    }

    public String getUrl() {
        return Url;
    }
}
