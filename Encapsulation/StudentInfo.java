
public class StudentInfo
{

	public static void main(String[] args)
	{
		Student s=new Student();
		
		s.setStudentName("Gunjan");
		s.setStudentId("Gunjan@123");
		s.setGrade('A');
		
		System.out.println("Student Name= "+s.getStudentName());
		System.out.println("Student Id= "+s.getStudentId());
		System.out.println("Grade= "+s.getGrade());

	}

}
