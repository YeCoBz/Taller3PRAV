package Dominios;

public class CryptographyExpert extends Programmers{
	
	private String knowCryptAlg,levelExpSecurity,obsSkillLevel;
	private int numSucces;
	private int levelExp;
	public CryptographyExpert(String idProgrammers, String name, String lastname, String specialty, String knowCryptAlg,
			String levelExpSecurity, int numSucces, String obsSkillLevel) {
		super(idProgrammers, name, lastname, specialty);
		this.knowCryptAlg = knowCryptAlg;
		this.levelExpSecurity = levelExpSecurity;
		this.obsSkillLevel = obsSkillLevel;
		this.numSucces = numSucces;
		if ((levelProgrammer(knowCryptAlg)+levelProgrammer(obsSkillLevel))>999) {
			this.levelExp = 999;
		} else {
			this.levelExp = levelProgrammer(knowCryptAlg)+levelProgrammer(obsSkillLevel);
		}
	}
	public String getKnowCryptAlg() {
		return knowCryptAlg;
	}
	public void setKnowCryptAlg(String knowCryptAlg) {
		this.knowCryptAlg = knowCryptAlg;
	}
	public String getLevelExpSecurity() {
		return levelExpSecurity;
	}
	public void setLevelExpSecurity(String levelExpSecurity) {
		this.levelExpSecurity = levelExpSecurity;
	}
	public String getObsSkillLevel() {
		return obsSkillLevel;
	}
	public void setObsSkillLevel(String obsSkillLevel) {
		this.obsSkillLevel = obsSkillLevel;
	}
	public int getNumSucces() {
		return numSucces;
	}
	public void setNumSucces(int numSucces) {
		this.numSucces = numSucces;
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
