
public class Static_Keywords {
	
	int rollNo;
	String name;
	static String college = "sona";
	
	public Static_Keywords(int r, String s) {
		// TODO Auto-generated constructor stub
	 rollNo = r;
	 name = s;
	}
	void display(){
		System.out.println(rollNo+":"+name+ ":"+college);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Static_Keywords s1 = new Static_Keywords(001, "karthi");
		s1.display();
		
		Static_Keywords s2 = new Static_Keywords(002, "suriya");
		s2.display();
		
		

	}

}
