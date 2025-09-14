package Number_basedProgram;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int count = 0;
		for(int i=2;i<=n;i++) {
		if(getPrimeNo(i) && getPrimeNo(getSum(i))) {
			 {
				System.out.println(i +" : it is a prime number");
				count++;
			}
		            }
		
	     	}
		System.out.println("Total such prime numbers: " + count);

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
	
	public static int getSum(int n) {
		int sum =0;
		while(n>0) {
			sum = sum +n%10;
			n/=10;
		}
		return sum;
	}
}
