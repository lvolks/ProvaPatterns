package data;

import data.agent.observer;
import data.cart.cartProcessor;
import data.item.item;
import data.payment.paymentProcessor;

import java.util.ArrayList;
import java.util.List;


public class ecommerce {
    private String status;
    private List<observer> observers = new ArrayList<>();

    //Adicionar observador a lista
    public void attach(observer observer) {
        observers.add(observer);
    }

    //Definir status e notificar os observadores
    public void setStatus(String status, item product, item services, cartProcessor cart, paymentProcessor p) {
        this.status = status;
        notifyObservers(product, services, cart, p); // Notificar os observadores sobre a mudança de status
    }

    //Notificar observadores sobre mudanças específicas
    private void notifyObservers(item product, item services, cartProcessor cart, paymentProcessor p) {
        for (observer obs : observers) {
            obs.up(status, product, services, cart, p);
        }
    }

    //Simulação de compra bem-sucedida
    public void sucessefulBuy(item product, item services, cartProcessor cart, paymentProcessor p){
        setStatus("confirmed", product, services, cart, p);
    }

    //Simulação de compra mal-sucedida
    public void nonsucessefulBuy(){
        setStatus("canceled", null, null, null, null);
    }


}
