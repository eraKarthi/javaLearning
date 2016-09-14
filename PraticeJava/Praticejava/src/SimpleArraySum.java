import java.sql.Array;
import java.util.Scanner;


public class SimpleArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int ans = 0;
		
		int Array[] = new int[n];
		
		for(int i = 0; i < n; i++){
			Array[i] = in.nextInt();
			ans = ans + Array[i];
			}
		System.out.println(ans);
		in.close();
	
	}

}
