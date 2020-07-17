package com.poketeam.list.domain.base;

public interface PokemonFactory<T> {
    T create(Integer pokemonId);
}
