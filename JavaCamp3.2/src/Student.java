
public class Student extends User{
private String school;
private String studentNumber;
public Student() {
	
}
public Student(int id, String name, String surname, String eMail, String password,String school, String studentNumber) {
	super( id,name, surname, eMail,  password);
	this.school = school;
	this.studentNumber = studentNumber;
}
public String getSchool() {
	return school;
}
public void setSchool(String school) {
	this.school = school;
}
public String getStudentNumber() {
	return studentNumber;
}
public void setStudentNumber(String studentNumber) {
	this.studentNumber = studentNumber;
}
}
