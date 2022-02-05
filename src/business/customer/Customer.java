/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

import business.order.Order;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class Customer {
    private String username;
    private String name;
    private String email;
    private String age;
    private String gender;
    private String address;
    private String postalCode;
    private String city;
    private String state;
    private List<Order> orders;

    public Customer() {
        orders = new ArrayList<>();
    }

    public Customer(String username, String name, String age, String gender, String address, String postalCode, String city, String state, List<Order> orders) {
        this.username = username;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.postalCode = postalCode;
        orders = new ArrayList<>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
    
    @Override
    public String toString() {
        return this.username;
    }
    
}
