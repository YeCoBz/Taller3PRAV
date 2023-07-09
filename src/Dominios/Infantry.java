package Dominios;

public class Infantry extends Soldiers{
	
	private int missionsCompleted;
	private String favoriteWapon;
	
	public Infantry(String id, String name, String lastname, String nickname, String specialty, int courageSouldier,
			int missionsCompleted, String favoriteWapon) {
		
		super(id, name, lastname, nickname, specialty, courageSouldier);
		this.missionsCompleted = missionsCompleted;
		this.favoriteWapon = favoriteWapon;
		
	}
	public int getMissionsCompleted() {
		return missionsCompleted;
	}
	public void setMissionsCompleted(int missionsCompleted) {
		this.missionsCompleted = missionsCompleted;
	}
	public String getFavoriteWapon() {
		return favoriteWapon;
	}
	public void setFavoriteWapon(String favoriteWapon) {
		this.favoriteWapon = favoriteWapon;
	}
	
	

}
