package parttrenLeval_II;

public class Q21 {
	public static void main(String[] args) {
		int n = 7;
		printParttren(n);
		
	}
	
	public static void printParttren(int n) {
		int num = 7;
		int star = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print(num+" ");
			}
			System.out.println();
			star++; num--;
		}
	}
}
