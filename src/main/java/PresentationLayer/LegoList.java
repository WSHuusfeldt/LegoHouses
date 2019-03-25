package PresentationLayer;

import DBAccess.Calculator;
import DBAccess.Order;
import DBAccess.User;
import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author William Sehested Huusfeldt
 */
public class LegoList extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        HttpSession session = request.getSession();
        LogicFacade lf = new LogicFacade();
        try {
            Order order = lf.getOrderById(Integer.parseInt(request.getParameter("orderId")));
            HashMap<String, Integer> bricks = lf.calcBricks(order);
            session.setAttribute("bricks", bricks);
            session.setAttribute("order", order);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        
        

        return "legolist";
    }

}
