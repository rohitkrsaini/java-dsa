package parttren_Questions;

public class Q1 {

	public static void main(String[] args) {
		int n = 15;
		printSwatik(n);

	}
	
	public static void printSwatik(int v) {
		int mid = v/2 +1;
		
		for(int i=1;i<=v;i++) {
			for(int j=1;j<=v;j++) {
				if(i==mid || j==mid ||i==1&&j>mid || j==1&&i<mid || i==v&&j<mid || j==v&&i>mid)
				System.out.print("* ");
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
