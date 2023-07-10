package Dominios;

public abstract class Soldiers {
	
	protected String id,name,lastname,nickname,specialty;
	protected int courageSouldier;
	
	public Soldiers(String id, String name, String lastname, String nickname, String specialty, int courageSouldier) {

		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.nickname = nickname;
		this.specialty = specialty;
		this.courageSouldier = courageSouldier;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public int getCourageSouldier() {
		return courageSouldier;
	}

	public void setCourageSouldier(int courageSouldier) {
		this.courageSouldier = courageSouldier;
	}
	
}
