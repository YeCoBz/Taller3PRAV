package Dominios;

public class SpecialOperations extends Soldiers {
	
	private int succCovMissions,totalMissions,resoObtained;

	public SpecialOperations(String id, String name, String lastname, String nickname, String specialty,
			int courageSouldier, int succCovMissions, int totalMissions, int resoObtained) {
		super(id, name, lastname, nickname, specialty, courageSouldier);
		this.succCovMissions = succCovMissions;
		this.totalMissions = totalMissions;
		this.resoObtained = resoObtained;
	}

	public int getSuccCovMissions() {
		return succCovMissions;
	}

	public void setSuccCovMissions(int succCovMissions) {
		this.succCovMissions = succCovMissions;
	}

	public int getTotalMissions() {
		return totalMissions;
	}

	public void setTotalMissions(int totalMissions) {
		this.totalMissions = totalMissions;
	}

	public int getResoObtained() {
		return resoObtained;
	}

	public void setResoObtained(int resoObtained) {
		this.resoObtained = resoObtained;
	}

	@Override
	public String toString() {
		return "SpecialOperations [succCovMissions=" + succCovMissions + ", totalMissions=" + totalMissions
				+ ", resoObtained=" + resoObtained + ", id=" + id + ", name=" + name + ", lastname=" + lastname
				+ ", nickname=" + nickname + ", specialty=" + specialty + "]";
	}
	
	

}
