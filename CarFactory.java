public  class CarFactory {
    public static Car createCar (String what){
        if (what.equals("Sedan")) {
            return new Sedan(999999);
        } else if (what.equals("Mini")) {
            return new Mini(666666);
        } else if (what.equals("Suv")) {
            return new Suv(1222222);
        } else {
            return new Sedan(999999);
        }
    }
}
