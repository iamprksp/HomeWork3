
public class Car extends AutoMobile {
	
	public Car(int modelYear, String brand) {
        super(modelYear, brand);
    }

    public String toString() {
        return "Car " + super.toString();
    }
}

