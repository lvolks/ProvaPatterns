import data.agent.logisticAgent;
import data.cart.cart;
import data.cart.cartProcessor;
import data.ecommerce;
import data.item.item;
import data.item.product;
import data.item.services;
import data.payment.*;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public class Main {
    public static void main(String[] args) {

        //Setando a quantidade de serviços como 1, pois não seria possível realizar 2 entregas do mesmo produto
        int quantService = 1;

        //Criando novo produto
        product pr = new product("Ração", 20.0);

        //Criando novo serviço de entrega
        services sv = new services("SEDEX", 22);

        // Criando instância do agente logístico (observador)
        logisticAgent agent = new logisticAgent("Lucas");

        // Obtendo a instância única do carrinho
        cart cart = data.cart.cart.getInstance();

        // Criando um processador de carrinho
        cartProcessor processor = new cartProcessor(cart);

        // Adicionando o agente logístico como observador
        ecommerce system = new ecommerce();
        system.attach(agent);

        // Adicionando o produto ao carrinho usando o processador de carrinho
        processor.addOnCart(pr, 3);

        // Adicionando o serviço ao carrinho usando o processador de carrinho
        processor.addOnCart(sv, quantService);

        // Calculando o preço total do carrinho usando o processador de carrinho
        double totalPrice = processor.totalPriceCalc();

        //Setando métodos de pagamento
        visaPayment v = new visaPayment(totalPrice);
        paypalPayment pp = new paypalPayment(totalPrice);
        bitcoinPayment b = new bitcoinPayment(totalPrice);

        //Escolhendo método de pagamento por injeção de dependência
        paymentProcessor p = new paymentProcessor(pp);

        // Simulando a confirmação da compra
        system.sucessefulBuy(pr, sv, processor, p);
        // Simulando o cancelamento da compra
//        system.nonsucessefulBuy();

    }
}