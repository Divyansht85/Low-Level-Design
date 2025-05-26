package LLD;

public class Main {
    public static void main(String[] args) {
        Duck duck = new TurkeyAdapter(new WildTurkey());
        testDuck(duck);
    }
    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}