package com.CricBuzzClone.CricBuzzCLone.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String teamName;
    int ranking;
    int iccPoint;
    @OneToMany(mappedBy="team")

    @JsonIgnore
    List<Player> players=new ArrayList<>();
    @ManyToMany(mappedBy="teams")
    @JsonIgnore
   List<CricketMatch> matches=new ArrayList<>();

}
