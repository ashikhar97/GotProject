package com.GotProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Deffender_Commander")
public class DeffenderCommander {
		
		@Id
		@Column(name="DeffenderCommanderID")
		private int DeffenderCommanderID;
		
		@Column(name="DeffenderCommanderName")
		private String DeffenderCommanderName;

		public int getDeffenderCommanderID() {
			return DeffenderCommanderID;
		}

		public void setDeffenderCommanderID(int deffenderCommanderID) {
			DeffenderCommanderID = deffenderCommanderID;
		}

		public String getDeffenderCommanderName() {
			return DeffenderCommanderName;
		}

		public void setDeffenderCommanderName(String deffenderCommanderName) {
			DeffenderCommanderName = deffenderCommanderName;
		}

	
}
