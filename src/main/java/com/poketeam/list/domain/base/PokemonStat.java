package com.poketeam.list.domain.base;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

@AllArgsConstructor
@Getter
public class PokemonStat {
    @NonNull
    private Integer value;
}
