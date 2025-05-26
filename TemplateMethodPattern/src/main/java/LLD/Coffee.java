package LLD;

import javax.swing.*;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }
    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    @Override
    boolean customerWantsCondiments() {
        String  answer = JOptionPane.showInputDialog("Would you like sugar and milk with your coffee (y/n)?");
        return answer.equalsIgnoreCase("y");
    }
}
