package com.GotProject.Repository;

import org.springframework.data.repository.CrudRepository;

import com.GotProject.Entity.AttackerInformation;

public interface AttackerInfoRepo extends CrudRepository<AttackerInformation,Integer> {

}
