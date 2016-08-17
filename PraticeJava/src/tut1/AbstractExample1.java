package tut1;
// Abstract class can extend only one class or one abstract class at a time


class Example1{
	void display11(){
		System.out.println("display 1");
	}
}

abstract class Example2{
	void display2(){
		System.out.println("display 2");
	}
}

abstract class Example3 extends Example1{
	void display3(){
		System.out.println("display 3");
	}
}

class Example4 extends Example3{
	void display1(){
		System.out.println("display 4");
	}
}

class Example5 extends Example2{
	void display(){
		System.out.println("hi");
	}
}

public class AbstractExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example5 obj = new Example5();
		obj.display();
		
		Example4 obj1 = new Example4();
		obj1.display11();

	}

}
