package DBAccess;

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
        int remain = 0;

        large = (order.getLength() - 2) / 4;
        remain = (order.getLength() - 2) % 4;

        if (remain >= 2) {
            medium++;
            remain -= 2;
            
        }
        if (remain == 1) {
                small++;
                remain = 0;
            }

        large += (order.getWidth() - 2) / 4;
        remain += ((order.getWidth() - 2) % 4);

        if (remain >= 2) {
            medium++;
            remain -= 2;
            
        }
        if (remain == 1) {
                small++;
                remain = 0;
            }
        
        large *= order.getHeight();
        medium *= order.getHeight();
        small *= order.getHeight();
        
        bricks.put("2x4", large*2);
        bricks.put("2x2", medium*2);
        bricks.put("2x1", small*2);
        System.out.println(bricks.keySet().toString() + bricks.values().toString());
        return bricks;
    }
    
    public static void main(String[] args) {
        Order o = new Order(8, 7, 1, 7);
        Calculator c = new Calculator();
        c.calcBricks(o);
        //System.out.println();
    }

}
