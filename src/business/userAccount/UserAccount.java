/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.userAccount;

/**
 *
 * @author raunak
 */
public class UserAccount {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return username;
    }
    
    
    
}