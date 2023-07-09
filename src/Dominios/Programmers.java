package Dominios;

public abstract class Programmers {

	protected String idProgrammers,name,lastname,specialty;

	public Programmers(String idProgrammers, String name, String lastname, String specialty) {
		super();
		this.idProgrammers = idProgrammers;
		this.name = name;
		this.lastname = lastname;
		this.specialty = specialty;
	}

	public String getIdProgrammers() {
		return idProgrammers;
	}

	public void setIdProgrammers(String idProgrammers) {
		this.idProgrammers = idProgrammers;
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

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
	
	
}
