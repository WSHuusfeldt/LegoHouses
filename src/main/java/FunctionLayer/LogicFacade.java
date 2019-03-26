package FunctionLayer;

import DBAccess.User;
import DBAccess.Order;
import DBAccess.OrderMapper;
import DBAccess.UserMapper;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * The purpose of LogicFacade is to...
 *
 * @author kasper
 */
public class LogicFacade {

    public static User login(String email, String password) throws LoginSampleException {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
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
    
    public static Order getOrderById(int id) throws ClassNotFoundException, SQLException {
        Order order = OrderMapper.getOrderById(id);
        return order;
    }
    
    public static List<Order> getOrdersByUserId(int id) throws ClassNotFoundException, SQLException {
        List<Order> orders = OrderMapper.getOrdersByUserId(id);
        return orders;
    }

    public static HashMap<String, Integer> calcBricks(Order order) {
        HashMap<String, Integer> bricks = Calculator.calcBricks(order);
        return bricks;
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        LogicFacade lf = new LogicFacade();
        for (Order or : lf.getOrders()) {
            System.out.println(or);
        }
    }
}
