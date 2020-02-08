package com.poketeam.list.service.dto;

import com.poketeam.list.data.dto.PokemonSwordAndShieldDto;
import lombok.Data;

import java.util.List;

@Data
public class PokemonResponseDto {
    private List<PokemonSwordAndShieldDto> pokemons;
}
