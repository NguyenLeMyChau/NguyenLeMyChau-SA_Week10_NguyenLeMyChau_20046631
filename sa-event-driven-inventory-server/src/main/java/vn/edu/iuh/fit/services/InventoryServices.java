package vn.edu.iuh.fit.services;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class InventoryServices {

    @JmsListener(destination = "processing_order_1")
    public void inventory_listener(Message<String> message){
        String msg = message.getPayload();

        System.out.println("___received: " + msg);
    }
}
