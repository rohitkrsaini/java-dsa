package partten51_92;

public class Q51 {

	public static void main(String[] args) {
		int n=7;
		printPartten(n);

	}

	public static void printPartten(int n) {
		int star = 1; int space = n-1; 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
		for(int k=1;k<=star;k++) {
			System.out.print("*   ");
			
		}
		star+=1;space--;
			System.out.println();
		}
	}
}
