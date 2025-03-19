package com.CricBuzzClone.CricBuzzCLone.Model;

import com.CricBuzzClone.CricBuzzCLone.Model.Enum.MatchType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Builder
@Setter
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
public class CricketMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String title;
    MatchType matchType;
    int overs;
    String place;
    @CreationTimestamp
    Date startedAt;
    @ManyToMany
    @JoinTable( name = "match_team",
            joinColumns = {
                    @JoinColumn(name = "cricket_match_id") },
            inverseJoinColumns = { @JoinColumn(name = "team_id") })
    List<Team> teams=new ArrayList<>();






}
