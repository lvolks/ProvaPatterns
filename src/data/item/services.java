package data.item;

//Classe de criação de serviço de entrega
public class services implements item{
    private String info;
    private double price;

    public services(String info, double price){
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

