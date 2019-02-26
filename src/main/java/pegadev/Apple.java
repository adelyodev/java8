package pegadev;

public class Apple {
	
	
	
	private String Color;
	private Number weight ;
	
	
	
	public Apple(String color, Number weight) {
		super();
		Color = color;
		this.weight = weight;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public Number getWeight() {
		return weight;
	}
	public void setWeight(Number weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Apple [Color=" + Color + ", weight=" + weight + "]";
	}
	
	

}
