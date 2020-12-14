package ual.sdp.lab3;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    private MathServer mathServer;

    public Client() throws RemoteException, NotBoundException, MalformedURLException {
        mathServer = (MathServer) Naming.lookup("rmi://127.0.0.1:4242/MathServer1");
        System.out.println("---- Hello Server "+mathServer.getClass().getName()+" ----");
    }

    double max(MyLinkedMap<Integer, Double> x) throws RemoteException{
        return mathServer.max(x);
    }
    double min(MyLinkedMap<Integer, Double> x) throws RemoteException{
        return mathServer.min(x);
    }
    double avg(MyLinkedMap<Integer,Double> x) throws RemoteException{
        return mathServer.avg(x);
    }
    double sd(MyLinkedMap<Integer, Double> x) throws RemoteException{
        return mathServer.sd(x);
    }
}