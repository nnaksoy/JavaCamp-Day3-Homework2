
public class Main {

	public static void main(String[] args) {
		Instructor enginDemirog=new Instructor(1,"Engin","Demiroð","engindemirog@gmail.com","1234","15","JC3");
		Student fatmaSaglam =new Student(2,"Fatma","SAÐLAM","fatmasaglam@gmail.com","5678","Kocaeli University","190201");
		
		UserManager student=new StudentManager();
		student.add(fatmaSaglam);
		
		UserManager instructor= new InstructorManager();
		instructor.add(enginDemirog);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.lesson(enginDemirog);
		StudentManager studentManager=new StudentManager();
		studentManager.studentInfo(fatmaSaglam);
		
	}

}
