package com.CricBuzzClone.CricBuzzCLone.Model;

import com.CricBuzzClone.CricBuzzCLone.Model.Enum.Gender;
import com.CricBuzzClone.CricBuzzCLone.Model.Enum.Speciality;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Player
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String Name;
    int age;
    @Enumerated(EnumType.STRING)
    Gender gender;
    @Enumerated(EnumType.STRING)
    Speciality speciality;


}
