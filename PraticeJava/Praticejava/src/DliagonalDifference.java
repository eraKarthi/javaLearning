import java.util.Scanner;


public class DliagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int d1 = 0;
		int d2 = 0;
		int d3 = 0;
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int a[][] = new int[n][n];
		
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				
				a[i][j] = in.nextInt();
				if(a[i] == a[j]){
					
					d1 = d1 + a[i][j];
					
				}	
				
				if(a[i] == a[n-j-1]){
					d2 = d2 + a[i][j];
				}
				
				d3 = d1 - d2;
			}
		}
		
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("the difference is : "+ d3);
		
		
		
		
		

	}

}
