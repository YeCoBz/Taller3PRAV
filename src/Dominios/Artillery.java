package Dominios;

public class Artillery extends Soldiers{
	
	private int targetsDestroyed, precision;

	public Artillery(String id, String name, String lastname, String nickname, String specialty, int courageSouldier,
			int targetsDestroyed, int precision) {
		super(id, name, lastname, nickname, specialty, courageSouldier);
		this.targetsDestroyed = targetsDestroyed;
		this.precision = precision;
	}

	public int getTargetsDestroyed() {
		return targetsDestroyed;
	}

	public void setTargetsDestroyed(int targetsDestroyed) {
		this.targetsDestroyed = targetsDestroyed;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	@Override
	public String toString() {
		return "Artillery [targetsDestroyed=" + targetsDestroyed + ", precision=" + precision + ", id=" + id + ", name="
				+ name + ", lastname=" + lastname + ", nickname=" + nickname + ", specialty=" + specialty + "]";
	}

	

}
