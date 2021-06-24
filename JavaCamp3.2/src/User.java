
public class User {
	private int id;
private String name;
private String Surname;
private String eMail;
private String password;
public User() {
	
}

public User(int id, String name, String surname, String eMail, String password) {
	
	this.id = id;
	this.name = name;
	Surname = surname;
	this.eMail = eMail;
	this.password = password;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return Surname;
}
public void setSurname(String surname) {
	Surname = surname;
}
public String geteMail() {
	return eMail;
}
public void seteMail(String eMail) {
	this.eMail = eMail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


}
