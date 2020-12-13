package ual.sdp.lab3;

import java.rmi.Naming;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    private MathServer mathServer;

    public Client() {
        try {
            mathServer = (MathServer) Naming.lookup("rmi://127.0.0.1/MathServer1");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
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