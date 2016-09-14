import java.util.Scanner;


public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
        int numInputs = scan.nextInt();
        scan.close();
        
        for(int i = 1; i <= numInputs; i++){ // rows
            
            int j = numInputs;
            
            // loop to print (size - i) spaces
            while(j-- > i) {
                System.out.print(" ");
            }
            // loop to print (i) #s
            while(j-- >= 0) {
                System.out.print("#");
            }
            
            System.out.println();
        }

	}

}
