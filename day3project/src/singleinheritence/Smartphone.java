package singleinheritence;


	public class Smartphone extends Device{
		
		String operatingSystem;
		String cameraResolution;
		public void takephoto() {
			System.out.println("photo leliya");
		}
		public void display() {
			System.out.println("brand is"+ super.brand);
			System.out.println("model is"+ super.model);
			System.out.println("operatingSystem is"+ this.operatingSystem);
			System.out.println("cameraResolution is"+ this.cameraResolution);
		}
		public void takingPower() {
			System.out.println("device is taking 0.5kw electricity");
		}
	}


