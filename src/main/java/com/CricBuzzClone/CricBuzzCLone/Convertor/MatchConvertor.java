package com.CricBuzzClone.CricBuzzCLone.Convertor;

import com.CricBuzzClone.CricBuzzCLone.DTO.request.CricketMatchRequest;
import com.CricBuzzClone.CricBuzzCLone.DTO.response.CricketMatchResponse;
import com.CricBuzzClone.CricBuzzCLone.DTO.response.TeamResponse;
import com.CricBuzzClone.CricBuzzCLone.Model.CricketMatch;

import java.util.ArrayList;
import java.util.List;

public class MatchConvertor {

    public static CricketMatch cricketMatchRequestToCricketMatch(CricketMatchRequest matchRequest){
          return CricketMatch.builder()
                  .title(matchRequest.getTitle())
                  .matchType(matchRequest.getMatchType())
                  .overs(matchRequest.getOvers())
                  .build();

    }
       public static CricketMatchResponse cricketMatchToCricketMatchResponse(CricketMatch match){

           List<TeamResponse> teamResponseList=new ArrayList<>();
           TeamResponse teamResponseA=TeamConvertor.teamToTeamResponse(match.getTeams().get(0));
           TeamResponse teamResponseB=TeamConvertor.teamToTeamResponse(match.getTeams().get(1));
           teamResponseList.add(teamResponseA);
           teamResponseList.add(teamResponseB);
        return CricketMatchResponse.builder()
                .title(match.getTitle())
                .matchType(match.getMatchType())
                .overs(match.getOvers())
                .place(match.getPlace())
                .startedDate(match.getStartedAt())
                .teams(teamResponseList)
                .build();
       }



}
