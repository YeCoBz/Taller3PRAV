package Dominios;

public class LogisticalSupport extends Soldiers{

	private int distriSupplies,servTroops;

	public LogisticalSupport(String id, String name, String lastname, String nickname, String specialty,
			int courageSouldier, int distriSupplies, int servTroops) {
		super(id, name, lastname, nickname, specialty, courageSouldier);
		this.distriSupplies = distriSupplies;
		this.servTroops = servTroops;
	}

	public int getDistriSupplies() {
		return distriSupplies;
	}

	public void setDistriSupplies(int distriSupplies) {
		this.distriSupplies = distriSupplies;
	}

	public int getServTroops() {
		return servTroops;
	}

	public void setServTroops(int servTroops) {
		this.servTroops = servTroops;
	}

	@Override
	public String toString() {
		return "LogisticalSupport [distriSupplies=" + distriSupplies + ", servTroops=" + servTroops + ", id=" + id
				+ ", name=" + name + ", lastname=" + lastname + ", nickname=" + nickname + ", specialty=" + specialty
				+ "]";
	}
	
	
}
