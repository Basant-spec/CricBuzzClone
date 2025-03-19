package com.CricBuzzClone.CricBuzzCLone.DTO.response;

import com.CricBuzzClone.CricBuzzCLone.Model.Enum.MatchType;
import com.CricBuzzClone.CricBuzzCLone.Model.Team;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class CricketMatchResponse {

    String title;
    MatchType matchType;
    int overs;
    String place;
    Date startedDate;
    List<TeamResponse> teams;



}
