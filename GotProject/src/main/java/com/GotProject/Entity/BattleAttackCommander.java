package com.GotProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Battle_Attack_Commander")
public class BattleAttackCommander {

	@Id
	@Column(name="BattleAttackerCommanderID")
	private int BattleAttackCommanderID;
	
	@Column(name="BattleID")
	private int BattleID;
	
	
	@Column(name="AttackerCommanderID")
	private int AttackerCommanderID;


	@Override
	public String toString() {
		return "BattleAttackCommander [BattleAttackCommanderID=" + BattleAttackCommanderID + ", BattleID=" + BattleID
				+ ", AttackerCommanderID=" + AttackerCommanderID + ", getBattleAttackCommanderID()="
				+ getBattleAttackCommanderID() + ", getBattleID()=" + getBattleID() + ", getAttackerCommanderID()="
				+ getAttackerCommanderID() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}


	public int getBattleAttackCommanderID() {
		return BattleAttackCommanderID;
	}


	public void setBattleAttackCommanderID(int battleAttackCommanderID) {
		BattleAttackCommanderID = battleAttackCommanderID;
	}


	public int getBattleID() {
		return BattleID;
	}


	public void setBattleID(int battleID) {
		BattleID = battleID;
	}


	public int getAttackerCommanderID() {
		return AttackerCommanderID;
	}


	public void setAttackerCommanderID(int attackerCommanderID) {
		AttackerCommanderID = attackerCommanderID;
	}
	
}
