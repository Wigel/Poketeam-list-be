package com.poketeam.list.web;

import com.poketeam.list.service.GetPokemonService;
import com.poketeam.list.service.dto.PokemonResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {
    @Autowired
    GetPokemonService getPokemonService;

    @GetMapping
    private ResponseEntity getAllPokemon(){
        PokemonResponseDto pokemonResponseDto = getPokemonService.getAllPokemon();

        return new ResponseEntity(pokemonResponseDto, null, HttpStatus.OK);
    }
}
