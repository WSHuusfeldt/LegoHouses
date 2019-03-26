package DBAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author William Sehested Huusfeldt
 */
public class OrderMapper {
    
    public static List<Order> getOrders() throws ClassNotFoundException, SQLException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String query = "SELECT * FROM legohouse.Orders;";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int orderId = rs.getInt("orderId");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                int userId = rs.getInt("userId");
                Order order = new Order(orderId, length, width, height, userId);
                orders.add(order);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return orders;
    }

    public static List<Order> getOrdersByUserId(int id) throws ClassNotFoundException, SQLException {
        List<Order> orders = new ArrayList<>();
        try {
            Connection con = Connector.connection();
            String query = "SELECT * FROM legohouse.Orders WHERE userId = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int orderId = rs.getInt("orderId");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                int userId = rs.getInt("userId");
                Order order = new Order(orderId, length, width, height, userId);
                orders.add(order);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return orders;
    }
    
    public static Order getOrderById(int id) throws ClassNotFoundException, SQLException {
        try {
            Connection con = Connector.connection();
            String query = "SELECT * FROM legohouse.Orders WHERE orderId = ?;";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int orderId = rs.getInt("orderId");
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                int userId = rs.getInt("userId");
                return new Order(orderId, length, width, height, userId);
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public static void createOrder(Order order) throws ClassNotFoundException, SQLException {
        try {
            Connection con = Connector.connection();
            String query = "INSERT INTO legohouse.Orders (length, width, height, userId) VALUES (?, ?, ?, ?);";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, order.getLength());
            ps.setInt(2, order.getWidth());
            ps.setInt(3, order.getHeight());
            ps.setInt(4, order.getUserId());
            ps.execute();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        OrderMapper om = new OrderMapper();
        //Order o = new Order(10, 20, 30, 4);
        //om.getOrders();

    }

}
