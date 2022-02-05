package business;

import business.airline.Airline;
import business.airport.Airport;
import business.customer.Customer;
import business.employee.AirlineEmployee;
import business.userAccount.UserAccount;
import business.util.Constant;
import business.util.Role;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        system.getUserAccountDirectory().createUserAccount("admin", "admin", Role.adminRole);
        Role.getInstance().addNewUserRole("airline", Role.adminRole);
        
        Customer customer = system.getCustomerDirectory().addCustomer();
        customer.setUsername("as");
        customer.setName("Ashish Pandey");
        customer.setEmail("ashpandey32@gmail.com");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("as", "as", Role.customerRole);
        
        Airline airline = system.getAirlineDirectory().addAirline();
        airline.setUsername("airline");
        airline.setName("Kingfisher");
        system.getUserAccountDirectory().createUserAccount("airline", "airline", Role.airlineRole);
        Role.getInstance().addNewUserRole("airline", Role.airlineRole);
        Airport airport = system.getAirportDirectory().addAirport();
        airport.setUsername("mumbai username");
        airport.setAirportName("Mumbai airport");
        
        airport = system.getAirportDirectory().addAirport();
        airport.setUsername("delhi username");
        airport.setAirportName("Delhi airport");
        
        AirlineEmployee airlineEmployee = system.getAirlineEmployeeDirectory().addAirlineEmployee();
        airlineEmployee.setUsername("ashish");
        airlineEmployee.setName("ashish name");
        airlineEmployee.setGender("Male");
        airlineEmployee.setPosition(Constant.pilot);
        
        airlineEmployee = system.getAirlineEmployeeDirectory().addAirlineEmployee();
        airlineEmployee.setUsername("shreya");
        airlineEmployee.setName("shreya name");
        airlineEmployee.setGender("Female");
        airlineEmployee.setPosition(Constant.pilot);
        
        airlineEmployee = system.getAirlineEmployeeDirectory().addAirlineEmployee();
        airlineEmployee.setUsername("Shraddha");
        airlineEmployee.setName("Shraddha");
        airlineEmployee.setGender("Femal");
        airlineEmployee.setPosition(Constant.cabinCrew);
        
        airlineEmployee = system.getAirlineEmployeeDirectory().addAirlineEmployee();
        airlineEmployee.setUsername("Dristi");
        airlineEmployee.setName("Dristi");
        airlineEmployee.setGender("Demal");
        airlineEmployee.setPosition(Constant.cabinCrew);
        
        return system;
    }
    
}
