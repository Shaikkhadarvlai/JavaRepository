package oop.Encapsulation;

public class LoginPage
{
	
	//data
	private String username;
	private String password;
	
	
	//public method
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	//Business login
	public void doLogin(String un,String psw)
	{
		System.out.println("User login completed successfully!");
		System.out.println("User login with name: "+un);
		
	}
}