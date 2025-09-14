package recurrion_basics;

public class basics5 {

public static void main(String[] args) {
		
		printNum(1);

	}

	public static void printNum(int n) {
		if(n<=2){
			
	    	printNum(n+1);
	    	System.out.println(n);
		
		printNum(n+1);
		}
	}
}
