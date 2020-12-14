package ual.sdp.lab3;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerProgram {
    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(4242);
        registry.rebind("MathServer1", new MathServerClass());
    }
}
