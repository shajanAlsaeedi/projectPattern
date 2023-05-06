
package palntworldstage2;
/**
 * Order Item class : is public class provide all item order information and
 * displaying.
 */
public class OrderItem {

    public plant plantItem;

    /**
     * Default Constructor #1.
     */
    public OrderItem() {

    }

    /**
     * Default Constructor #2.
     */
    public OrderItem(plant plantItem) {
        this.plantItem = plantItem;

    }

    /**
     * Default Constructor #3.
     */
    public plant getPlantItem() {
        return plantItem;
    }

    /**
     * Default Constructor #4.
     */
    public void setPlantItem(plant plantItem) {
        this.plantItem = plantItem;
    }

    /**
     * A method to take price from plant class
     */
    public double getItemPrice() {
        double price;
        price = plantItem.getPricePlant();
        return price;
    }

    /**
     * Method toString @return text want display it.
     */
    @Override
    public String toString() {
        return plantItem.getNamePlant() + " \t \t" + plantItem.getPricePlant() + "\n";

    }

}
