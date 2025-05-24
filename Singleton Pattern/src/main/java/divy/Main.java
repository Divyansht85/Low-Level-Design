package divy;

public class Main {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        instance.doSomething();
        Singleton instance2 = Singleton.INSTANCE;
        instance2.doSomething();
    }
}