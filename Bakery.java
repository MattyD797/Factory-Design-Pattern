/**
 * Places the order for each cake wanting to be made within the bakery from several options for a cake. 
 * @author Matt Duggan
 *
 */
public class Bakery {
	
	/**
	 * This creates a type of cake to be decorated and displays back to the user the details of the cake. 
	 * @param type The cake the user ordered from the driver.
	 * @return The display to the user of the cake being made. 
	 */
	public Cake orderCake(String type) {
		Cake cake = this.createCake(type);
		cake.createCake();
		System.out.println("Price: $" + cake.getPrice());
		return cake;
	}
	
	/**
	 * Creates a new cake determined by the customer/driver. 
	 * @param type The customers order. 
	 * @return The cake object/the cake and its attributes. 
	 */
	private Cake createCake(String type) {
		if(type == "birthday cake"){
			return new BirthdayCake();
		}
		else if(type == "carrot cake") {
			return new CarrotCake();
		}
		else{
			return new BlackForestCake();
		}
	}
}
