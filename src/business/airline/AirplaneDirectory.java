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
public class AirplaneDirectory
{
    List<Airplane> airplanes;

    public AirplaneDirectory() {
        airplanes = new ArrayList();
    }

    public List<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(List<Airplane> airplanes) {
        this.airplanes = airplanes;
    }
    
    public Airplane addAirplane()
    {
        Airplane airplane = new Airplane();
        airplanes.add(airplane);
        return airplane;
    }
    
    public Airplane getAirplaneFromAirplaneNo(String airplaneNo)
    {
        for(Airplane airplane : airplanes)
        {
            if(airplane.getAirplaneNo().equals(airplaneNo))
                return airplane;
        }
        return null;
    }
    
}
