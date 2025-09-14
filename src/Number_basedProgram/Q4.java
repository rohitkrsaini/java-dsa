package Number_basedProgram;
import java.util.Scanner;


public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int count = 0;
		for(int i=2;i<=n;i++) {
		if(getPrimeNo(i)) {
			count++;
			if(count%2==1) {
				System.out.println(i +" : it is alter native a prime number");
			}
		            }
		
	     	}
		System.out.println("total prime number is 2 to : "+n+ " range = " + count);

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