package com.CricBuzzClone.CricBuzzCLone.DTO.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class TeamResponse {

String teamName;
int ranking;


}
