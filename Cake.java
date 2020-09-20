import java.util.ArrayList;

/**
 * This defines a cake and its attributes.
 * @author Matt Duggan 
 *
 */
public class Cake {
	protected String name; 
	protected double price;
	protected int NumLayers;
	protected ArrayList<String> decorations = new ArrayList<String>();
	protected Shape shape;
	protected String flavor;
	protected String icing;
	
	/**
	 * Displays the type of cake being made, its additions, and the price. 
	 */
	public void createCake() {
		createLayers();
		frostCake();
		addDecorations();
	}
	
	/**
	 * Determines the type of cake and displays the type of cake being made. 
	 */
	private void createLayers() {
		if(shape == Shape.CUPCAKES) {
			System.out.println("Creating " + this.flavor + " cupcakes");
		}
		else if(shape == Shape.BUNT) {
			System.out.println("Creating a " + this.flavor + " bunt cake");
		}
		else if(NumLayers == 1) {
			System.out.println("Creating a 1 layer " + this.shape.toString().toLowerCase() + " " + this.flavor + " cake");
		}
		else if(NumLayers >= 1) {
			System.out.println("Creating a " + this.NumLayers + " layered " + this.shape.toString().toLowerCase() + " " + this.flavor + " cake");
		}
		else {
			System.out.println("This is not a valid cake. Try one of our many options!");
		}
	}
	
	/**
	 * Displays the type of frosting. 
	 */
	private void frostCake() {
		System.out.println("Frost cake with " + this.icing + " icing.");
	}
	
	/**
	 * Displays the type of additions being added.
	 */
	private void addDecorations() {
		for(String dec : decorations) {
			System.out.println("Adding " + dec + ".");
		}
	}
	
	/**
	 * Gets the price for the cake. 
	 * @return The determined price. 
	 */
	public double getPrice() {
		return this.price;
	}
}
