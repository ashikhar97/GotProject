package com.GotProject.ResponseDto;

import java.util.ArrayList;
import java.util.List;

public class Response {
	List<BattleDetailResponseDto> getallDetailsResponse =  new ArrayList<BattleDetailResponseDto>();
	List<AttackerCommanderDto> attackerCommander =  new ArrayList<>();
	List<DefenderCommanderDto> deffenderCommander =  new ArrayList<>();
	
	public List<BattleDetailResponseDto> getGetallDetailsResponse() {
		return getallDetailsResponse;
	}
	public void setGetallDetailsResponse(List<BattleDetailResponseDto> getallDetailsResponse) {
		this.getallDetailsResponse = getallDetailsResponse;
	}
	public List<AttackerCommanderDto> getAttackerCommander() {
		return attackerCommander;
	}
	public void setAttackerCommander(List<AttackerCommanderDto> attackerCommander2) {
		this.attackerCommander = attackerCommander2;
	}
	
	public List<DefenderCommanderDto> getDeffenderCommander() {
		return deffenderCommander;
	}
	public void setDeffenderCommander(List<DefenderCommanderDto> deffenderCommander) {
		this.deffenderCommander = deffenderCommander;
	}
	
}
