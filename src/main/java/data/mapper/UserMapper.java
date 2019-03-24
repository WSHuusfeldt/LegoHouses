/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.mapper;

import data.DBConnector;
import data.DatabaseConnector;
import data.interfaces.IUserMapper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import logic.User;

/**
 *
 * @author APC
 */
public class UserMapper implements IUserMapper {
    private DatabaseConnector connector = new DatabaseConnector();
    

//    public UserMapper(DataSource ds) {
//        connector.setDataSource(ds);
//    }

    @Override
    public int addUser(String username, String password) throws SQLException {
        connector.open();
        String query = "INSERT INTO Users(username, password) VALUES(?,?);";
        PreparedStatement ps = connector.prepareStatement(query);
        try {
            ps.setString(1, username);
            ps.setString(2, password);
            int result = ps.executeUpdate();
            connector.commit();
            return result;
        } catch (SQLException ex ) {
            ex.printStackTrace();
            if (connector != null) {
                connector.rollback();
            }
        } finally {
            connector.close();
        }
        return -1;
    }

    @Override
    public List<User> getUsers() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUser(String username) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validateUser(String username, String password) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) throws SQLException {
        UserMapper m = new UserMapper();
        m.addUser("Test2","test2");
    }
    
}
