package ua.edu.ucu.apps.lab8.delivery;

public class PostDeliveryStrategy implements Delivery {
    public String getDeliveryNotification() {
        return "Delivery with simple Post";
    }

}
