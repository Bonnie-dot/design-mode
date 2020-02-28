package state;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine1 = null;
        GumballMachine gumballMachine2 = null;
        try {
            LocateRegistry.createRegistry(1099);
            gumballMachine1 = new GumballMachine(5,"cd");
            gumballMachine2 = new GumballMachine(5,"wh");
            Naming.rebind("gumballMachine1",gumballMachine1);
            Naming.rebind("gumballMachine2",gumballMachine2);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

//        System.out.println(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
    }
}
