
//create a Automobile class
public class AutoMobile {

	//ATTRIBUTES MODELYEAR AND BRAND
	private int modelYear;
	private String brand;
	
	public AutoMobile(int modelYear, String brand ) {
		this.modelYear = modelYear;
		this.brand=brand;
		
		
		
	}
	
	public int getmodelYear() {
		return modelYear;
		
	}
	
	public String brand() {
		return brand;
		
		
	}
	
	
	//METHOD HONK
	public void honk() {
		System.out.println( brand + "honks: Honk!");
		
		
		
	}
	
	public void accelerate () {
		System.out.println(" " );
		
	}
	public void stop() {
		System.out.println(" " );
		
	}
	public void reverse() {
		System.out.println(" " );
		
	}
	
	
}


