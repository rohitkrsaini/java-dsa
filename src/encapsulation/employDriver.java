package encapsulation;

import java.util.Scanner;

public class employDriver {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter Name1");
	String name1 = sc.nextLine();
	System.out.println("enter a salray");
	double salray1 = sc.nextDouble();
	System.out.println("enter age");
	int age1 =  sc.nextInt();
	
	employ e1 = new employ();
	
	e1.setName(name1);
	e1.setSalray(salray1);
	e1.setAge(age1);
	
	System.out.println("================");
	System.out.println("Name is "+e1.getName());
	System.out.println("Salray is "+e1.getSalray());
	System.out.println("age is "+e1.getAge());
	
	}
}
