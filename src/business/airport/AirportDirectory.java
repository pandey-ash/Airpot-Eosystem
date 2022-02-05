/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.airport;

import business.employee.AirlineEmployee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashis
 */
public class AirportDirectory {
    List<Airport> airports;

    public AirportDirectory() {
        airports = new ArrayList();
    }

    public List<Airport> getAirports() {
        return airports;
    }

    public void setAirports(List<Airport> airports) {
        this.airports = airports;
    }
    
    public Airport addAirport()
    {
        Airport airport = new Airport();
        airports.add(airport);
        return airport;
    }
    
    public Airport getAirportFromUsername(String username)
    {
        for(Airport airport : airports)
        {
            if(airport.getUsername().equals(username))
                return airport;
        }
        return null;
    }
    
    public Airport getAirportFromName(String airportName)
    {
        for(Airport airport : airports)
        {
            if(airport.getAirportName().equals(airportName))
                return airport;
        }
        return null;
    }
    
    public Airport addAirlineEmployee()
    {
        Airport airport = new Airport();
        airports.add(airport);
        return airport;
    }
    
    public boolean isUniqueName(String airportName)
    {
        for(Airport airport : airports)
        {
            if(airport.getAirportName().equals(airportName))
                return false;
        }
        return true;
    }
    
}
