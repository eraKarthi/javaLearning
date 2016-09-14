import java.util.Scanner;

public class Table {

	static int n;
	static int digit1;
	static int digit2;
	
	static String str1[], str2[];
	public static void input()
	{   
	     
	       System.out.printf("Enter The Number : "+"%n");
			Scanner in = new Scanner(System.in);
		    n = in.nextInt();
		    
		String str1[] = { "", " ", "twenty", "thirty", "fourty", "fifty",
				          "sixty", "seventy", "eighty", "ninety" };

		String str2[] = { " ", "one", "two", "three", "four", "five", "six",
			              "seven", "eight", "nine", "ten", "eleven", "twelve",
				          "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				          "eighteen", "nineteen" };
		
		if ((n <= 0) || (n > 99)) {
			System.out.println("enter number between 1 to 99");
			input();
		}
		else if ((n >= 1) && (n <= 19)) {
			System.out.println(str2[n]);
		}
		else if((n >= 20) && (n <= 99)) {
			digit1 = n / 10;
			digit2 = n % 10;
			System.out.println(str1[digit1] + str2[digit2]);
		}
		
		//int Array[] = new int[10];
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "*" + n + "=" + i * n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    input();
	     
	//in.close();
	}
}
