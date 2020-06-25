package java;

public class User {
	String user, pass, connectionTime;

	public User(String user, String pass, String connectionTime) {
		this.user = user;
		this.pass = pass;
		this.connectionTime = connectionTime;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getConnectionTime() {
		return connectionTime;
	}

	public void setConnectionTime(String connectionTime) {
		this.connectionTime = connectionTime;
	}
	
}
