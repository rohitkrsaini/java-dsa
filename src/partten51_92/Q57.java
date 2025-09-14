package partten51_92;

public class Q57 {
	
	public static void main(String[] args) {
		int n=5;
		printPartten(n);

	}

	public static void printPartten(int n) {
		int star = 1; int space = n-1; int num = 15;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
		for(int k=1;k<=star;k++) {
			System.out.printf("%4d",num);
			 num--;
		}
		star++;space--;
			System.out.println();
		}
	}
}
