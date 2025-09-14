package parttren_programing;
import java.util.Scanner;

public class mixed {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int r = sc.nextInt();
		printPattern(r);
	}
	
	public static void printPattern(int n) {
	
		if(n%2 ==0) {
			System.out.println("pattern not possiable for even row");
;		return;}
		
		int mid = n/2 +1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1 || i==n || j==1 || j==n || i==j || i+j==n+1 || i==mid || j==mid)
				     System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			System.out.println("*");
		}
	}
}