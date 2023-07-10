package Logic;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import Dominios.AI;
import Dominios.Programmers;
import Dominios.Soldiers;
import Dominios.StatsCountry;
import Dominios.Users;

public class Container implements ContainerInterface{
	
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
	
	// Interface adds

	@Override
	public boolean searchByUserName(String username, String password) {
		
		Iterator<Users> it = UserList.iterator();
		
		int encontrado = 0;
		
		while (it.hasNext()) {
			
			Users user = (Users) it.next();
			
			if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
				
				encontrado = 1;
			}
		}
		if (encontrado == 1) return true;
		else return false;
		
	}

	@Override
	public String showSoldiers(int i) {
		
		return SoldierList.get(i).toString();
	}

	@Override
	public int returnSizeArraySoldiers(ArrayList<Soldiers> soldiers) {
		
		return SoldierList.size();
	}

	@Override
	public int returnSizeArrayProgrammers(ArrayList<Programmers> soldiers) {
	
		return ProgrammersList.size();
	}

	@Override
	public String showProgrammers(int i) {
		
		return ProgrammersList.get(i).toString();
	}
	
	public void savedUsersTxt() throws IOException {
		Iterator<Users> it = UserList.iterator();
		FileWriter escribir;
		PrintWriter linea;
		File archivo = new File("users.txt");
		
		escribir = new FileWriter(archivo,true);
		linea = new PrintWriter(escribir);
		BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
		bw.write("");
		
		
		while (it.hasNext()) {
			
			Users user = (Users) it.next();
			
			linea.println(user.getUserName()+","+user.getPassword()+","+user.getCountry()+","+user.getTypeUser());
		}
		
		linea.close();
		escribir.close();
		bw.close();
	}
	
	//User admin or not
	public boolean userAdmin(String username) {
		
		Iterator<Users> it = UserList.iterator();
		
		int encontrado = 0;
		
		while (it.hasNext()) {
			
			Users user = (Users) it.next();
			
			if (user.getUserName().equals(username)) {
				if(user.getTypeUser().toLowerCase().strip().equals("admin")) {
					encontrado = 1;
				}
				
			}
		}
		if (encontrado == 1) return true;
		else return false;
	}
}
