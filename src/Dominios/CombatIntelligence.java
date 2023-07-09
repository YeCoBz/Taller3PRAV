package Dominios;

public class CombatIntelligence extends Soldiers{

	private int intReports,idenEnemies;

	public CombatIntelligence(String id, String name, String lastname, String nickname, String specialty,
			int courageSouldier, int intReports, int idenEnemies) {
		super(id, name, lastname, nickname, specialty, courageSouldier);
		this.intReports = intReports;
		this.idenEnemies = idenEnemies;
	}

	public int getIntReports() {
		return intReports;
	}

	public void setIntReports(int intReports) {
		this.intReports = intReports;
	}

	public int getIdenEnemies() {
		return idenEnemies;
	}

	public void setIdenEnemies(int idenEnemies) {
		this.idenEnemies = idenEnemies;
	}
	
	
}
