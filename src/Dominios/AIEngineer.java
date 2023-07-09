package Dominios;

public class AIEngineer extends Programmers{
	
	private String levelExperience;
	private int numAlg;
	private int totalExp;
	public AIEngineer(String idProgrammers, String name, String lastname, String specialty, String levelExperience,
			int numAlg) {
		super(idProgrammers, name, lastname, specialty);
		this.levelExperience = levelExperience;
		this.numAlg = numAlg;
		if (levelProgrammer(levelExperience)>999) {
			this.totalExp = 999;
		} else {
			this.totalExp = levelProgrammer(levelExperience);
		}
		
		
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
	public int getTotalExp() {
		return totalExp;
	}
	public void setTotalExp(int totalExp) {
		this.totalExp = totalExp;
	}
	private int levelProgrammer(String levelExperience) {
		
		switch (levelExperience) {
		
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
