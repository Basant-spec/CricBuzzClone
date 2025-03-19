package com.CricBuzzClone.CricBuzzCLone.Convertor;

import com.CricBuzzClone.CricBuzzCLone.DTO.request.TeamRequest;
import com.CricBuzzClone.CricBuzzCLone.DTO.response.TeamResponse;
import com.CricBuzzClone.CricBuzzCLone.Model.Team;

public class TeamConvertor {

    public static Team teamRequestToTeam(TeamRequest teamRequest){
        return Team.builder()
                .teamName(teamRequest.getTeamName())
                .ranking(teamRequest.getRanking())
                .iccPoint(teamRequest.getIccPoint())
                .build();
    }
     public static TeamResponse teamToTeamResponse (Team team){
return TeamResponse.builder()
        .ranking(team.getRanking())
        .teamName(team.getTeamName())

        .build();



     }





}
