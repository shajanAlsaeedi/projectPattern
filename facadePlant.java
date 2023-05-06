
package palntworldstage2;

import java.util.ArrayList;

/**
 *
 * @author shajj
 */
public class facadePlant {
    
nurseryOwner nurseryOwnerInfo ;
order order;
private account customer;
private ArrayList<OrderItem> items;


public facadePlant(){
}
public facadePlant(account customer , ArrayList <OrderItem> items){
    order= new order(customer,items);
}


public void getInfo(nurseryOwner nurseryOwnerInfo){
   nurseryOwnerInfo.printContactInfo();
}
public void getOrder(){
    order.PrintDetails();
}
}
