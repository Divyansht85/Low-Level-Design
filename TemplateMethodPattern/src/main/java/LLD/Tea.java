package LLD;

import javax.swing.*;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
    @Override
    boolean customerWantsCondiments() {
        String  answer = JOptionPane.showInputDialog("Would you like lemon with your tea (y/n)?");
        return answer.equalsIgnoreCase("y");
    }
}
