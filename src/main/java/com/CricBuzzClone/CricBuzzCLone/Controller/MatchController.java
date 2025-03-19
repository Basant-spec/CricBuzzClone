package com.CricBuzzClone.CricBuzzCLone.Controller;


import com.CricBuzzClone.CricBuzzCLone.DTO.request.CricketMatchRequest;
import com.CricBuzzClone.CricBuzzCLone.Exception.TeamNotFoundException;
import com.CricBuzzClone.CricBuzzCLone.Service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/match")
public class MatchController {
    @Autowired
    MatchService matchService;
@PostMapping
public ResponseEntity registerMatch(@RequestBody CricketMatchRequest cricketMatchRequest,
                                    @RequestParam ("teamA-id")int teamAId,
                                    @RequestParam ("teamB-id")int teamBId){
    try{

        return new ResponseEntity<>(matchService.registerMatch(cricketMatchRequest,teamAId,teamBId), HttpStatus.CREATED);
    }catch(TeamNotFoundException teamNotFoundException){
        return new ResponseEntity<>(teamNotFoundException.getMessage(),HttpStatus.NOT_FOUND);
    }




}



}
