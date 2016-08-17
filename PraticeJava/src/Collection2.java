import java.util.ArrayList;

class Student{
	int rollNo;
	String name;
	String dept;
	
	Student(int rollNo, String name, String dept){
		this.rollNo = rollNo;
		this.name = name;
		this.dept = dept;
	}
}


public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student s1 = new Student(1, "karthi", "mech");
		Student s2 = new Student(1, "joel", "csc");
		Student s3 = new Student(1, "naveen", "mechtronics");
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		for(Student detail : al){
			System.out.println(detail.rollNo);
			System.out.println(detail.name);
			System.out.println(detail.dept);
		}
		
		
		

	}

}
