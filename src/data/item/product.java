package data.item;

//Classe de criação de produto
public class product implements item{
    private String info;
    private double price;

    public product(String info, double price){
        this.info = info;
        this.price=price;
    }

    @Override
    public String getInfo(){
        return info;
    }

    public double getPrice(){
        return price;
    }
}
