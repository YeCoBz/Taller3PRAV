package Logic;

public interface ContainerInterface {
	
	/**
	 * Search the list of users if the user exists and if the password is correct
	 * @param username
	 * @param password
	 * @return if the user exists, return true
	 */
	boolean searchByUserName(String username, String password);

}
