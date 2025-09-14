package encapsulation;

public class employ {

	private String name;
	private  double salray;
	private int age;
	
	// setter
	public void setName(String name) {
		if(name.length() >2) {
			System.out.println("vaild name");
			this.name=name;
		}
		else
			System.out.println("invaild name");
	}
	
	public void setSalray(double salray) {
		if(salray > 12000) {
			System.out.println("vaild salray");
			this.salray=salray;
		}
		else
			System.out.println("invaild salray");
	}
	
	public void setAge(int age) {
		if(age >= 21 && age <= 65) {
			System.out.println("vaild Age");
			this.age = age;
		}
		else
			System.out.println("invaild age");
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public double getSalray() {
		return salray;
	}
	
	public int getAge() {
		return age;
	}
	
}
