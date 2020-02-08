package com.poketeam.list.service;

import com.poketeam.list.data.dao.PokemonSwordAndShieldDao;
import com.poketeam.list.data.dto.PokemonSwordAndShieldDto;
import com.poketeam.list.service.dto.PokemonResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetPokemonService {
    @Autowired
    PokemonSwordAndShieldDao pokemonSwordAndShieldDao;

    public PokemonResponseDto getAllPokemon() {

        //Return all pokemon from db
        List<PokemonSwordAndShieldDto> pokemonSwordAndShieldDtoList = pokemonSwordAndShieldDao.findAll();
        return new PokemonResponseDto(pokemonSwordAndShieldDtoList);
    }
}
