package com.GotProject.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GotProject.Entity.BattleDetails;


@Repository
public interface BattleDetailsRepo extends CrudRepository<BattleDetails,Integer> {

}
