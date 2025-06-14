package LLD;

import LLD.GumballMachine.GumballMachine;

import java.rmi.Naming;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        try {
            GumballMachine gumballMachine = new GumballMachine("Ludhiana",5);
            Naming.rebind("GumballMachine", gumballMachine);
            System.out.println(gumballMachine);
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine);
            gumballMachine.insertQuarter();
            gumballMachine.ejectQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}