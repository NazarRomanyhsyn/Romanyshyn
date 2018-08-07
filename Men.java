public class Men extends Human implements iTalk {
    @Override
    public void Sleep() {
        System.out.println("I sleep");
    }

    @Override
    public void talk() {
        System.out.println("I am sleeping");

    }
}