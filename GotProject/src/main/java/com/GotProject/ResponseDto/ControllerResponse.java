package com.GotProject.ResponseDto;

import org.springframework.http.HttpStatus;

public class ControllerResponse {
	
	
	private String StatusMessage = null;
	private Long TotalNumberOfBattles = null;
	private Long TotalNumberOfAttackers = null;
	private Long TotalnumberOfDefenders = null;
	private Long TotalNumberOfAttackerCommanders = null;
	private Long TotalNumberOfDefenderCommanders = null;


	public String getStatusMessage() {
		return StatusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		StatusMessage = statusMessage;
	}
	public Long getTotalNumberOfBattles() {
		return TotalNumberOfBattles;
	}
	public void setTotalNumberOfBattles(Long totalNumberOfBattles) {
		TotalNumberOfBattles = totalNumberOfBattles;
	}
	public Long getTotalNumberOfAttackers() {
		return TotalNumberOfAttackers;
	}
	public void setTotalNumberOfAttackers(Long totalNumberOfAttackers) {
		TotalNumberOfAttackers = totalNumberOfAttackers;
	}
	public Long getTotalnumberOfDefenders() {
		return TotalnumberOfDefenders;
	}
	public void setTotalnumberOfDefenders(Long totalnumberOfDefenders) {
		TotalnumberOfDefenders = totalnumberOfDefenders;
	}
	public Long getTotalNumberOfAttackerCommanders() {
		return TotalNumberOfAttackerCommanders;
	}
	public void setTotalNumberOfAttackerCommanders(Long totalNumberOfAttackerCommanders) {
		TotalNumberOfAttackerCommanders = totalNumberOfAttackerCommanders;
	}
	public Long getTotalNumberOfDefenderCommanders() {
		return TotalNumberOfDefenderCommanders;
	}
	public void setTotalNumberOfDefenderCommanders(Long totalNumberOfDefenderCommanders) {
		TotalNumberOfDefenderCommanders = totalNumberOfDefenderCommanders;
	}
	

}
