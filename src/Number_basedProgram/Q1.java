package Number_basedProgram;
import java.util.Scanner;
public class Q1 {

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
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		
		if(getPrimeNo(n)) 
			System.out.println(n +" : this number is a prime number");
		
		else
			System.out.println(n +" : this number is not a prime number");
	}

}
