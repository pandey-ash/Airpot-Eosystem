/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.restaurant;

/**
 *
 * @author ashis
 */
public class Dish
{
    
    private String name;
    private String price;

    public Dish() {
    }

    public Dish(String name, String price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }
    
}
