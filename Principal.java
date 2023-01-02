package Builder;

public class Principal {

	public static void main(String[] args) {

		BuilderCar builder = new BuilderCar();

		builder.id(1).brand("Mercedes").model("109");
		Car car = builder.build();
		System.out.println(car);

		Director director1 = new Director();
		director1.buildBMW(builder);
		Car car1 = builder.build();
		System.out.println(car1);

		Director director2 = new Director();
		director2.buildLambarguini(builder);
		Car car2 = builder.build();
		System.out.println(car2);

		CarSchemaBuilder builder1 = new CarSchemaBuilder();

		Director director3 = new Director();
		director3.buildBMWSchema(builder1);
		CarSchema carschema = builder1.build();
		System.out.println(carschema);

	}

}
