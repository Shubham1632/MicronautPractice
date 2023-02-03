package com.Incubyte.pokemon.controller;

import com.Incubyte.pokemon.model.PokemonModel;
import com.Incubyte.pokemon.service.PokemonService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;

import java.net.http.HttpTimeoutException;
import java.util.List;

@Controller("/pokemons")
public class PokemonController {
    PokemonService pokemonService = new PokemonService();

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @Get
    public HttpResponse<List<PokemonModel>> getAllPokemons(){
        return HttpResponse.ok(pokemonService.getAllPokemons());
    }
    @Post
    public HttpResponse<PokemonModel> addPokemon(@Body PokemonModel pokemon){
        return  HttpResponse.created(pokemonService.addPokemon(pokemon));
    }
    @Get("/{currId}")
    public HttpResponse<PokemonModel> getPokemonById(@PathVariable int currId){
        return HttpResponse.ok(pokemonService.getPokemonById(currId));
    }

}
