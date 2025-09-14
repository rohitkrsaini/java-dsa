package parttren_Questions;

public class Q4 {

	public static void main(String[] args) {
		int n=15;
		printPartten(n);

	}
	
	public static void printPartten(int n) {
		int star=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) 
				System.out.print("* ");
			
			System.out.println();
			star--;
		}
		
	}

}
