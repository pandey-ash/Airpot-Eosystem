/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.airline;

import business.airport.Airport;
import business.employee.Employee;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ashis
 */
public class Airplane
{
    private Airport departureAirport;
    private Airport arrivalAirport;
    private String departureTerminal;
    private String arrivalTerminal;
    private String departureGate;
    private String arrivalGate;
    private List<Employee> employees;
    private Airline airline;
    private List<AirplaneSchedule> airplaneSchedules;
    private String modelNo;
    private String airplaneNo;
    private String noOfPilot;
    private String noOfAirHostess;
    private String departureTime;
    private String arrivalTime;
    private String totalHours;
    private boolean isDepartureRequestPending;
    private boolean isArrivalRequestPending;
    private String price;
    private Map<String, List<Integer>> booking; //key=date of booking, value=seat booked

    public Airplane() {
        booking = new HashMap();
        employees = new ArrayList<>();
        isDepartureRequestPending = true;
        isArrivalRequestPending = true;
    }

    public String getTotalHours() {
        return totalHours;
    }

    public boolean getIsDepartureRequestPending() {
        return isDepartureRequestPending;
    }

    public void setIsDepartureRequestPending(boolean isDepartureRequestPending) {
        this.isDepartureRequestPending = isDepartureRequestPending;
    }

    public boolean getIsArrivalRequestPending() {
        return isArrivalRequestPending;
    }

    public void setIsArrivalRequestPending(boolean isArrivalRequestPending) {
        this.isArrivalRequestPending = isArrivalRequestPending;
    }
    
    

    public void setTotalHours(String totalHours) {
        this.totalHours = totalHours;
    }
    
    public Map<String, List<Integer>> getBooking() {
        return booking;
    }

    public void setBooking(Map<String, List<Integer>> booking) {
        this.booking = booking;
    }
    
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getNoOfPilot() {
        return noOfPilot;
    }

    public void setNoOfPilot(String noOfPilot) {
        this.noOfPilot = noOfPilot;
    }

    public String getNoOfAirHostess() {
        return noOfAirHostess;
    }

    public void setNoOfAirHostess(String noOfAirHostess) {
        this.noOfAirHostess = noOfAirHostess;
    }
    
    

    public Airport getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(Airport departureAirport) {
        this.departureAirport = departureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureTerminal() {
        return departureTerminal;
    }

    public void setDepartureTerminal(String departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    public void setArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    public String getDepartureGate() {
        return departureGate;
    }

    public void setDepartureGate(String departureGate) {
        this.departureGate = departureGate;
    }

    public String getArrivalGate() {
        return arrivalGate;
    }

    public void setArrivalGate(String arrivalGate) {
        this.arrivalGate = arrivalGate;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public List<AirplaneSchedule> getAirplaneSchedules() {
        return airplaneSchedules;
    }

    public void setAirplaneSchedules(List<AirplaneSchedule> airplaneSchedules) {
        this.airplaneSchedules = airplaneSchedules;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getAirplaneNo() {
        return airplaneNo;
    }

    public void setAirplaneNo(String airplaneNo) {
        this.airplaneNo = airplaneNo;
    }

    @Override
    public String toString()
    {
        return this.airplaneNo;
    }
    
}
