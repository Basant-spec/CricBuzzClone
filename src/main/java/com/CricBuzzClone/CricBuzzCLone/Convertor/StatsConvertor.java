package com.CricBuzzClone.CricBuzzCLone.Convertor;

import com.CricBuzzClone.CricBuzzCLone.DTO.request.StatsRequest;
import com.CricBuzzClone.CricBuzzCLone.Model.Stats;

public class StatsConvertor {


    public static Stats statsRequestToStats(StatsRequest statsRequest){
     return Stats.builder()
             .battingAverage(statsRequest.getBattingAverage())
             . bowlingAverage(statsRequest.getBowlingAverage())
             .wicketTaken((statsRequest.getWicketTaken()))
             .runsScored(statsRequest.getRunsScored())
             .build();


    }
}
