package data.agent;

import data.cart.cartProcessor;
import data.item.item;
import data.item.services;
import data.payment.paymentProcessor;

//Clase de agente logístico atuando como um observador
public class logisticAgent implements observer {
    private String nome;

    public logisticAgent(String nome) {
        this.nome = nome;
    }

    //Recebe atualização dos status
    public void up(String status, item product, item services, cartProcessor cart, paymentProcessor p) {
        if (status.equals("confirmed")) {
            System.out.println("Compra confirmada com sucesso! Agente Logístico: " + nome);
            System.out.println("Nome do produto: " + product.getInfo());
            System.out.println("Serviço de entrega: " + services.getInfo());
            System.out.println(p.paymentWay());
            System.out.println("Preço total do carrinho(Valor do frete adicionado): " + cart.totalPriceCalc());
        } else if (status.equals("canceled")) {
            System.out.println("Compra não sucedida. Cancelada. Agente Logístico: " + nome);
        }
    }
}
