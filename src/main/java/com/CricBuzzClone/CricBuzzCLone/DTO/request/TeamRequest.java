package com.CricBuzzClone.CricBuzzCLone.DTO.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class TeamRequest {

    String teamName;
    int ranking;
    int iccPoint;
}
