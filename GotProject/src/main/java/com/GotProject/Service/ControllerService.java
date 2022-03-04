package com.GotProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Service;

import com.GotProject.Entity.DeffenderCommander;
import com.GotProject.Repository.AttackerCommnderRepo;
import com.GotProject.Repository.AttackerInfoRepo;
import com.GotProject.Repository.BattleAttackCommanderRepo;
import com.GotProject.Repository.BattleDeffendCommanderRepo;
import com.GotProject.Repository.BattleDetailsRepo;
import com.GotProject.Repository.DefenderInfoRepo;
import com.GotProject.ResponseDto.AttackerCommanderDto;
import com.GotProject.ResponseDto.BattleDetailResponseDto;
import com.GotProject.ResponseDto.ControllerResponse;
import com.GotProject.ResponseDto.DefenderCommanderDto;
import com.GotProject.ResponseDto.RegionLocationResponseDto;
import com.GotProject.Repository.DeffenderCommanderRepo;
import com.GotProject.ResponseDto.Response;

@Service
public class ControllerService {

	@Autowired
	private JdbcTemplate template;
	
	@Autowired
	public BattleDetailsRepo BDetrepo;

	@Autowired
	public AttackerInfoRepo AttackerInforepo;

	@Autowired
	public AttackerCommnderRepo AttackerCommanderRepo;

	
	@Autowired
	public DeffenderCommanderRepo DeffenderCommanderRepo;

	@Autowired
	public DefenderInfoRepo DefenderInforepo;

	@Autowired
	public BattleAttackCommanderRepo BattleAttackerComRepo;
	

	@Autowired
	public BattleDeffendCommanderRepo BattleDeffendComRepo;
	
	public Response GetAllDetails(int battleid) {
		
		List<BattleDetailResponseDto> getallDetailsResponse =  new ArrayList<BattleDetailResponseDto>();
		List<AttackerCommanderDto> attackerCommander =  new ArrayList<AttackerCommanderDto>();
		List<DefenderCommanderDto> deffenderCommander =  new ArrayList<DefenderCommanderDto>();
		Response response = new Response();
		try {
		 
		StringBuffer query1 = new StringBuffer("SELECT battle_name,attacker_outcome,attacker_size,battle_type,deffender_size,major_capture,major_death,attacker_king,"
				+ " deffender_king,YEAR,summer,Attacker_Name,defender_name FROM battle_details bd,attacker_information ai,defender_information di WHERE bd.attackerid = ai.attackerid"
				+ " AND di.defenderid = bd.deffenderid AND bd.battleid = ?");
		
		
		StringBuffer query2 = new StringBuffer("SELECT attacker_commander_name FROM attacker_commander ac,battle_attack_commander bac WHERE ac.attacker_commanderid IN "
				+ "(SELECT bac.attacker_commanderid FROM battle_attack_commander WHERE bac.battleid = ?)");
		
		
		StringBuffer query3 = new StringBuffer("SELECT deffender_commander_name FROM deffender_commander dc,battle_deffender_commander bdc WHERE dc.deffender_commanderid IN "
				+ "	 (SELECT bdc.battle_deffender_commanderid FROM battle_deffender_commander WHERE bdc.battleid = ?)");
		
	
		
		getallDetailsResponse = template.query(query1.toString(),BeanPropertyRowMapper.newInstance(BattleDetailResponseDto.class),battleid);
		
		attackerCommander = template.query(query2.toString(),BeanPropertyRowMapper.newInstance(AttackerCommanderDto.class),battleid);
		
		deffenderCommander = template.query(query3.toString(),BeanPropertyRowMapper.newInstance(DefenderCommanderDto.class),battleid);
		
		response.setAttackerCommander(attackerCommander);
		response.setGetallDetailsResponse(getallDetailsResponse);
		response.setDeffenderCommander(deffenderCommander);
		
				return response;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
	
	
	
	public ControllerResponse getcount() {
		ControllerResponse controllerResponse =new ControllerResponse();
		
		controllerResponse.setTotalNumberOfBattles(BDetrepo.count());
		controllerResponse.setTotalNumberOfAttackers(AttackerInforepo.count());
		controllerResponse.setTotalNumberOfAttackerCommanders(AttackerCommanderRepo.count());
//		controllerResponse.setTotalNumberOfDefenderCommanders(totalNumberOfDefenderCommanders);
		controllerResponse.setTotalnumberOfDefenders(DefenderInforepo.count());
		
		controllerResponse.setStatusMessage("Request Processed Successfully");
		
		return controllerResponse;
	}



	public Object GetRegionsAndLocations() {
		RegionLocationResponseDto regresponse = new RegionLocationResponseDto();
		
		List<Object> Distinctlocation = BDetrepo.findAllDistinctLocation();
		List<Object> Distinctregion = BDetrepo.findAllDistinctLocation();
		
		regresponse.setDistinctlocation(Distinctlocation);
		regresponse.setDistinctRegion(Distinctregion);
		return regresponse;
	}
}
