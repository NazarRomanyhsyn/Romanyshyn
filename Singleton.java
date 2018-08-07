import java.sql.SQLOutput;

public class Singleton {
    private static Singleton INSTANCE =
            new Singleton();

    protected Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void sendMessage(String logstring) {
        System.out.println("sendMessage:" + logstring);
    }
}
