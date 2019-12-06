package com.poketeam.list.service.dto;

import com.poketeam.list.data.dto.PokemonSwordAndShieldDto;
import com.poketeam.list.domain.Pokemon;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class PokemonResponseDto {
    private List<PokemonSwordAndShieldDto> pokemon;
}
