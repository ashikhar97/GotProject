package com.GotProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Attacker_Information")
public class AttackerInformation {

	@Id
	@Column(name="AttackerID")
	private int AttackerID;
	
	@Column(name="Attacker_Name")
	private String Name;

	public int getAttackerID() {
		return AttackerID;
	}

	public void setAttackerID(int attackerID) {
		AttackerID = attackerID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "AttackerInformation [AttackerID=" + AttackerID + ", Name=" + Name + "]";
	}
}
