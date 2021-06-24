
public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getName()+ " isimli öğrenci sisteme eklendi.");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" isimli öğrenci sistemden silindi.");
	}
	public void studentInfo(Student student) {
		System.out.println(student.getStudentNumber()+" numaralı öğrencinin okulu: "+student.getSchool());
	}
}
