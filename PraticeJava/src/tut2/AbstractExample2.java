package tut2;

// abstract class can inherited by a class or abstract class


class Ex1{
	void display1(){
		System.out.println("display 1");
	}
}

abstract class Ex2 extends Ex1{
	void display2(){
		System.out.println("display 2");
	}
}

class Ex3 extends Ex2{
	
}

public class AbstractExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ex2 obj = new Ex3();   // cannot instantiate for Abstract Class but can instantiate by extended class
		obj.display1();
		obj.display2();

	}

}
