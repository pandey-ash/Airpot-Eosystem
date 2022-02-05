/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.order;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashis
 */
public class OrderDirectory {
    List<Order> orders;
    static OrderDirectory orderDirectory;

    public OrderDirectory() {
        orders = new ArrayList<>();
    }
    
    public Order createOrder() {
        Order order = new Order();
        orders.add(order);
        return order;
    }
    
    
}
