package data.cart;

import data.item.item;
public class cartItem {
    public item item;
    private int quant;

    public cartItem(item item, int quant){
        this.item = item;
        this.quant = quant;
    }

    //Calcular preço baseado na quantidade de itens
    public double getAllPrice(){
        return item.getPrice() * quant;
    }
}
