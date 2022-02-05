/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.employee;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ashis
 */
public class AirlineEmployeeDirectory
{
    List<AirlineEmployee> airlineEmployees;

    public AirlineEmployeeDirectory() {
        this.airlineEmployees = new ArrayList();
    }

    public List<AirlineEmployee> getAirlineEmployees() {
        return airlineEmployees;
    }

    public void setAirlineEmployees(List<AirlineEmployee> airlineEmployees)
    {
        this.airlineEmployees = airlineEmployees;
    }
    
    public AirlineEmployee getAirlineEmployeeFromUsername(String username)
    {
        for(AirlineEmployee airlineEmployee : airlineEmployees)
        {
            if(airlineEmployee.getUsername().equals(username))
                return airlineEmployee;
        }
        return null;
    }
    
    public AirlineEmployee addAirlineEmployee()
    {
        AirlineEmployee airlineEmployee = new AirlineEmployee();
        airlineEmployees.add(airlineEmployee);
        return airlineEmployee;
    }
    
}
