package Dominios;

public class EstadisticasPaises {
	
	String nombre;
	int numHabitantesPreGuerra, numHabitantesPostGuerra,numAtaques,personasReclu;
	public EstadisticasPaises(String nombre, int numHabitantesPreGuerra, int numHabitantesPostGuerra, int numAtaques,
			int personasReclu) {
		
		this.nombre = nombre;
		this.numHabitantesPreGuerra = numHabitantesPreGuerra;
		this.numHabitantesPostGuerra = numHabitantesPostGuerra;
		this.numAtaques = numAtaques;
		this.personasReclu = personasReclu;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNumHabitantesPreGuerra() {
		return numHabitantesPreGuerra;
	}
	public void setNumHabitantesPreGuerra(int numHabitantesPreGuerra) {
		this.numHabitantesPreGuerra = numHabitantesPreGuerra;
	}
	public int getNumHabitantesPostGuerra() {
		return numHabitantesPostGuerra;
	}
	public void setNumHabitantesPostGuerra(int numHabitantesPostGuerra) {
		this.numHabitantesPostGuerra = numHabitantesPostGuerra;
	}
	public int getNumAtaques() {
		return numAtaques;
	}
	public void setNumAtaques(int numAtaques) {
		this.numAtaques = numAtaques;
	}
	public int getPersonasReclu() {
		return personasReclu;
	}
	public void setPersonasReclu(int personasReclu) {
		this.personasReclu = personasReclu;
	}
	

}
