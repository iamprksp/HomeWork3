
public class CarTester {
	public static void main(String[] args) {
        Automobile[] vehicle = new Automobile[5];
        vehicle[0] = new Car(2020, "Tesla");
        vehicle[1] = new SportsCar(2021, "VW");
        vehicle[2] = new JunkCar(1995, "Lexus");
        vehicle[3] = new Car(2019, "Honda");
        vehicle[4] = new SportsCar(2022, "Lambo");

        
        for (Automobile auto : vehicle) {
            System.out.println(vehicle.toString());
            auto.accelerate();
            auto.honk();
            auto.reverse();
            auto.stop();
            System.out.println();
        }

        System.out.println("Comparing vehicle[0] and vehicle[3]: " + vehicle[0].compareTo(vehicle[3]));

        
        Automobile anotherCar = new Car(2020, "Tesla");
        System.out.println("autos[0] equals anotherCar: " + vehicle[0].equals(anotherCar));
    }
}





