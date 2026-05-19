package tester;
/**
 * Represents a toy item in the inventory
 * <p>
 * Each toy has a name, brand, price, quantity in stock, and a size classification.
 * </p>
 * 
 *     <ul>
 *      <li><b>name</b> - Name of Toy</li>
 *      <li><b>brand</b> - Manufacturer or brand</li>
 *      <li><b>price</b> - Selling price of toy</li>
 *      <li><b>quantity</b> - Number of units available</li>
 *     <li><b>size</b> - Size Category</li>
 * </ul>
 * @author Lan Sevilleno
 * @version 1.0
 * @since 1.0
 */


public class Toy {
    /** Name of Toy */
    public String name;

    /** Manufacturer or brand */
    public String brand;

    /** Selling price of toy */
    public double price;

    /** Number of units available */
    public int quantity;

    /** Size Category */
    public char size;


    /** 
     * Set the toy object price.
     * @param price the new price of the toy 
    */
public void setPrice(double price){
    this.price = price;
}

public static void main(String[] args) {
    Toy toy1 = new Toy();
    toy1.name = "Rage Pink";
    toy1.brand = "Lab Vuvu";
    toy1.price = 4500;
    toy1.quantity = 12;

    toy1.setPrice(toy1.price * 0.5);

    System.out.println(toy1.price);
    
}

}

