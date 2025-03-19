package com.CricBuzzClone.CricBuzzCLone.Model;

import com.CricBuzzClone.CricBuzzCLone.Model.Enum.Speciality;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Player
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int age;
    String gender;
    @Enumerated(EnumType.STRING)
    Speciality speciality;
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Team team;
    @OneToOne(mappedBy="player",cascade=CascadeType.ALL)
    Stats stats;

}
