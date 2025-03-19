package com.CricBuzzClone.CricBuzzCLone.Service;

import com.CricBuzzClone.CricBuzzCLone.Convertor.PlayerConvertor;
import com.CricBuzzClone.CricBuzzCLone.DTO.request.PlayerRequest;
import com.CricBuzzClone.CricBuzzCLone.DTO.response.PlayerResponse;
import com.CricBuzzClone.CricBuzzCLone.Exception.PlayerNotFoundException;
import com.CricBuzzClone.CricBuzzCLone.Model.Enum.Speciality;
import com.CricBuzzClone.CricBuzzCLone.Model.Player;
import com.CricBuzzClone.CricBuzzCLone.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public PlayerResponse addPlayer(PlayerRequest playerRequest){

    Player player= PlayerConvertor.playerRequestToPlayer(playerRequest);

    Player savedPlayer=  playerRepository.save(player);
    return PlayerConvertor.playerToPlayerResponse(savedPlayer);
    }

    public Player getPlayer(int playerId){
        Optional<Player> playerOptional= playerRepository.findById(playerId);
        if(playerOptional.isEmpty()){
            throw new PlayerNotFoundException(" invalid player id");

        }


        return playerOptional.get();
    }

    public List<PlayerResponse> getPlayerByGender(String gender) {

        List<Player> players=playerRepository.findByGender(gender);
        List<PlayerResponse> playerResponses=new ArrayList<>();
        for(Player player:players){
           playerResponses.add(PlayerConvertor.playerToPlayerResponse(player));
        }
        return playerResponses;


    }

    public List<PlayerResponse> getPlayerByGenderAndSpeciality(String gender, Speciality speciality) {
        List<Player> players=playerRepository.findPlayerBasedOnGenderAndSpeciality(gender,speciality);
        List<PlayerResponse> playerResponses=new ArrayList<>();
        for(Player player:players){
            playerResponses.add(PlayerConvertor.playerToPlayerResponse(player));
        }
        return playerResponses;




    }
}
