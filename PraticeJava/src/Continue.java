
public class Continue {
	
	public static void main(String[] args){
	
		String searchMe = "peter picked a pepper";
		
		int max = searchMe.length();
		
		int p = 0;
		
		for(int i = 0; i < max; i++){
			if(searchMe.charAt(i) == 'p'){
				p++;
				continue;
			}
		}
		
		System.out.println("Total "+p+" P in "+searchMe);
				
	}
}
