package parttrenLeval_II;

public class Q20 {
	public static void main(String[] args) {
		int n = 7;
		printParttren(n);
		
	}
	
	public static void printParttren(int n) {
		int star = 1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=star;j++) {
				System.out.print(j%2+" ");
			}
			System.out.println();
			star++;
		}
	}
}
