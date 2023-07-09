package Dominios;

public class ThreatAnalyst extends Programmers{
	
	private String abilityIdent;
	private int numThreatsDetected;
	public ThreatAnalyst(String idProgrammers, String name, String lastname, String specialty, String abilityIdent,
			int numThreatsDetected) {
		super(idProgrammers, name, lastname, specialty);
		this.abilityIdent = abilityIdent;
		this.numThreatsDetected = numThreatsDetected;
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
	
	

}
