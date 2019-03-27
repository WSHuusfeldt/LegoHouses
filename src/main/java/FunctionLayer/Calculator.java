package FunctionLayer;

import Data.Order;
import java.util.HashMap;

/**
 *
 * @author William Sehested Huusfeldt
 */
public class Calculator {

    public static HashMap<String, Integer> calcBricks(Order order) {
        HashMap<String, Integer> bricks = new HashMap<>();
        int small = 0;
        int medium = 0;
        int large = 0;

        large = order.getLength() / 4;
        medium = (order.getLength() % 4) / 2;
        small = (order.getLength() % 4) % 2;

        large += (order.getWidth() - 4) / 4;
        medium += ((order.getWidth() - 4) % 4) / 2;
        small += ((order.getWidth() - 4) % 4) % 2;

//        large *= order.getHeight();
//        medium *= order.getHeight();
//        small *= order.getHeight();
        bricks.put("2x4", large * 2);
        bricks.put("2x2", medium * 2);
        bricks.put("2x1", small * 2);

        System.out.println(bricks.keySet().toString() + bricks.values().toString());
        return bricks;
    }

}
