package com.poketeam.list.data.dao;

import com.poketeam.list.data.dto.TeamDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamDao extends JpaRepository<TeamDto, Long> {


}
