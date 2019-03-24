/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.interfaces;

import java.sql.SQLException;
import java.util.List;
import logic.User;

/**
 *
 * @author APC
 */
public interface IUserMapper {
    int addUser(String username, String password) throws SQLException;
    List<User> getUsers() throws SQLException;
    User getUser(String username) throws SQLException;
    boolean validateUser(String username, String password) throws SQLException;
    
    
}
