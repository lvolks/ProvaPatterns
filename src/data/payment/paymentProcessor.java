package data.payment;

//Processador de pagamento
public class paymentProcessor {
    private payment paymentMet;

    public paymentProcessor(payment paymentMet){
        this.paymentMet = paymentMet;
    }

    public String paymentWay() {
        return this.paymentMet.paymentWay();
    }

}
