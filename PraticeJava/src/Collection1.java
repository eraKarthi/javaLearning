// ArrayList

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("karthi");
		al.add("joel");
		al.add("naveen");

			for(String name : al){
				System.out.println(name);
			}
	}

}
