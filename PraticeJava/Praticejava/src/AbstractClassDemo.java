import java.awt.Color;

    abstract class Fruit {

	protected Color color;
	protected boolean seasonal;
	
	Fruit(Color color, boolean seasonal) {
		this.color = color;
		this.seasonal = seasonal;
	}

	abstract void prepare();

	Color getColor() {
		return color;
	}

	boolean isSeasonal() {
		return seasonal;
	}
	
    }
    
    class Mango extends Fruit{
    	
    	public Mango(Color color, boolean seasonal){
    	super(color, seasonal);
    	System.out.println(isSeasonal());
    	System.out.println(getColor());
       		
       	}

		@Override
		void prepare() {
			// TODO Auto-generated method stub
			System.out.println("cut the mango and eat");
				
		}
    	
    }
    
    class Banana extends Fruit{
    	
    	public Banana(Color color, boolean seasonal){
    		super(color, seasonal);
    		//Fruit(color, seasonal);
    		
    		System.out.println(seasonal);
        	System.out.println(getColor());
    		
       	}

		@Override
		void prepare() {
			// TODO Auto-generated method stub
			System.out.println("peel the banana and eat");
		}
    	
    }

public class AbstractClassDemo {
	
    public static void main(String args[]) {
	Fruit mango = new Mango(Color.yellow, true);
	Fruit banana = new Banana(Color.red, false);
	banana.color = Color.BLACK;
	banana.seasonal = true;
	Fruit banana1= new Banana(banana.color, banana.seasonal );
		
	mango.prepare();
	banana.prepare();
	banana1.prepare();
    }

}
