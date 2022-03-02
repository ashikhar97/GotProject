package com.GotProject.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Service;

import com.GotProject.ResponseDto.AttackerCommanderDto;
import com.GotProject.ResponseDto.BattleDetailResponseDto;
import com.GotProject.ResponseDto.Response;

@Service
public class ControllerService {

	@Autowired
	private JdbcTemplate template;
	
	
	public Response GetAllDetails(int battleid) {
		
		List<BattleDetailResponseDto> getallDetailsResponse =  new ArrayList<BattleDetailResponseDto>();
		List<AttackerCommanderDto> attackerCommander =  new ArrayList<AttackerCommanderDto>();
		Response response = new Response();
		try {
		 
		StringBuffer query1 = new StringBuffer("SELECT battle_name,attacker_outcome,attacker_size,battle_type,deffender_size,major_capture,major_death,attacker_king,"
				+ " deffender_king,YEAR,summer,Attacker_Name,defender_name FROM battle_details bd,attacker_information ai,defender_information di WHERE bd.attackerid = ai.attackerid"
				+ " AND di.defenderid = bd.deffenderid AND bd.battleid = ?");
		
		
		StringBuffer query2 = new StringBuffer("SELECT attacker_commander_name FROM attacker_commander ac,battle_attack_commander bac WHERE ac.attacker_commanderid IN "
				+ "(SELECT bac.attacker_commanderid FROM battle_attack_commander WHERE bac.battleid = ?)");
		
		
		attackerCommander = template.query(query2.toString(),BeanPropertyRowMapper.newInstance(AttackerCommanderDto.class),battleid);
		
		getallDetailsResponse = template.query(query1.toString(),BeanPropertyRowMapper.newInstance(BattleDetailResponseDto.class),battleid);
		
		response.setAttackerCommander(attackerCommander);
		response.setGetallDetailsResponse(getallDetailsResponse);
				return response;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
		
	}
}
