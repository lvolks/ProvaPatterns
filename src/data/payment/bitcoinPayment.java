package data.payment;

//Método de pagamento Bitcoin
public class bitcoinPayment implements payment {
    private double amount;
    public bitcoinPayment(double amount){
        this.amount = amount;
    }

    @Override
    public String paymentWay(){
        return "Método de pagamento: Bitcoin";
    }
}
