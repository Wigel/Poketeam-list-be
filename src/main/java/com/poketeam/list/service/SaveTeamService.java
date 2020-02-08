package com.poketeam.list.service;

import com.poketeam.list.data.dao.TeamDao;
import com.poketeam.list.data.dto.TeamDto;
import com.poketeam.list.web.TeamForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveTeamService {
    @Autowired
    private TeamDao teamDao;

    public void saveTeam(TeamForm teamForm) {
        TeamDto teamDto = teamForm.toDto();
        teamDao.save(teamDto);
    }
}
