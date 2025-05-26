package LLD;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {new Duck("Daffy", 10), new Duck("Dewey", 5), new Duck("Howard", 15)};
        System.out.println("Before Sorting: ");
        display(ducks);
        Arrays.sort(ducks);
        System.out.println("After Sorting: ");
        display(ducks);
    }
    public static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}