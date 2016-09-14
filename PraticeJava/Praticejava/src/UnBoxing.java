
public class UnBoxing {

	public static void main(String[] args){
		
		Integer i = new Integer(-9);
		
		int absVal = absoluteValue(i);
		
		System.out.println("absolute value of " + i + " = " +absVal );
			
	}
		
	public static int absoluteValue(int i){
		
	return (i < 0) ? -i : i; 
		
	}
	
}
