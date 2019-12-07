package com.poketeam.list.data.dao;

import com.poketeam.list.data.dto.PokemonSwordAndShieldDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonSwordAndShieldDao extends JpaRepository<PokemonSwordAndShieldDto, Long> {


}
