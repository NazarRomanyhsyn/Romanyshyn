public class Suv extends Car{
    private float price;
    protected Suv(float price) {this.price = price;}
    public float getPrice() {return  price;}
    public String getCarType() {return "Suv";}
}