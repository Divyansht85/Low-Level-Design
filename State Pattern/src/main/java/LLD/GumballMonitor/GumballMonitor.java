package LLD.GumballMonitor;

import LLD.GumballMachine.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;
    public GumballMonitor(GumballMachineRemote gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void report(){
        try{
            System.out.println("Gumball Machine:  "+gumballMachine.getLocation());
            System.out.println("Current State:  "+gumballMachine.getState());
            System.out.println("Current Count:  "+gumballMachine.getCount());
        }
        catch (RemoteException e){
            e.printStackTrace();
        }
    }
}
