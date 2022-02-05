/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.customer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    List<Customer> customers;

    public CustomerDirectory() {
        customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
    
    public Customer addCustomer()
    {
        Customer customer = new Customer();
        customers.add(customer);
        return customer;
    }
    
    public void deleteCustomerByUsername(String username)
    {
        if(username == null || "".equals(username.trim()))
            return;
        for(Customer customer : customers) {
            if(customer.getUsername().equals(username)) {
                customers.remove(customer);
                return;
            }
        }
    }
    
    public Customer getCustomerFromUsername(String username) {
        for(Customer customer : customers) {
            if(customer.getUsername().equals(username)) {
                return customer;
            }
        }
        return null;
    }
}
