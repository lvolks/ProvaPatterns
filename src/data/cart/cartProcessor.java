package data.cart;

import data.item.item;

public class cartProcessor {
    private final cart cart;
    public int quantity;

    public cartProcessor(cart cart){
        this.cart = cart;
    }

    public void addOnCart(item item, int quant){
        cart.addItem(item, quant);
        quantity += quant;
    }

    public double totalPriceCalc(){
        return cart.totalPriceCalc();
    }
}
