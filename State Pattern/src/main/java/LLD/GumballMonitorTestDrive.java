package LLD;

import LLD.GumballMachine.GumballMachine;
import LLD.GumballMachine.GumballMachineRemote;
import LLD.GumballMonitor.GumballMonitor;

import java.rmi.Naming;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        GumballMonitor gumballMonitor;
        try {
            GumballMachineRemote gumballMachine = (GumballMachineRemote) Naming.lookup("GumballMachine");
            gumballMonitor = new GumballMonitor(gumballMachine);
            gumballMonitor.report();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
