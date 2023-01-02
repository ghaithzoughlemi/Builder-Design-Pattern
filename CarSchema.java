package Builder;

public class CarSchema {
	private final int id;
	private final String brand;
	private final String model;
	private final String color;
	private final int nbrdoors;
	private final String engine;
	private final int height;
	private final String schema;

	public CarSchema(int id, String brand, String model, String color, int nbrdoors, String engine, int height,
			String schema) {
		this.brand = brand;
		this.color = color;
		this.engine = engine;
		this.height = height;
		this.id = id;
		this.model = model;
		this.nbrdoors = nbrdoors;
		this.schema = schema;
	}

	public String toString() {
		return id + " " + brand + " " + model + " " + color + " " + schema;
	}

}
