package com.GotProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Attacker_Commander")
public class AttackerCommander {

	
	@Id
	@Column(name="AttackerCommanderID")
	private int AttackerCommanderID;
	
	@Column(name="AttackerCommanderName")
	private String AttackerCommanderName;

	public int getAttackerCommanderID() {
		return AttackerCommanderID;
	}

	public void setAttackerCommanderID(int attackerCommanderID) {
		AttackerCommanderID = attackerCommanderID;
	}

	public String getAttackerCommanderName() {
		return AttackerCommanderName;
	}

	public void setAttackerCommanderName(String attackerCommanderName) {
		AttackerCommanderName = attackerCommanderName;
	}
}
