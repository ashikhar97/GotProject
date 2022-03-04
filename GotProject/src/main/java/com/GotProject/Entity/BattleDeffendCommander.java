package com.GotProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Battle_Deffender_Commander")
public class BattleDeffendCommander {

	
	@Id
	@Column(name="BattleDeffenderCommanderID")
	private int BattleDeffenderCommanderID;
	
	public int getBattleDeffenderCommanderID() {
		return BattleDeffenderCommanderID;
	}


	public void setBattleDeffenderCommanderID(int battleDeffenderCommanderID) {
		BattleDeffenderCommanderID = battleDeffenderCommanderID;
	}


	public int getBattleID() {
		return BattleID;
	}


	public void setBattleID(int battleID) {
		BattleID = battleID;
	}


	public int getDeffenderCommanderID() {
		return DeffenderCommanderID;
	}


	public void setDeffenderCommanderID(int deffenderCommanderID) {
		DeffenderCommanderID = deffenderCommanderID;
	}


	@Column(name="BattleID")
	private int BattleID;
	
	
	@Column(name="DeffenderCommanderID")
	private int DeffenderCommanderID;


}
