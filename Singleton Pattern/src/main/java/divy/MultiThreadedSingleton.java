package divy;

public class MultiThreadedSingleton {
    private MultiThreadedSingleton(){}
    private volatile static MultiThreadedSingleton instance;
    public static MultiThreadedSingleton getInstance(){
        if(instance == null){
            synchronized (MultiThreadedSingleton.class){
                if(instance == null){
                    instance = new MultiThreadedSingleton();
                    System.out.println("Instance created");
                }
            }
        }
        return instance;
    }
    public void doSomething(){
        System.out.println("Doing something");
    }
}
