package Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Dominios.AI;
import Dominios.AIEngineer;
import Dominios.Artillery;
import Dominios.CryptographyExpert;
import Dominios.Infantry;
import Dominios.LogisticalSupport;
import Dominios.Programmers;
import Dominios.Soldiers;
import Dominios.SpecialOperations;
import Dominios.ThreatAnalyst;
import Dominios.Users;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		Container container = new Container();
		Scanner scan = null;
		
		readSaveUsers(scan,container);
		readSaveAI(scan,container);
		readSaveProgrammers(scan,container);
		readSaveSoldiers(scan,container);
		readSaveStatsCountry(scan,container);
		

	}

	private static void readSaveStatsCountry(Scanner scan, Container container) throws FileNotFoundException {
		
		scan = new Scanner(new File("stats-country.txt"));
		
		String country;
		int peopleBefore,peopleAfter,attacksMade,allPeople;
		
		while (scan.hasNext()) {
			
			String[] parts = scan.nextLine().split(",");
			
			country = parts[0];
			
			int pos = 1;
			
			String strPeopleBefore = "";
			
			for (int i = 1;parts[i]!="000";i++) {
				strPeopleBefore += parts[i].strip();
				pos++;
			}
			System.out.println(strPeopleBefore);
			peopleBefore = Integer.parseInt(strPeopleBefore);
			
			String strPeopleAfter = "";
			
			for (int i = pos;parts[pos] != "000";i++) {
				strPeopleAfter += parts[pos].strip();
				pos++;
			}
			System.out.println(strPeopleAfter);
			peopleAfter = Integer.parseInt(strPeopleAfter);
			
		}
		
	}

	private static void readSaveSoldiers(Scanner scan, Container container) throws FileNotFoundException {
		
		scan = new Scanner(new File("stats-soldiers.txt"));
		
		String id,name,lastname,nickname,specialty;
		int courageSouldier;
		
		Soldiers soldier = null;
		
		while (scan.hasNext()) {
			
			String[] parts = scan.nextLine().split(",");
			id = parts[0];
			name = parts[1];
			lastname = parts[2];
			nickname = parts[3];
			specialty = parts[4].toLowerCase().strip();
			courageSouldier = Integer.parseInt(parts[5].strip());
			
			switch (specialty) {
			
			case "infantería":
				
				int missionsCompleted = Integer.parseInt(parts[6].strip());
				String gun = parts[7];
				
				soldier = new Infantry(id,name,lastname,nickname,specialty,courageSouldier,missionsCompleted,gun);
				container.getSoldierList().add(soldier);
				break;
			
			case "artillería":
				
				int targetsDestroyed = Integer.parseInt(parts[5].strip());
				int precision = Integer.parseInt(parts[6].strip());
				
				soldier = new Artillery(id,name,lastname,nickname,specialty,courageSouldier,targetsDestroyed,precision);
				container.getSoldierList().add(soldier);
				break;
			
			case "operaciones especiales":
				
				int succCovMissions = Integer.parseInt(parts[5].strip());
				int totalMissions = Integer.parseInt(parts[6].strip());
				int resoObtained = Integer.parseInt(parts[7].strip());
				
				soldier = new SpecialOperations(id,name,lastname,nickname,specialty,courageSouldier,succCovMissions,totalMissions,resoObtained);
				container.getSoldierList().add(soldier);
				break;
			
			case "apoyo logístico":
				
				int distriSupplies = Integer.parseInt(parts[5].strip());
				int servTroops = Integer.parseInt(parts[6].strip());
				
				soldier = new LogisticalSupport(id,name,lastname,nickname,specialty,courageSouldier,distriSupplies,servTroops);
				container.getSoldierList().add(soldier);
				break;
			}
			
		}
	}

	private static void readSaveProgrammers(Scanner scan, Container container) throws FileNotFoundException {
		
		scan = new Scanner(new File("stats- programmers.txt"));
		
		String id,name,lastname,specialty;
		Programmers programmer = null;
		
		while (scan.hasNext()) {
			
			String[] parts = scan.nextLine().split(",");
			id = parts[0];
			name = parts[1];
			lastname = parts[2];
			specialty = parts[3].toLowerCase();
			
			switch (specialty) {
			
			case "ingeniero de ia":
				String levelExp = parts[4].toLowerCase();
				int numImpAlgo = Integer.parseInt(parts[5]);
				
				programmer = new AIEngineer(id,name,lastname,specialty,levelExp,numImpAlgo);
				container.getProgrammersList().add(programmer);
				break;
			case "analista de amenazas":
				
				String abilityIdent = parts[4].toLowerCase();
				int numThreatsDetected = Integer.parseInt(parts[5]);
				
				programmer = new ThreatAnalyst(id,name,lastname,specialty,abilityIdent,numThreatsDetected);
				container.getProgrammersList().add(programmer);
				break;
			case "experto en criptografía":
				
				String knowCryptAlg = parts[4];
				String levelExpSecurity = parts[5];
				int numSucces = Integer.parseInt(parts[6]);
				String obsSkillLevel = parts[7];
				
				programmer = new CryptographyExpert(id,name,lastname,specialty,knowCryptAlg,levelExpSecurity,numSucces,obsSkillLevel);
				container.getProgrammersList().add(programmer);
				break;
			}
			
			
			
		}
		
	}

	private static void readSaveAI(Scanner scan, Container container) throws FileNotFoundException {
		
		scan = new Scanner(new File("ia.txt"));
		
		String name,classAI;
		int health;
		
		while (scan.hasNext()) {
			
			String[] parts = scan.nextLine().split(",");
			name = parts[0];
			classAI = parts[1].strip();
			health = Integer.parseInt(parts[2].strip());
			
			AI ai = new AI(name,classAI,health);
			container.getIAList().add(ai);
		}
		
		
	}

	private static void readSaveUsers(Scanner scan, Container container) throws FileNotFoundException {
		
		scan = new Scanner(new File("users.txt"));
		String name,password,country,typeUser;
		
		while (scan.hasNext()) {
			
			String[] parts = scan.nextLine().split(",");
			
			name = parts[0];
			password = parts[1];
			country = parts[2];
			typeUser = parts[3];
			
			Users user = new Users(name,password,country,typeUser);
			container.getUserList().add(user);
		}	
		
	}

}
