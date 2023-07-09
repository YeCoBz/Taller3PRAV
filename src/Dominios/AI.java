package Dominios;

public class AI {
	
	private String aiName,classAI;
	private int health;
	private int finalHealth;
	
	public AI(String aiName, String classAIl, int health) {
		this.aiName = aiName;
		this.classAI = classAIl;
		this.health = health;
		this.finalHealth = adderHealth(classAI,health);
	}

	public String getAiName() {
		return aiName;
	}

	public void setAiName(String aiName) {
		this.aiName = aiName;
	}

	public String getClassAIl() {
		return classAI;
	}

	public void setClassAIl(String classAI) {
		this.classAI = classAI;
	}

	public int getFinalHealth() {
		return finalHealth;
	}

	public void setFinalHealth(int finalHealth) {
		this.finalHealth = finalHealth;
	}
	private int adderHealth(String c,int x) {
		
		int type = 0;
		
		switch (c) {
		
		case "s+":
			type = 2994;
		case "s":
			type = 1995;
		case "a":
			type = 994;
		case "b":
			type = 452;
		case "c":
			type = 226;
		case "d":
			type = 0;
		}
		
		int fHealth = type+x;
		
		if (fHealth>2000) {
			return 2000;
		} else return fHealth;
		
	}
	
	

}
