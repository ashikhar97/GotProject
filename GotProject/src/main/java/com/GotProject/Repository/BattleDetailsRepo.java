package com.GotProject.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GotProject.Entity.BattleDetails;


@Repository
public interface BattleDetailsRepo extends CrudRepository<BattleDetails,Integer> {
	@Query(value="select distinct region from battle_details",nativeQuery = true)
	List<Object> findAllDistinctRegion();
	
	@Query(value="select distinct location from battle_details",nativeQuery = true)
	List<Object> findAllDistinctLocation();
}
