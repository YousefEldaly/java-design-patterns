package headfirst.ch05singleton.stat;

public class Singleton {
    private static Singleton uniqueSinglton = new Singleton();
    private Singleton(){}

    public static Singleton getInstance() {return uniqueSinglton;}

    public String getDescription() {
        return "I'm a statically initialized Singlton!";
    }
}
