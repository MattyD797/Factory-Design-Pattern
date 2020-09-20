/**
 * This is a birthday cake made by the factory.
 * @author Matt Duggan
 *
 */
public class BirthdayCake extends Cake{
	
	/**
	 * Attributes of a birthday cake. 
	 */
	public BirthdayCake() {
		super();
		this.name = "Birthday Cake";
		this.price = 109.99;
		this.NumLayers = 1;
		this.shape = Shape.SHEET;
		this.flavor = "Funfetti";
		this.icing = "Vanilla";
		this.decorations.add("Sprinkles");
		this.decorations.add("Candy Flowers");
		this.decorations.add("Icing Writing");
	}
}
