package isarelationship;

public class Appliance {
	private String brandName;
	private double price;
	
	
	public Appliance () {};
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Appliance(String brandName, double price) {
		super();
		this.brandName = brandName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Appliance [brandName=" + brandName + ", price=" + price + "]";
	}
	
	

}
