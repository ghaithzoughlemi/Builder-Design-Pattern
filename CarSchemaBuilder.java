package Builder;

public class CarSchemaBuilder implements Builder {

	private int id;
	private String brand;
	private String model;
	private String color;
	private int nbrdoors;
	private String engine;
	private int height;
	private String schema;

	@Override
	public Builder id(int id) {
		this.id = id;
		return this;
	}

	@Override
	public Builder brand(String brand) {
		this.brand = brand;
		return this;
	}

	@Override
	public Builder model(String model) {
		this.model = model;
		return this;
	}

	@Override
	public Builder color(String color) {
		this.model = model;
		return this;
	}

	@Override
	public Builder nbrdoors(int nbrdoors) {
		this.nbrdoors = nbrdoors;
		return this;
	}

	@Override
	public Builder engine(String engine) {
		this.engine = engine;
		return this;
	}

	@Override
	public Builder height(int height) {
		this.height = height;
		return this;
	}

	@Override
	public Builder schema(String schema) {
		this.schema = schema;
		return this;
	}

	public CarSchema build() {
		return new CarSchema(id, brand, model, color, nbrdoors, engine, height, schema);
	}

}
