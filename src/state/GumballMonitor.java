package state;

import proxy.rmi.GumballMachineRemote;

import java.rmi.RemoteException;

public class GumballMonitor {
    //this is remote interface
    GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() throws RemoteException {
        System.out.println("Gumball Machine:"+machine.getLocation());
        System.out.println("Current inventory"+machine.getCount()+"gumball");
        System.out.println("Current state:"+machine.getState());
    }
}
