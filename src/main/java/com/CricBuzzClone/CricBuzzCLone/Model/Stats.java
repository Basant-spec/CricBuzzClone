package com.CricBuzzClone.CricBuzzCLone.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Stats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    int runsScored;
    int wicketTaken;
    double battingAverage;
    double bowlingAverage;
    @OneToOne
    @JsonIgnore
    Player player;



}
