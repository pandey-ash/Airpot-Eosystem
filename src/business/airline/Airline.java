/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.airline;

import business.employee.AirlineEmployee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashis
 */
public class Airline
{
    private String username;
    private String name;
    private String address;
    private String postalCode;
    private String city;
    private String state;
    List<Airplane> airplanes;
    List<AirlineEmployee> employees;

    public Airline() {
        airplanes = new ArrayList();
        employees = new ArrayList();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public List<AirlineEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<AirlineEmployee> employees) {
        this.employees = employees;
    }
    
    @Override
    public String toString()
    {
        return this.name;
    }
    
}
