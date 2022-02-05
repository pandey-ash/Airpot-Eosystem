/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.util;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ashis
 */
public class Role
{
    public final static String adminRole = "admin"; 
    public final static String airlineRole = "airline"; 
    public final static String customerRole = "customer"; 
    public final static String airportRole = "airport"; 
    public final Map<String, String> roleMap = new HashMap();
    private static Role role;
    
    private Role()
    {
    }
    
    public static Role getInstance()
    {
        if(role == null)
            role = new Role();
        return role;
    }
    
    public boolean addNewUserRole(String username, String role)
    {
        if(roleMap.get(username) != null)
            return false;
        roleMap.put(username, role);
        return true;
    }
    
    public String getUserRole(String username)
    {
        return roleMap.get(username);
    }
}
