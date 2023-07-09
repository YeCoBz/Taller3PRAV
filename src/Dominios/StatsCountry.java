package Dominios;

public class StatsCountry {
	
	private String name;
	private int peopleBefore,peopleAfter,attacksMade,allPeople;
	public StatsCountry(String name, int peopleBefore, int peopleAfter, int attacksMade, int allPeople) {

		this.name = name;
		this.peopleBefore = peopleBefore;
		this.peopleAfter = peopleAfter;
		this.attacksMade = attacksMade;
		this.allPeople = allPeople;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeopleBefore() {
		return peopleBefore;
	}
	public void setPeopleBefore(int peopleBefore) {
		this.peopleBefore = peopleBefore;
	}
	public int getPeopleAfter() {
		return peopleAfter;
	}
	public void setPeopleAfter(int peopleAfter) {
		this.peopleAfter = peopleAfter;
	}
	public int getAttacksMade() {
		return attacksMade;
	}
	public void setAttacksMade(int attacksMade) {
		this.attacksMade = attacksMade;
	}
	public int getAllPeople() {
		return allPeople;
	}
	public void setAllPeople(int allPeople) {
		this.allPeople = allPeople;
	}
	
	
}
