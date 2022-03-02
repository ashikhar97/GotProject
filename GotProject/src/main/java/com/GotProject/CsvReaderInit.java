package com.GotProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.GotProject.Entity.AttackerCommander;
import com.GotProject.Entity.AttackerInformation;
import com.GotProject.Entity.BattleAttackCommander;
import com.GotProject.Entity.BattleDetails;
import com.GotProject.Entity.DefenderInformation;
import com.GotProject.Repository.AttackerCommnderRepo;
import com.GotProject.Repository.AttackerInfoRepo;
import com.GotProject.Repository.BattleAttackCommanderRepo;
import com.GotProject.Repository.BattleDetailsRepo;
import com.GotProject.Repository.DefenderInfoRepo;

@Component
public class CsvReaderInit {



	@Autowired
	public BattleDetailsRepo BDetrepo;

	@Autowired
	public AttackerInfoRepo AttackerInforepo;

	@Autowired
	public AttackerCommnderRepo AttackerCommanderRepo;


	@Autowired
	public DefenderInfoRepo DefenderInforepo;

	@Autowired
	public BattleAttackCommanderRepo BattleAttackerComRepo;



	@PostConstruct
	public void init() throws NumberFormatException, IOException{
			SaveBattleDetails();
			SaveAttackerCommander();
			SaveAttackerInformation();
			SaveBattleAttackCommander();
			SaveDefenderInformation();
	

}



public void SaveBattleDetails() throws NumberFormatException, IOException {

	String line = "";
	BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Battle Details.csv"));

	while((line=br.readLine())!=null) {



		String[] data = line.split(",");

		BattleDetails batdetail =  new BattleDetails();

		batdetail.setName(data[0]);
		batdetail.setYear(data[1]);
		batdetail.setBattlenumber(Integer.parseInt(data[2]));
		batdetail.setAttackerking(data[3]);
		batdetail.setDeffenderking(data[4]);
		batdetail.setAttackerID(Integer.parseInt(data[5]));
		batdetail.setDeffenderID(Integer.parseInt(data[6]));
		batdetail.setAttackerOutcome(data[7]);
		batdetail.setBattleType(data[8]);
		batdetail.setMajorDeath(data[9]);
		batdetail.setMajorCapture(data[10]);
		batdetail.setAttackerSize(data[11]);
		batdetail.setDefenderSize(data[12]);

		batdetail.setSummer(data[13]);
		batdetail.setLocation(data[14]);
		batdetail.setRegion(data[15]);
		batdetail.setNote(data[16]);

		BDetrepo.save(batdetail);
	}


}


public void SaveAttackerCommander() throws NumberFormatException, IOException {

	BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Attacker Commander Information.csv"));
	String line = "";
	while((line=br.readLine())!=null) {

		String[] data2 = line.split(",");	
		AttackerCommander AttackerCommander = new AttackerCommander();

		AttackerCommander.setAttackerCommanderID(Integer.parseInt(data2[0]));
		AttackerCommander.setAttackerCommanderName(data2[1]);

		AttackerCommanderRepo.save(AttackerCommander);

	}

}


public void SaveAttackerInformation() throws NumberFormatException, IOException {

	BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Attacker Information.csv"));
	String line = "";
	while((line=br.readLine())!=null) {

	
		String[] data2 = line.split(",");

		AttackerInformation AttackerInfo = new AttackerInformation();

		AttackerInfo.setAttackerID(Integer.parseInt(data2[0]));
		AttackerInfo.setName(data2[1]);

		AttackerInforepo.save(AttackerInfo);

	}

}
public void SaveBattleAttackCommander() throws NumberFormatException, IOException  {

	BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Battle_Attack_Commander.csv")); 
	String line = "";
	while((line=br.readLine())!=null) {
		
		String[] data5 = line.split(",");

		BattleAttackCommander BattleAttackCommander = new BattleAttackCommander();

		BattleAttackCommander.setBattleAttackCommanderID(Integer.parseInt(data5[0]));
		BattleAttackCommander.setAttackerCommanderID(Integer.parseInt(data5[1]));
		BattleAttackCommander.setBattleID(Integer.parseInt(data5[2]));
		BattleAttackerComRepo.save(BattleAttackCommander);

	}
}
public void SaveDefenderInformation() throws NumberFormatException, IOException  {
	
	BufferedReader br = new BufferedReader(new FileReader("src/main/resources/Defender Information.csv"));
	String line = "";
	while((line=br.readLine())!=null) {
	String[] data4 = line.split(",");

	DefenderInformation DefenderInfo = new DefenderInformation();

	DefenderInfo.setDefenderId(Integer.parseInt(data4[0]));
	DefenderInfo.setDefenderName(data4[1]);

	DefenderInforepo.save(DefenderInfo);
	}

}

}
