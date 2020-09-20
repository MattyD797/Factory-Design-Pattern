/**
 * This is a black forest cake made by the factory. 
 * @author Matt Duggan
 *
 */
public class BlackForestCake extends Cake{

	/**
	 * Attributes of the black forest cake. 
	 */
	public BlackForestCake() {
		super();
		this.name = "Black Forest Cake";
		this.price = 47.99;
		this.NumLayers = 3;
		this.shape = Shape.ROUND;
		this.flavor = "Black Forest";
		this.icing = "Whipped Cream";
		this.decorations.add("Cherries");
		this.decorations.add("Chocolate Flakes");
		this.decorations.add("Whipped Cream");
	}
}
