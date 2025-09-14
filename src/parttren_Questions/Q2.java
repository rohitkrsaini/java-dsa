package parttren_Questions;

public class Q2 {

	public static void main(String[] args) {
		int n= 13;
		printPattern(n);

	}
	
	public static void printPattern(int n) {
		int star =1;
		for(int i=1;i<n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			star++;
			System.out.println();
		}
	}

}
