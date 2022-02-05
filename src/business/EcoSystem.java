/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import business.airline.AirlineDirectory;
import business.airline.AirplaneDirectory;
import business.airport.AirportDirectory;
import business.customer.CustomerDirectory;
import business.employee.AirlineEmployeeDirectory;
import business.order.OrderDirectory;
import business.restaurant.RestaurantDirectory;
import business.userAccount.UserAccountDirectory;
import business.util.Role;

/**
 *
 * @author ashis
 */
public class EcoSystem
{
    private static EcoSystem ecoSystem;
    private AirlineDirectory airlineDirectory;
    private AirportDirectory airportDirectory;
    private CustomerDirectory customerDirectory;
    private UserAccountDirectory userAccountDirectory;
    private AirlineEmployeeDirectory airlineEmployeeDirectory;
    private RestaurantDirectory restaurantDirectory;
    private AirplaneDirectory airplaneDirectory;
    private OrderDirectory orderDirectory;
    private Role role;
    
    private EcoSystem()
    {
        airlineDirectory = new AirlineDirectory();
        airportDirectory = new AirportDirectory();
        customerDirectory = new CustomerDirectory();
        userAccountDirectory = new UserAccountDirectory();
        airlineEmployeeDirectory = new AirlineEmployeeDirectory();
        restaurantDirectory = new RestaurantDirectory();
        airplaneDirectory = new AirplaneDirectory();
        orderDirectory = new OrderDirectory();
        role = Role.getInstance();
    }
    
    public static EcoSystem getInstance()
    {
        if(ecoSystem == null)
            ecoSystem = new EcoSystem();
        return ecoSystem;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }

    public void setAirplaneDirectory(AirplaneDirectory airplaneDirectory) {
        this.airplaneDirectory = airplaneDirectory;
    }
    
    

    public AirlineEmployeeDirectory getAirlineEmployeeDirectory() {
        return airlineEmployeeDirectory;
    }

    public void setAirlineEmployeeDirectory(AirlineEmployeeDirectory airlineEmployeeDirectory) {
        this.airlineEmployeeDirectory = airlineEmployeeDirectory;
    }
    

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public AirlineDirectory getAirlineDirectory() {
        return airlineDirectory;
    }

    public AirportDirectory getAirportDirectory() {
        return airportDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }  
    
    public OrderDirectory getOrderDirectory() {
        return orderDirectory;
}

    public void setOrderDirectory(OrderDirectory orderDirectory) {
        this.orderDirectory = orderDirectory;
    }

    
    
}
