package Number_basedProgram;
import java.util.Scanner;


public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*System.out.println("enter a number");
		int n = sc.nextInt();*/
		System.out.println("enter a nth term of prime number");
		int j = sc.nextInt();
		int count = 0;
		for(int i=2; ; i++) {
		if(getPrimeNo(i)) {
			System.out.println(i +" : it is a prime number");
			count++;
			if(count==j) {
				System.out.println(j+"th term is prime no print :"+i);
				break;
			}
		            }
		
	     	}

	}

	public static boolean getPrimeNo(int n) {
		if(n<2) 
			return false;
		
			else if(n==2||n==3)
				return true	;	
						
				else if(n%2==0)
					return false;
				
			for(int i=3;i*i<=n;i+=2) {
				if(n%i==0)
					return false;
			}
			return true;
 }
}