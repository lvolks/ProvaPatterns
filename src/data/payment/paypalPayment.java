package data.payment;

//Método de pagamento PayPal
public class paypalPayment implements payment{
    private double amount;
    public paypalPayment(double amount){
        this.amount = amount;
    }
    @Override
    public String paymentWay(){
        return "Método de pagamento: Paypal";
    }
}
