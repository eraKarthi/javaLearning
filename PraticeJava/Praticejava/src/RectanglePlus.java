// Constructor

public class RectanglePlus {

	
	int a, b, c;
	
	RectanglePlus(int a, int b){
		 
		this.a = a;
		this.b = b;
		c = this.a + this.b;
		
	
	}
	void display(){
		System.out.println(c);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RectanglePlus rect1 = new RectanglePlus(1, 1);
		
		rect1.display();
		
		//System.out.println(rect1.c);
			
		
	}

}
