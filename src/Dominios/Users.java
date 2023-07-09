package Dominios;

public class Users {
	
	private String userName,password,country,typeUser;

	public Users(String userName, String password, String country, String typeUser) {

		this.userName = userName;
		this.password = password;
		this.country = country;
		this.typeUser = typeUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTypeUser() {
		return typeUser;
	}

	public void setTypeUser(String typeUser) {
		this.typeUser = typeUser;
	}
	
	

}
