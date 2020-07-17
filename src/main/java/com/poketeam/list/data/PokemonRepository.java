package com.poketeam.list.data;

import com.poketeam.list.data.dto.PokemonDto;
import com.poketeam.list.domain.base.IPokemonRepository;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public class PokemonRepository implements IPokemonRepository {
    @Override
    public List<PokemonDto> findPokemonByTeamId(String teamId) {
        return List<PokemonDto>;
    }
}
