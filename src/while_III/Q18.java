package while_III;

public class Q18 {


	public static void main(String[] args) {
		pOEDEvanorOdd(9735);

	}
public static void pOEDEvanorOdd(int n){
	
	int product = 1;
	while(n>0){
		int digit = n%10;
		product*=digit;
		n/=10;
	}System.out.println(product);
	
	if(product%2==0) {
		System.out.println(product  + " producat is evan");
	}
	else {
		System.out.println(product  + " producat is odd");
	}
}
}
