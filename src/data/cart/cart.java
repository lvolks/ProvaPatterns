package data.cart;

import data.item.item;

import java.util.ArrayList;
import java.util.List;

//Classe carrinho de compras
public class cart {
    private List<cartItem> itens = new ArrayList<>();
    private static cart instance;

    public cart(){}

    //Obter instância utilizando padrão de projeto Singleton
    public static cart getInstance() {
        if (instance == null) {
            instance = new cart();
        }
        return instance;
    }

    //Adicionar item ao carrinho
    public void addItem(item item, int quant){
        itens.add(new cartItem(item, quant));
    }

    //Calcular preço total do carrinho
    public double totalPriceCalc(){
        double total = 0;
        for(cartItem cartItem : itens){
            total += cartItem.getAllPrice();
        }
        return total;
    }
}
