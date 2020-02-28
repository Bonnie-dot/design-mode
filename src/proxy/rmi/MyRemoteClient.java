package proxy.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class MyRemoteClient {
    public void go() {
        try {
            MyRemote server = (MyRemote) Naming.lookup("//127.0.0.1:1099/RemoteHello");
            System.out.println(server.sayHello());
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyRemoteClient myRemoteClient = new MyRemoteClient();
        myRemoteClient.go();
    }
}
