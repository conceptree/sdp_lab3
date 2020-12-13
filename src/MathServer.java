import java.rmi.Remote;
import java.rmi.RemoteException;


public interface MathServer extends Remote{
    double max(MyLinkedMap<Integer, Double> x) throws RemoteException;
    double min(MyLinkedMap<Integer, Double> x) throws RemoteException;
    double avg(MyLinkedMap<Integer,Double> x) throws RemoteException;
    double sd(MyLinkedMap<Integer, Double> x) throws RemoteException;
    }

