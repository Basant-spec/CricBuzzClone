package com.CricBuzzClone.CricBuzzCLone.Service;


import com.CricBuzzClone.CricBuzzCLone.Convertor.TeamConvertor;
import com.CricBuzzClone.CricBuzzCLone.DTO.request.TeamRequest;
import com.CricBuzzClone.CricBuzzCLone.DTO.response.TeamResponse;
import com.CricBuzzClone.CricBuzzCLone.Model.Team;
import com.CricBuzzClone.CricBuzzCLone.Repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {

  @Autowired
  TeamRepository teamRepository;
    public TeamResponse addTeam(TeamRequest teamRequest) {
    Team team= TeamConvertor.teamRequestToTeam(teamRequest);
   Team savedTeam=teamRepository.save(team);
   return TeamConvertor.teamToTeamResponse(savedTeam);
    }
}
