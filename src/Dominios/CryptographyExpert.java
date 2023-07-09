package Dominios;

public class CryptographyExpert extends Programmers{
	
	private String knowCryptAlg,levelExpSecurity,obsSkillLevel;
	private int numSucces;
	public CryptographyExpert(String idProgrammers, String name, String lastname, String specialty, String knowCryptAlg,
			String levelExpSecurity, int numSucces, String obsSkillLevel) {
		super(idProgrammers, name, lastname, specialty);
		this.knowCryptAlg = knowCryptAlg;
		this.levelExpSecurity = levelExpSecurity;
		this.obsSkillLevel = obsSkillLevel;
		this.numSucces = numSucces;
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
	
	

}
