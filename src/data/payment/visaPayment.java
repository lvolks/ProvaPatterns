package data.payment;

//Método de pagamento cartão VISA
public class visaPayment implements payment {
    private double amount;

    public visaPayment(double amount){
        this.amount = amount;
    }
    @Override
    public String paymentWay(){
        return "Método de pagamento: Cartão VISA";
    }
}
