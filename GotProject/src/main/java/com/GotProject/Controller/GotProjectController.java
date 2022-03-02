package com.GotProject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.GotProject.Entity.BattleDetails;
import com.GotProject.Repository.AttackerCommnderRepo;
import com.GotProject.Repository.AttackerInfoRepo;
import com.GotProject.Repository.BattleAttackCommanderRepo;
import com.GotProject.Repository.BattleDetailsRepo;
import com.GotProject.Repository.DefenderInfoRepo;
import com.GotProject.ResponseDto.BattleDetailResponseDto;
import com.GotProject.ResponseDto.ControllerResponse;
import com.GotProject.ResponseDto.Response;
import com.GotProject.Service.ControllerService;

@RestController
public class GotProjectController {
	
	@Autowired
	public BattleDetailsRepo BDetrepo;

	@Autowired
	public AttackerInfoRepo AttackerInforepo;

	@Autowired
	public AttackerCommnderRepo AttackerCommanderRepo;


	@Autowired
	public DefenderInfoRepo DefenderInforepo;

	@Autowired
	public BattleAttackCommanderRepo BattleAttackerComRepo;

	@Autowired
	public ControllerService controllerService;
	
	
	@GetMapping("/Count")
	public ResponseEntity getList() {
	
		ControllerResponse controllerResponse =new ControllerResponse();
		try {
		
		
		controllerResponse.setTotalNumberOfBattles(BDetrepo.count());
		controllerResponse.setTotalNumberOfAttackers(AttackerInforepo.count());
		controllerResponse.setTotalNumberOfAttackerCommanders(AttackerCommanderRepo.count());
//		controllerResponse.setTotalNumberOfDefenderCommanders(totalNumberOfDefenderCommanders);
		controllerResponse.setTotalnumberOfDefenders(DefenderInforepo.count());
		
		controllerResponse.setStatusMessage("Request Processed Successfully");
		
		return new ResponseEntity<>(controllerResponse,HttpStatus.OK);
		}
		
		catch(Exception e) {
			
			controllerResponse.setStatusMessage("Request COuld Not Be Processed");
			return new ResponseEntity<>(controllerResponse,HttpStatus.ACCEPTED);
		}
			
	}
	
	
	
	
	@GetMapping("/Details/{battleid}")
	public Response getDetails(@PathVariable int battleid) {
	
		
		
		return controllerService.GetAllDetails(battleid);
		
		
		
		
		
	}
	
	
	
	

	
	
	
}
