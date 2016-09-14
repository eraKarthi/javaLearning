
public class MyList{
	
	int info;
	MyList link;
	
	/*MyList(){
		this.link = null;
	}*/
}

class LinkedListDemo{
		
	public static void main (String args[]){
		
		MyList a = new MyList();
		MyList b = new MyList();
		MyList c = new MyList();
		
		a.info = 1;
		b.info = 2;
		c.info = 3;
		
		// link the node 
		a.link = b;
		b.link = c;
		
		while (a != null){
			System.out.print(a.info + "-->");	
			a = a.link;
		}
	
		System.out.println("null");
	}
}
