/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    List<Restaurant> restaurants;

    public RestaurantDirectory() {
        restaurants = new ArrayList<>();
    }

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }
    
    public Restaurant addRestaurant(String restaurantUsername)
    {
        for(Restaurant restaurant : restaurants)
        {
            if(restaurantUsername.equals(restaurant.getUserName()))
                return null;
        }
        Restaurant restaurant = new Restaurant();
        restaurants.add(restaurant);
        return restaurant;
    }
    
    public Restaurant getRestaurantFromUsername(String username)
    {
        for(Restaurant restaurant : restaurants)
        {
            if(username.equals(restaurant.getUserName()))
                return restaurant;
        }
        return null;
    }
    
    public Restaurant getRestaurantFromName(String name)
    {
        for(Restaurant restaurant : restaurants)
        {
            if(name.equals(restaurant.getName()))
                return restaurant;
        }
        return null;
    }
    
    public void deleteRestaurantFromUsername(String username)
    {
        for(Restaurant restaurant : restaurants)
        {
            if(restaurant.getUserName().equals(username))
            {
                restaurants.remove(restaurant);
                return;
            }
        }
    }
    
    
}
