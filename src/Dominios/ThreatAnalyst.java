package Dominios;

public class ThreatAnalyst extends Programmers{
	
	private String abilityIdent;
	private int numThreatsDetected;
	private int levelExp;
	public ThreatAnalyst(String idProgrammers, String name, String lastname, String specialty, String abilityIdent,
			int numThreatsDetected) {
		super(idProgrammers, name, lastname, specialty);
		this.abilityIdent = abilityIdent;
		this.numThreatsDetected = numThreatsDetected;
		if (levelProgrammer(abilityIdent)>999) {
			this.levelExp = 999;
		} else {
			this.levelExp = levelProgrammer(abilityIdent);
		}
	}
	public String getAbilityIdent() {
		return abilityIdent;
	}
	public void setAbilityIdent(String abilityIdent) {
		this.abilityIdent = abilityIdent;
	}
	public int getNumThreatsDetected() {
		return numThreatsDetected;
	}
	public void setNumThreatsDetected(int numThreatsDetected) {
		this.numThreatsDetected = numThreatsDetected;
	}
	public int getLevelExp() {
		return levelExp;
	}
	public void setLevelExp(int levelExp) {
		this.levelExp = levelExp;
	}
	private int levelProgrammer(String c) {
		
		switch (c) {
		
		case "avanzado":
			return 450;
		case "intermedio":
			return 300;
		case "bajo":
			return 150;
			
		}
		return 0;
	}
	

}
