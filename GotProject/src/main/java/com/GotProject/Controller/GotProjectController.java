package com.GotProject.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.GotProject.ResponseDto.ControllerResponse;

import com.GotProject.Service.ControllerService;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

@Validated
@RestController
public class GotProjectController {
	
	

	@Autowired
	public ControllerService controllerService;
	
	
	@GetMapping("/count")
	public ResponseEntity<ControllerResponse> getList() {
	
		ControllerResponse controllerResponse =new ControllerResponse();
		try {
		
			controllerResponse = controllerService.getcount();
			return new ResponseEntity<>(controllerResponse,HttpStatus.OK);

		}
		
		catch(Exception e) {
			
			controllerResponse.setStatusMessage("Request COuld Not Be Processed");
			return new ResponseEntity<>(controllerResponse,HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
	}
	
	
	
	
	@GetMapping("/details/{battleid}")
	public ResponseEntity getDetails(@Valid @PathVariable @NotBlank @Min(value = 0) @Size(max = 38) int battleid) {
		
		try { 
			return new ResponseEntity<>(controllerService.GetAllDetails(battleid),HttpStatus.OK);	
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
	}
	
	
	
	
	@GetMapping("/regions")
	public ResponseEntity getRegions() {
		
		try {
			return new ResponseEntity<>(controllerService.GetRegionsAndLocations(),HttpStatus.OK);	
		}
		catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
			
	}
	
	

	
	
	
}
