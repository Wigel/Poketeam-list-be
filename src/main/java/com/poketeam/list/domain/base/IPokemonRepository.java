package com.poketeam.list.domain.base;

import com.poketeam.list.data.dto.PokemonDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface IPokemonRepository {
    List<PokemonDto> findPokemonByTeamId(@Param("team_id") String teamId);
}
