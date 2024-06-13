package isarelationship;
public class Washingmachine extends Appliance{
	private int size;
	 private String type;
	 public void changeChannel() {
			System.out.println("channel has been changed");
		}
	
	public Washingmachine(int size, String type) {
		
		this.size = size;
		this.type = type;
	}
	public Washingmachine () {};

	
	
	

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getLoudness() {
		return type;
	}

	public void setLoudness(String loudness) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Television [size=" + size + ", type=" + type + "]";
	}
	

}

