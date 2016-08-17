// interface can extends any number of interface at atime


interface Example10{
	public void display10();
}


interface Example11{
	public void display11();
}


interface Example12{
	public void display12();
}

interface Example13 extends Example11, Example12, Example10{
	
}

class Example14 implements Example13{
	public void display11(){
		System.out.println("");
	}
	public void display12(){
		System.out.println("");
	}
	@Override
	public void display10() {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceExample1 {

}
