package com.GotProject.ResponseDto;

import java.util.ArrayList;
import java.util.List;

public class Response {
	
	
	public List<BattleDetailResponseDto> getGetallDetailsResponse() {
		return getallDetailsResponse;
	}
	public void setGetallDetailsResponse(List<BattleDetailResponseDto> getallDetailsResponse) {
		this.getallDetailsResponse = getallDetailsResponse;
	}
	public List<AttackerCommanderDto> getAttackerCommander() {
		return attackerCommander;
	}
	public void setAttackerCommander(List<AttackerCommanderDto> attackerCommander) {
		this.attackerCommander = attackerCommander;
	}
	List<BattleDetailResponseDto> getallDetailsResponse =  new ArrayList<BattleDetailResponseDto>();
	List<AttackerCommanderDto> attackerCommander =  new ArrayList<AttackerCommanderDto>();
	
}
