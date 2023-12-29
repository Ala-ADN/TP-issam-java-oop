package Shopping;

import java.util.ArrayList;

public class Orders {
    private static ArrayList<Order> orders = new ArrayList<Order>();

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static void removeOrder(Order order) {
        orders.remove(order);
    }

    public static Order getOrder(int index) {
        return orders.get(index);
    }

    public static void printOrders() {
        for (Order order : orders) {
            order.printDetails();
        }
    }

    public static int getOrdersCount() {
        return orders.size();
    }

    public static void printOrders(String username) {
        for (Order order : orders) {
            if(order.getUsername().equals(username)){
                order.printDetails();
            }
        }
    }
}
