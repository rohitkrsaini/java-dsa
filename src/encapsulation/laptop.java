package encapsulation;

public class laptop {
	public String brand;
	public double prices;
	public int ram;
	
	//setter()
	public void setName(String name) {
		this.brand = name;
	}
	
	public void setPrices(double prices) {
		this.prices = prices;
	}
	
	public void setRam(int ram) {
		if(ram >= 8) {
			System.out.println("vaild Ram");
			this.ram = ram;	
		}
	}
	
	//getter()
	public String getName() {
		return brand;
	}
	
	public double getPrices() {
		return prices;
	}
	
	public int getRam() {
		return ram;
	}
}
