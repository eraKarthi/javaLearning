import java.util.Scanner;


public class CompareTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner in = new Scanner(System.in);
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        
	        int out =((a0 > b0) ? 1 : 0) + ((a1 > b1) ? 1 : 0) + ((a2 > b2) ? 1 : 0); 
	        int out1 =((b0 > a0) ? 1 : 0) + ((b1 > a1) ? 1 : 0) + ((b2 > a2) ? 1 : 0);
	        
	        System.out.println(out + " " + out1);
	        in.close();
	}

}
