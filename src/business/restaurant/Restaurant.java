/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.restaurant;

//import Business.DeliveryMan.DeliveryMan;

import business.order.Order;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private String address;
    private String city;
    private String state;
    private String postalCode;
    private String userName;
    private String managerName;
    private List<Dish> menu;
    private List<Order> orders;
//    private List<DeliveryMan> deliveryMans;

    public Restaurant() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
//        this.deliveryMans = new ArrayList<>();
    }

    public Restaurant(String name, String address, String city, String state, String postalCode, String userName, String managerName, List<Dish> menu, List<Order> orders) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.userName = userName;
        this.managerName = managerName;
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
//        this.deliveryMans = new ArrayList<>();
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

//    public List<DeliveryMan> getDeliveryMans() {
//        return deliveryMans;
//    }
//
//    public void setDeliveryMans(List<DeliveryMan> deliveryMans) {
//        this.deliveryMans = deliveryMans;
//    }

    public List<Dish> getMenu() {
        return menu;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }
    
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    public boolean addDishToMenu(String name, String price) {
        for(Dish dish : menu) {
            if(dish.getName().equals(name))
                return false;
        }
        Dish dish = new Dish(name, price);
        menu.add(dish);
        return true;
    }
    
    public boolean isDishPresent(String dishName)
    {
        for(Dish dish : menu) {
            if(dish.getName().equals(dishName)) {
                return true;
            }
        }
        return false;
    }
    
    public Dish getDishByName(String dishName)
    {
        for(Dish dish : menu) {
            if(dish.getName().equals(dishName)) {
                return dish;
            }
        }
        return null;
    }
    
    public void editMenu(String oldName, String newName, String price) {
        Dish dish = getDishByName(oldName);
        dish.setName(newName);
        dish.setPrice(price);
    }
    
    public void deleteMenu(String dishName) {
        for(Dish dish : menu) {
            if(dish.getName().equals(dishName)) {
                menu.remove(dish);
                return;
            }
        }
    }
    
    @Override
    public String toString() 
    {
        return this.name;
    }
}
