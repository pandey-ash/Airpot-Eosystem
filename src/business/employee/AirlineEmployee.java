/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import business.airline.Airline;
import business.airline.Airplane;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashis
 */
public class AirlineEmployee extends Employee
{
    private Airline airline;
    private List<Airplane> airplanes; //This is to identify the schedule of employee
    public AirlineEmployee()
    {
        airplanes = new ArrayList();
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
    
    @Override
    public String toString()
    {
        return this.getUsername();
    }
    
    
}
