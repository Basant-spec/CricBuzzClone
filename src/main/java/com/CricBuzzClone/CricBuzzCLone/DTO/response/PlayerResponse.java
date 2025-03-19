package com.CricBuzzClone.CricBuzzCLone.DTO.response;

import com.CricBuzzClone.CricBuzzCLone.Model.Enum.Speciality;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
public class PlayerResponse {
   String name;
   Speciality speciality;

}
