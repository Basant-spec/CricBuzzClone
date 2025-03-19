package com.CricBuzzClone.CricBuzzCLone.DTO.request;

import com.CricBuzzClone.CricBuzzCLone.Model.Enum.Speciality;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class PlayerRequest {
    String name;
    int age;
    String gender;
    @Enumerated(EnumType.STRING)
    Speciality speciality;

}
