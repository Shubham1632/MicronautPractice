package com.Incubyte.pokemon.service;

import com.Incubyte.pokemon.model.PokemonModel;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Singleton
public class PokemonService {

    List<PokemonModel> pokemons = new ArrayList<>();

    public List<PokemonModel> getAllPokemons() {
        return pokemons;
    }

    public PokemonModel getPokemonById(int currid) {
        return pokemons.stream().filter(pokemon -> pokemon.getId() == currid).findFirst().orElse(null);
    }

    public PokemonModel addPokemon(PokemonModel pokemon) {
        pokemons.add(pokemon);
        return pokemon;
    }
}
