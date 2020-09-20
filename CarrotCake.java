/**
 * This is a carrot cake made by the factory. 
 * @author Matt Duggan
 *
 */
public class CarrotCake extends Cake{
 
	/**
	 * The attributes of the carrot cake. 
	 */
	public CarrotCake() {
		super();
		this.name = "Carrot Cake";
		this.price = 54.99;
		this.NumLayers = 2;
		this.shape = Shape.ROUND;
		this.flavor = "Carrot";
		this.icing = "Cream Cheese";
		this.decorations.add("Walnuts");
		this.decorations.add("Candy Carrots");
	}
}
