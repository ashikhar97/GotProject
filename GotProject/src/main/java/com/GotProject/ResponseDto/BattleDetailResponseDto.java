package com.GotProject.ResponseDto;


import java.util.List;



public class BattleDetailResponseDto {

	
	private String battle_name;
	
	private String attacker_outcome;
	
	private String attacker_size;
	
	private String battle_type;
	
	private String deffender_size;

	private String major_capture;
	
	private String major_death;

	private String attacker_king;
	
	private String deffender_king;
	
//	private String note;
	
	private String YEAR;
	
	private String summer;
	
	private String Attacker_Name;
	
	private String defender_name;

	private List<String> attacker_commander_name;
	
	
	public List<String> getAttackerCommander() {
		return attacker_commander_name;
	}

	public void setAttackerCommander(List<String> attackerCommander) {
		this.attacker_commander_name = attackerCommander;
	}

	public String getBattle_name() {
		return battle_name;
	}

	public void setBattle_name(String battle_name) {
		this.battle_name = battle_name;
	}

	public String getAttacker_outcome() {
		return attacker_outcome;
	}

	public void setAttacker_outcome(String attacker_outcome) {
		this.attacker_outcome = attacker_outcome;
	}

	public String getAttacker_size() {
		return attacker_size;
	}

	public void setAttacker_size(String attacker_size) {
		this.attacker_size = attacker_size;
	}

	public String getBattle_type() {
		return battle_type;
	}

	public void setBattle_type(String battle_type) {
		this.battle_type = battle_type;
	}

	public String getDeffender_size() {
		return deffender_size;
	}

	public void setDeffender_size(String deffender_size) {
		this.deffender_size = deffender_size;
	}

	public String getMajor_capture() {
		return major_capture;
	}

	public void setMajor_capture(String major_capture) {
		this.major_capture = major_capture;
	}

	public String getMajor_death() {
		return major_death;
	}

	public void setMajor_death(String major_death) {
		this.major_death = major_death;
	}

	public String getAttacker_king() {
		return attacker_king;
	}

	public void setAttacker_king(String attacker_king) {
		this.attacker_king = attacker_king;
	}

	public String getDeffender_king() {
		return deffender_king;
	}

	public void setDeffender_king(String deffender_king) {
		this.deffender_king = deffender_king;
	}

	public String getYEAR() {
		return YEAR;
	}

	public void setYEAR(String yEAR) {
		YEAR = yEAR;
	}

	public String getSummer() {
		return summer;
	}

	public void setSummer(String summer) {
		this.summer = summer;
	}

	public String getAttacker_Name() {
		return Attacker_Name;
	}

	public void setAttacker_Name(String attacker_Name) {
		Attacker_Name = attacker_Name;
	}

	public String getDefender_name() {
		return defender_name;
	}

	public void setDefender_name(String defender_name) {
		this.defender_name = defender_name;
	}

	@Override
	public String toString() {
		return "BattleDetailResponseDto [battle_name=" + battle_name + ", attacker_outcome=" + attacker_outcome
				+ ", attacker_size=" + attacker_size + ", battle_type=" + battle_type + ", deffender_size="
				+ deffender_size + ", major_capture=" + major_capture + ", major_death=" + major_death
				+ ", attacker_king=" + attacker_king + ", deffender_king=" + deffender_king + ", YEAR=" + YEAR
				+ ", summer=" + summer + ", Attacker_Name=" + Attacker_Name + ", defender_name=" + defender_name + "]";
	}

	
	
	
	
	
}
