package singleinheritence;

public class Demo {
	public static void main(String[] args) {
		Smartphone d = new Smartphone();
		d.brand = "samsung";
		d.model = "s23";
		d.operatingSystem="aox";
		d.cameraResolution = "500mp";
				
	    d.display();
		d.powerOff();
		d.powerOn(); 
		d.takephoto();
		d.takingPower();
		Device dd = new Device();
		dd.takingPower();
		
				
	}

}
