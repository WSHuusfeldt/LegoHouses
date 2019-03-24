package FunctionLayer;

import DBAccess.User;
import DBAccess.Order;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.sql.SQLException;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    
    public static Order createOrder(int length, int width, int heigth, int userId) throws ClassNotFoundException, SQLException {
        Order o = new Order(length, width, heigth, userId);
        OrderMapper.createOrder(o);
        return o;
    }
    
    public static List<Order> getOrders() throws ClassNotFoundException, SQLException {
        List<Order> o = OrderMapper.getOrders();
        return o;
    }
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        for (Order or : getOrders()) {
            System.out.println(or);
        }
    }
}
