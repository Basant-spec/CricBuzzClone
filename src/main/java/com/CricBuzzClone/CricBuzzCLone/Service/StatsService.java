package com.CricBuzzClone.CricBuzzCLone.Service;


import com.CricBuzzClone.CricBuzzCLone.Convertor.StatsConvertor;
import com.CricBuzzClone.CricBuzzCLone.DTO.request.StatsRequest;
import com.CricBuzzClone.CricBuzzCLone.Exception.PlayerNotFoundException;
import com.CricBuzzClone.CricBuzzCLone.Model.Player;
import com.CricBuzzClone.CricBuzzCLone.Model.Stats;
import com.CricBuzzClone.CricBuzzCLone.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StatsService {
   @Autowired
   PlayerRepository playerRepository;

 public String addStatsForPlayer(StatsRequest statsRequest,int playerId){

  Optional<Player> playerOptional= playerRepository.findById(playerId);
  if(playerOptional.isEmpty()){
     throw new PlayerNotFoundException("Invalid Player Id");
  }
  Player player=playerOptional.get();

  Stats stats= StatsConvertor.statsRequestToStats(statsRequest);
  stats.setPlayer(player);
  player.setStats(stats);
 Player savedPlayer= playerRepository.save(player);

return "Stats added for player "+savedPlayer.getName();

 }

}
