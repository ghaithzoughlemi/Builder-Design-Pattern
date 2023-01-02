package Builder;

public class Director {

	public void buildBMW(BuilderCar buildcar) {
		buildcar.id(2).brand("JEEB").model("109");
	}

	public void buildLambarguini(BuilderCar buildcar) {
		buildcar.id(3).brand("Lambarguini").model("2023");
	}

	public void buildBMWSchema(CarSchemaBuilder carschemabuilder) {
		carschemabuilder.id(4).brand("BMW").model("2023").schema("Hydro");
	}

}
