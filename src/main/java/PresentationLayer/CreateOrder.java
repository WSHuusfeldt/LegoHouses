package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.LoginSampleException;
import DBAccess.Order;
import DBAccess.User;
import FunctionLayer.CreateOrderException;
import java.sql.SQLException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author William Sehested Huusfeldt
 */
public class CreateOrder extends Command {

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int heigth = Integer.parseInt(request.getParameter("height"));
        LogicFacade lf = new LogicFacade();
        try {
            lf.createOrder(length, width, heigth, user.getId());
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }

        return "orderpage";
    }

}
