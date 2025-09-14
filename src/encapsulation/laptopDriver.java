package encapsulation;
import java.util.Scanner;
public class laptopDriver {
	
	public static void main(String[] ars) {
	
		Scanner sc = new Scanner(System.in);
	System.out.println("enter laptop brand name");
	String name1 = sc.nextLine();
	System.out.println("enter laptop prices");
	double prices1 = sc.nextDouble();
	System.out.println("enter laptop Ram");
	int ram1 = sc.nextInt();
	
	laptop l1 = new laptop();
	
	l1.setName(name1);
	l1.setPrices(prices1);
	l1.setRam(ram1);
	
	System.out.println("===============");
	System.out.println("laptop brand name is : "+l1.getName());
	System.out.println("laptop prices is: "+l1.getPrices());
	System.out.println("laptop Ram is: "+l1.getRam());
	
	}
	
}
