package com.CricBuzzClone.CricBuzzCLone.Service;

import com.CricBuzzClone.CricBuzzCLone.Convertor.MatchConvertor;
import com.CricBuzzClone.CricBuzzCLone.DTO.request.CricketMatchRequest;
import com.CricBuzzClone.CricBuzzCLone.DTO.response.CricketMatchResponse;
import com.CricBuzzClone.CricBuzzCLone.Exception.TeamNotFoundException;
import com.CricBuzzClone.CricBuzzCLone.Model.CricketMatch;
import com.CricBuzzClone.CricBuzzCLone.Model.Team;
import com.CricBuzzClone.CricBuzzCLone.Repository.CricketMatchRepository;
import com.CricBuzzClone.CricBuzzCLone.Repository.TeamRepository;
import jakarta.persistence.ManyToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatchService {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    CricketMatchRepository cricketMatchRepository;
    public CricketMatchResponse registerMatch(CricketMatchRequest cricketMatchRequest, int teamAId, int teamBId) {

        Optional<Team> optionalTeamA=teamRepository.findById(teamAId);
        Optional<Team> optionalTeamB=teamRepository.findById(teamBId);

        if(optionalTeamA.isEmpty() || optionalTeamB.isEmpty()){
        throw new TeamNotFoundException("Invalid Team Details");
        }
        Team teamA=optionalTeamA.get();
        Team teamB=optionalTeamB.get();
        CricketMatch match= MatchConvertor.cricketMatchRequestToCricketMatch((cricketMatchRequest));
        List<Team> teams=List.of(teamA,teamB);
        match.setTeams(teams);
        teamA.getMatches().add(match);
        teamB.getMatches().add(match);

  CricketMatch savedMatch= cricketMatchRepository.save(match);
   teamRepository.save(teamA);
   teamRepository.save(teamB);

   return MatchConvertor.cricketMatchToCricketMatchResponse(savedMatch);

    }
}
