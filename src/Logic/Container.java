package Logic;
import java.util.*;

import Dominios.AI;
import Dominios.Programmers;
import Dominios.Soldiers;
import Dominios.StatsCountry;
import Dominios.Users;

public class Container {
	
	List<Users> UserList;
	List<Programmers> ProgrammersList;
	List<AI> IAList;
	List<Soldiers> SoldierList;
	List<StatsCountry> StatsCountryList;
	
	public Container() {

		UserList = new ArrayList<>();
		ProgrammersList = new ArrayList<>();
		IAList = new ArrayList<>();
		SoldierList = new ArrayList<>();
		StatsCountryList = new ArrayList<>();
	}

	public List<Users> getUserList() {
		return UserList;
	}

	public void setUserList(List<Users> userList) {
		UserList = userList;
	}

	public List<Programmers> getProgrammersList() {
		return ProgrammersList;
	}

	public void setProgrammersList(List<Programmers> programList) {
		ProgrammersList = programList;
	}

	public List<AI> getIAList() {
		return IAList;
	}

	public void setIAList(List<AI> iAList) {
		IAList = iAList;
	}

	public List<Soldiers> getSoldierList() {
		return SoldierList;
	}

	public void setSoldierList(List<Soldiers> soldierList) {
		SoldierList = soldierList;
	}

	public List<StatsCountry> getStatsCountryList() {
		return StatsCountryList;
	}

	public void setStatsCountryList(List<StatsCountry> statsCountryList) {
		StatsCountryList = statsCountryList;
	}
	
	

}
