
public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println(user.getName()+ " isimli eðitmen sisteme eklendi.");
	}
	@Override
	public void delete(User user) {
		System.out.println(user.getName()+" isimli eðitmen sistemden silindi.");
	}
	public void lesson(Instructor instructor)
	{
		System.out.println(instructor.getName()+ " "+instructor.getSurname()+", "+ instructor.getLessonCode()+" kodlu dersi vermektedir");
	}
}
