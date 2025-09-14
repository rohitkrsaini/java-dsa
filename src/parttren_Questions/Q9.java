package parttren_Questions;

public class Q9 {

	public static void main(String[] args) {
		int n=5;
		printPattern(n);

	}
	public static void printPattern(int n) {
		int star = n;
		int space = 0;
		char ch = 'A';
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++)
				System.out.print("  ");
			for(int k=1;k<=star;k++) {
				System.out.print(ch+" ");
				ch++;
			}
			space++;star--;
			System.out.println();
		}

	}

}
