
package palntworldstage2;
import java.util.ArrayList;

/**
 * Order class : is public class take attributes from other classes. 
 * concatenate the order to user that choose it .
 */
public class order {
   

    private account userInfo; // user inforamtion.
    private plant planOrder;      // plant order. 
    private ArrayList<OrderItem> orderItem;

    /**
     * Default Constructor #1.
     */
    public order() {
    }

    /**
     * * Constructor #2.
     *
     * @param userInfo
     * @param planOrder
     */
    public order(account userInfo , plant planOrder) {
        this.userInfo = userInfo;
        this.planOrder = planOrder;
    }

    public order(account userInfo, ArrayList<OrderItem> orderItem) {
        this.userInfo = userInfo;
        this.orderItem = orderItem;

    }

    

    /**
     * Mutator method to change the user Service
     *
     * @param userInfo .
     */
    public void setUserInfo(account userInfo) {
        this.userInfo = userInfo;
    }

    public account getUserInfo() {
        return userInfo;
    }

    /**
     * Mutator method to change the planOrder
     *
     * @param planOrder .
     */
    public void setPlanOrder(plant planOrder) {

        this.planOrder = planOrder;
    }

    public plant getPlanOrder() {
        return planOrder;
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < orderItem.size(); i++) {
            total += orderItem.get(i).getItemPrice();

        }
        return total;
    }

    public void printOrderItems() {
        System.out.println("Plant item \tprice");
        for (int i = 0; i < orderItem.size(); i++) {
            System.out.println(orderItem.get(i));

        }
    }

    /**
     * Print all details in class . .
     */
    public void PrintDetails() {
        System.out.println("---------------Checkout---------------\t");

        System.out.println("User Information:\n");
        System.out.println(userInfo);
        System.out.println("------------------------");
        System.out.println("OrderItem:\n");
        printOrderItems();
        System.out.println("------------------------");
        System.out.println("Total Price: \t" + getTotalPrice());

    }

    @Override
    public String toString() {
        return "order{" + "userInfo=" + userInfo + ", planOrder=" + planOrder +", orderItem=" + orderItem + '}';
    }

}
