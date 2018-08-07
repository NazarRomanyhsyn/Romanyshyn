/*public class main {
    public static void main (String[] args) {
        Men Aragorn = new Men();
        Aragorn.Sleep();
        Aragorn.talk();
    }
}*/

/*public class main {
    public static void main(String[] args) {
        Singleton.getInstance().sendMessage("@gmail.com");
    }

}*/
/*public class main {
    public static void main(String[] args) {
        Car[] mashina = new Car[3];

        mashina[0] = CarFactory.createCar("Sedan");
        mashina[1] = CarFactory.createCar("Mini");
        mashina[2] = CarFactory.createCar("Suv");
    }
}*/
public class main {
    public static void main(String[] args) {
        Email email = new Email.Builder()
                .withAttachment()
                .withCC()
                .withPriority()
                .build();

    }
}