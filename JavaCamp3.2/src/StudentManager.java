
public class StudentManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getName()+ " isimli ��renci sisteme eklendi.");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" isimli ��renci sistemden silindi.");
	}
	public void studentInfo(Student student) {
		System.out.println(student.getStudentNumber()+" numaral� ��rencinin okulu: "+student.getSchool());
	}
}
