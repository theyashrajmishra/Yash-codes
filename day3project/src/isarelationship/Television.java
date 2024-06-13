package isarelationship;

public class Television extends Appliance {
	private int size;
	 private String loudness;
	 public void changeChannel() {
			System.out.println("channel has been changed");
		}
	
	public Television(int size, String loudness) {
		
		this.size = size;
		this.loudness = loudness;
	}
	public Television () {};

	
	
	public Television(String brandName, double price, int size, String loudness) {
		super(brandName, price);
		this.size = size;
		this.loudness = loudness;
	}
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getLoudness() {
		return loudness;
	}

	public void setLoudness(String loudness) {
		this.loudness = loudness;
	}

	@Override
	public String toString() {
		return "Television [size=" + size + ", loudness=" + loudness + "]";
	}
	

}
