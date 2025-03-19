package com.CricBuzzClone.CricBuzzCLone.Controller;


import com.CricBuzzClone.CricBuzzCLone.DTO.request.PlayerRequest;
import com.CricBuzzClone.CricBuzzCLone.DTO.response.PlayerResponse;
import com.CricBuzzClone.CricBuzzCLone.Model.Enum.Speciality;
import com.CricBuzzClone.CricBuzzCLone.Model.Player;
import com.CricBuzzClone.CricBuzzCLone.Service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {

    @Autowired
    PlayerService playerService;
    @PostMapping
    public ResponseEntity addPlayer(@RequestBody PlayerRequest playerRequest){
        PlayerResponse playerResponse= playerService.addPlayer(playerRequest);
     return new ResponseEntity<>(playerResponse, HttpStatus.CREATED);
    }
   @GetMapping
    public Player getPlayer(@RequestParam ("player-id") int playerId){
     return playerService.getPlayer(playerId);
    }

    @GetMapping("/gender/{gender}")
    public List<PlayerResponse> getPlayerByGender(@PathVariable("gender")String gender ){
      return playerService.getPlayerByGender(gender);

    }
    @GetMapping("/gender/{gender}/speciality/{speciality}")
    public List<PlayerResponse> getPlayerByGenderAndSpeciality(@PathVariable("gender") String gender,
                                                               @PathVariable("speciality")Speciality speciality){

     return playerService.getPlayerByGenderAndSpeciality(gender,speciality);


    }





}
