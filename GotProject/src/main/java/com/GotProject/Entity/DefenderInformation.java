package com.GotProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Defender_Information")
public class DefenderInformation {

	@Id
	@Column(name="DefenderID")
	private int DefenderId;
	
	@Column(name="DefenderName")
	private String DefenderName;

	@Override
	public String toString() {
		return "DefenderInformation [DefenderId=" + DefenderId + ", DefenderName=" + DefenderName + ", getDefenderId()="
				+ getDefenderId() + ", getDefenderName()=" + getDefenderName() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public int getDefenderId() {
		return DefenderId;
	}

	public void setDefenderId(int defenderId) {
		DefenderId = defenderId;
	}

	public String getDefenderName() {
		return DefenderName;
	}

	public void setDefenderName(String defenderName) {
		DefenderName = defenderName;
	}
}


