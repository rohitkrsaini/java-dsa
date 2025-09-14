package recurrion_basics;

public class basics4 {

	public static void main(String[] args) {
		
		printNum(1);

	}

	public static void printNum(int n) {
		if(n<=3){
			printNum(n+1);
			System.out.println(n);
		}
		else
			System.out.println("this is else block");
		System.out.println(n);
	}
}
