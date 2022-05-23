package question3;

public class Car {

	String model;
	String companyName;
	String Color;
	Engine engine;

	public static class Engine {
		int rmp;
		int Power;
		String manufacturer;
		Boolean hasTurbo;

		void turbo() {
			hasTurbo = true;
		}

	}

	public Car() {

	}

	public Car(String model, String companyName, String color, int rmp, int Power, String manufacturer, Engine engine,
			Boolean hasTurbo) {
//		super();

		this.model = model;
		this.companyName = companyName;
		Color = color;
		this.engine = engine;
		this.engine.rmp = rmp;
		this.engine.hasTurbo = hasTurbo;
		this.engine.Power = Power;
		this.engine.manufacturer = manufacturer;

	}

	public static void main(String[] args) {
		Car c1 = new Car();
		Engine engine = new Engine();

		Car c2 = new Car("Harrier", "Tata", "black", 10000, 110, "tata", engine, true);
		System.out.println("Car Model: " + c2.model);
		System.out.println("Car companyName: " + c2.companyName);
		System.out.println("Car color: " + c2.Color);
		System.out.println("Car RPM : " + c2.engine.rmp);
		System.out.println("Car power :" + c2.engine.Power);
		System.out.println("Car Engine Manufacture :" + c2.engine.manufacturer);
		System.out.println("Car Has Turbo: " + c2.engine.hasTurbo);

	}

}
