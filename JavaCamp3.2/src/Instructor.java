
public class Instructor extends User {
	private String experienceYear;
	private String lessonCode;
	public Instructor() {
		
	}
	public Instructor(int id, String name, String surname, String eMail, String password,String experienceYear, String lessonCode) {
		super( id,name, surname, eMail,  password);
		this.experienceYear = experienceYear;
		this.lessonCode = lessonCode;
	}
	public String getExperienceYear() {
		return experienceYear;
	}
	public void setExperienceYear(String experienceYear) {
		this.experienceYear = experienceYear;
	}
	public String getLessonCode() {
		return lessonCode;
	}
	public void setLessonCode(String lessonCode) {
		this.lessonCode = lessonCode;
	}
	

}
