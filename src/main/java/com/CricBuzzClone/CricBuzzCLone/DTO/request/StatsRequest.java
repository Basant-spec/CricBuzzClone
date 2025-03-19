package com.CricBuzzClone.CricBuzzCLone.DTO.request;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class StatsRequest {
    int runsScored;
    int wicketTaken;
    double battingAverage;
    double bowlingAverage;
    int playerId;

}
