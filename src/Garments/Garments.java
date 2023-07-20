package Garments;

public abstract class Garments {
	
	private String size;
	private String material;
	private String color;
	private String stock;
	public Garments(String size, String material, String color, String stock) {
		super();
		this.size = size;
		this.material = material;
		this.color = color;
		this.stock = stock;
	}
	@Override
	public String toString() {
		return " The info what item you looking for : size=" + size + " material=" + material + " color=" + color + " stock=" + stock;
	}
	
	
	

}
