package proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        System.out.println("Hello World");
        return "Hello World";
    }

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            MyRemoteImpl service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);

        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
