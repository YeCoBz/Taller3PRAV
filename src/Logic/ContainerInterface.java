package Logic;

import java.util.*;

import Dominios.Programmers;
import Dominios.Soldiers;

public interface ContainerInterface {
	
	/**
	 * Search the list of users if the user exists and if the password is correct
	 * @param username
	 * @param password
	 * @return if the user exists, return true
	 */
	boolean searchByUserName(String username, String password);
	/**
	 * return a String with all the information of the soldier
	 * @param i
	 * @return soldier information
	 */
	String showSoldiers(int i);
	/**
	 * returns the size of the list
	 * @param soldiers
	 * @return size of the list
	 */
	int returnSizeArraySoldiers(ArrayList<Soldiers> soldiers);
	/**
	 * returns the size of the list
	 * @param soldiers
	 * @return size of the list
	 */
	int returnSizeArrayProgrammers(ArrayList<Programmers> soldiers);
	/**
	 * return a String with all the information of the programmers
	 * @param i
	 * @return programmers information
	 */
	String showProgrammers(int i);
}
