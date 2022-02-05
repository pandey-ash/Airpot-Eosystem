/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.airline;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashis
 */
public class AirlineDirectory
{
    List<Airline> airlines;
    
    public AirlineDirectory() {
        airlines = new ArrayList();
    }
    
    public Airline addAirline()
    {
        Airline airline = new Airline();
        airlines.add(airline);
        return airline;
    }
    
    public Airline getAirlineFromUsername(String username)
    {
        for(Airline airline : airlines)
        {
            if(airline.getUsername().equals(username))
                return airline;
        }
        return null;
    }
    
}
