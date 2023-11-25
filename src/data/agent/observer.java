package data.agent;

import data.cart.cartProcessor;
import data.item.item;
import data.payment.paymentProcessor;

//Interface observer
public interface observer {
    void up(String status, item product, item services, cartProcessor cart, paymentProcessor p);
}
