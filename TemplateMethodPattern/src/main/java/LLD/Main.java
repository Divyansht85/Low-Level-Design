package LLD;

public class Main {
    public static void main(String[] args) {
        Tea tea = new Tea();
        System.out.println("\nMaking tea...");
        tea.prepareRecipe();
        Coffee coffee = new Coffee();
        System.out.println("\nMaking coffee...");
        coffee.prepareRecipe();
    }
}