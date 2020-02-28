package proxy.rmi;

import state.GumballMonitor;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMachineClient {
    void go(){
        try {
            GumballMachineRemote gumballMachine1= (GumballMachineRemote) Naming.lookup("//127.0.0.1:1099/gumballMachine1");
            GumballMachineRemote gumballMachine2 = (GumballMachineRemote) Naming.lookup("//127.0.0.1:1099/gumballMachine2");
            GumballMonitor gumballMonitor1 = new GumballMonitor(gumballMachine1);
            GumballMonitor gumballMonitor2 = new GumballMonitor(gumballMachine2);
            gumballMonitor1.report();
            gumballMonitor2.report();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        GumballMachineClient gumballMachineClient = new GumballMachineClient();
        gumballMachineClient.go();
    }
}
