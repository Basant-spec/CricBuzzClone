package com.CricBuzzClone.CricBuzzCLone.Convertor;

import com.CricBuzzClone.CricBuzzCLone.DTO.request.PlayerRequest;
import com.CricBuzzClone.CricBuzzCLone.DTO.response.PlayerResponse;
import com.CricBuzzClone.CricBuzzCLone.Model.Player;
import lombok.*;
import lombok.experimental.FieldDefaults;


public class PlayerConvertor {

     public static Player playerRequestToPlayer(PlayerRequest playerRequest){

      return  Player.builder()
                 .name(playerRequest.getName())
                 .age(playerRequest.getAge())
                 .gender(playerRequest.getGender())
                 .speciality(playerRequest.getSpeciality())
                 .build();


     }
     public static PlayerResponse playerToPlayerResponse(Player player){
        return PlayerResponse.builder()
                 .name(player.getName())
                 .speciality(player.getSpeciality())

                 .build();


     }



}
