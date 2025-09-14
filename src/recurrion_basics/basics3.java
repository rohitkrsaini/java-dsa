package recurrion_basics;

public class basics3 {

	public static void main(String[] args) {
		
		printNum(1);

	}

	public static void printNum(int n) {
		if(n<=3){
			System.out.println(n);
	    	printNum(n+1);
		}
		else
			System.out.println("this is else block");
		System.out.println(n);
	}
}
