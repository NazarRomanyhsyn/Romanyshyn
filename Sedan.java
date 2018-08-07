public class Sedan extends Car{
    private float price;
    protected Sedan(float price) {this.price = price;}
    public float getPrice() {return  price;}
    public String getCarType() {return "Sedan";}
}
