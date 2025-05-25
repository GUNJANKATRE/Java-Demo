
public class Tuition 
{

	public static void main(String[] args)
	{
		Student s=new Student();
	    Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();
		
		
		s.setName("Gunjan");
		s.setAge(22);
		s.setAddress("Pindkepar");
		s.setPhone(9699635236L);
		s.setEmail("gunjankatre@55gmail.com");
		s.setGender("Female");
		
		System.out.println("Nmae= " +s.getName());
		System.out.println("Age= "+s.getAge());
		System.out.println("Address= "+s.getAddress());
		System.out.println("Phone= "+s.getPhone());
		System.out.println("Email= "+s.getEmail());
		System.out.println("Gender= "+s.getGender());
		
	}

}
