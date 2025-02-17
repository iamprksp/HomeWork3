
public class SportsCar extends AutoMobile{
	public SportsCar(int modelYear, String brand) {
        super(modelYear, brand);
    }
    public void accelerate() {
        System.out.println("");
    }
    public String toString() {
        return "SportsCar " + super.toString();
    }
}
	
	

