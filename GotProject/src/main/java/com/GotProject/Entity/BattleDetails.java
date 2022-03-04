package com.GotProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Battle_Details")
public class BattleDetails {
	
	@Id
	@Column(name = "Battleid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Battleid;
	
	@Column(name = "BattleName")
	private String name;
	@Column(name = "Year")
	private String year;
	@Column(name = "Battlenumber")
	private int battlenumber;
	@Column(name = "AttackerKing")
	private String attackerking;
	@Column(name = "DeffenderKing")
	private String deffenderking;
	
	
	@Column(name = "AttackerID")
	private int AttackerID;
	@Column(name = "DeffenderID")
	private int DeffenderID;
	
	@Column(name = "AttackerOutcome")
	private String AttackerOutcome;
	@Column(name = "BattleType")
	private String BattleType;
	@Column(name = "MajorDeath")
	private String MajorDeath;
	
	@Column(name = "MajorCapture")
	private String MajorCapture;
	
	@Column(name = "AttackerSize")
	private String AttackerSize;
	
	
	@Column(name = "DeffenderSize")
	private String DefenderSize;
	

	
	@Column(name = "Summer")
	private String summer;
	@Column(name = "location")
	private String location;
	@Column(name = "Region")
	private String region;
	@Column(name = "Note")
	private String note;
	
	
	
	public int getBattleid() {
		return Battleid;
	}
	public void setBattleid(int battleid) {
		Battleid = battleid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getBattlenumber() {
		return battlenumber;
	}
	public void setBattlenumber(int battlenumber) {
		this.battlenumber = battlenumber;
	}
	public String getAttackerking() {
		return attackerking;
	}
	public void setAttackerking(String attackerking) {
		this.attackerking = attackerking;
	}
	public String getDeffenderking() {
		return deffenderking;
	}
	public void setDeffenderking(String deffenderking) {
		this.deffenderking = deffenderking;
	}
	public int getAttackerID() {
		return AttackerID;
	}
	public void setAttackerID(int attackerID) {
		AttackerID = attackerID;
	}
	public int getDeffenderID() {
		return DeffenderID;
	}
	public void setDeffenderID(int deffenderID) {
		DeffenderID = deffenderID;
	}
	public String getAttackerOutcome() {
		return AttackerOutcome;
	}
	public void setAttackerOutcome(String attackerOutcome) {
		AttackerOutcome = attackerOutcome;
	}
	public String getBattleType() {
		return BattleType;
	}
	public void setBattleType(String battleType) {
		BattleType = battleType;
	}
	public String getMajorDeath() {
		return MajorDeath;
	}
	public void setMajorDeath(String data) {
		MajorDeath = data;
	}
	public String getMajorCapture() {
		return MajorCapture;
	}
	public void setMajorCapture(String majorCapture) {
		MajorCapture = majorCapture;
	}
	public String getAttackerSize() {
		return AttackerSize;
	}
	public void setAttackerSize(String attackerSize) {
		AttackerSize = attackerSize;
	}
	public String getDefenderSize() {
		return DefenderSize;
	}
	public void setDefenderSize(String defenderSize) {
		DefenderSize = defenderSize;
	}

	public String getSummer() {
		return summer;
	}
	public void setSummer(String data) {
		this.summer = data;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return "BattleDetails [Battleid=" + Battleid + ", name=" + name + ", year=" + year + ", battlenumber="
				+ battlenumber + ", attackerking=" + attackerking + ", deffenderking=" + deffenderking + ", AttackerID="
				+ AttackerID + ", DeffenderID=" + DeffenderID + ", AttackerOutcome=" + AttackerOutcome + ", BattleType="
				+ BattleType + ", MajorDeath=" + MajorDeath + ", MajorCapture=" + MajorCapture + ", AttackerSize="
				+ AttackerSize + ", DefenderSize=" + DefenderSize + ", DefenderCommander=" + 
				 ", summer=" + summer + ", location=" + location + ", region=" + region + ", note=" + note + "]";
	}
	

}
