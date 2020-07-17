package com.poketeam.list.domain.base;

import lombok.NonNull;

import javax.validation.constraints.Size;
import java.util.List;

abstract public class PokemonBase implements IPokemonBase {
    @NonNull
    private Integer id;

    @NonNull
    private String name;

    private String imageUrl;

    @Size(min = 1, max = 2)
    @NonNull
    List<PokemonType> pokemonTypeList;

    @NonNull
    private PokemonStat specialAttack;
    @NonNull
    private PokemonStat specialDefense;
    @NonNull
    private PokemonStat hp;
    @NonNull
    private PokemonStat attack;
    @NonNull
    private PokemonStat defense;
    @NonNull
    private PokemonStat speed;
}
