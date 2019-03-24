package DBAccess;

/**
 *
 * @author William Sehested Huusfeldt
 */
public class Order {
    
    private int orderId, length, width, height, userId;

    public Order(int length, int width, int height, int userId) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
    }
    
    public Order(int orderId, int length, int width, int height, int userId) {
        this.orderId = orderId;
        this.length = length;
        this.width = width;
        this.height = height;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    
    
}
