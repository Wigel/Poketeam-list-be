package com.poketeam.list.web;

import com.poketeam.list.service.SaveTeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/team")
public class TeamController {
    @Autowired
    SaveTeamService saveTeamService;

    @PostMapping
    public ResponseEntity saveTeam(@RequestBody TeamForm teamForm) {
        saveTeamService.saveTeam(teamForm);
        return new ResponseEntity(HttpStatus.OK);
    }
}
