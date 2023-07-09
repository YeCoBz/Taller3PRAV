package Dominios;

public class AIEngineer extends Programmers{
	
	private String levelExperience;
	private int numAlg;
	public AIEngineer(String idProgrammers, String name, String lastname, String specialty, String levelExperience,
			int numAlg) {
		super(idProgrammers, name, lastname, specialty);
		this.levelExperience = levelExperience;
		this.numAlg = numAlg;
	}
	public String getLevelExperience() {
		return levelExperience;
	}
	public void setLevelExperience(String levelExperience) {
		this.levelExperience = levelExperience;
	}
	public int getNumAlg() {
		return numAlg;
	}
	public void setNumAlg(int numAlg) {
		this.numAlg = numAlg;
	}
	
	

}
