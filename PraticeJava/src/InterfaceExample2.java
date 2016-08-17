// interface can only extended by interface. Classes has to implements the interface

interface ExampleA {
	abstract void display1();

	public void display2();
}

interface ExampleB extends ExampleA {
   void display3();
}

class ExampleC implements ExampleB {
	public void display1() {
		System.out.println("display 1");
	}

	public void display2() {
		System.out.println("display 2");
	}

	@Override
	public void display3() {
		// TODO Auto-generated method stub
		
	}
}

public class InterfaceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleC obj = new ExampleC();
		obj.display1();

		obj.display2();

	}

}
