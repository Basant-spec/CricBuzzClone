package com.CricBuzzClone.CricBuzzCLone.Repository;

import com.CricBuzzClone.CricBuzzCLone.Model.Enum.Speciality;
import com.CricBuzzClone.CricBuzzCLone.Model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player,Integer> {
     List<Player> findByGender(String gender);

     @Query(value="select * from player where gender=:gender and speciality=:speciality",nativeQuery = true)
     List<Player> findPlayerBasedOnGenderAndSpeciality(String gender, Speciality speciality);
}
