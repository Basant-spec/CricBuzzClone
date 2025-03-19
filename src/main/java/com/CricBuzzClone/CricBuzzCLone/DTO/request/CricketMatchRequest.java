package com.CricBuzzClone.CricBuzzCLone.DTO.request;

import com.CricBuzzClone.CricBuzzCLone.Model.Enum.MatchType;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)

public class CricketMatchRequest {
    String title;
    MatchType matchType;
    int overs;
    String place;



}
