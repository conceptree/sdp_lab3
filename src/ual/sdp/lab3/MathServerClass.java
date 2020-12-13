package ual.sdp.lab3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MathServerClass extends UnicastRemoteObject implements MathServer {
    private static final long serialVersionUID = 1L;

    protected MathServerClass() throws  RemoteException {
        super();
    }
    //Maximum
    public double max(MyLinkedMap<Integer, Double> x) throws RemoteException{
        double maxVal = x.getValue(0);
        for (int i = 0; i < x.size(); i++) {
            if(maxVal < x.getValue(i)){
                maxVal = x.getValue(i);
            }
        }
        return maxVal;
    }

 //Minimum
    public double min(MyLinkedMap<Integer, Double> x) throws RemoteException{
        double minValue = x.getValue(0);
        for(int i=1; i < x.size(); i++){
            if( minValue > x.getValue(i)){
                minValue = x.getValue(i);
            }
        }
        return minValue;
    }

    //average
    public double avg(MyLinkedMap<Integer,Double> x) throws RemoteException{
        // x = sum[x++]/len
        double sumVal = 0;
        for(int i = 0; i < x.size(); i++){
            sumVal+= x.getValue(i);
        }
        double Average = sumVal / x.size();
        return Average;
    }


 //Standard Deviation
 //rever cálculo
    public double sd(MyLinkedMap<Integer, Double> x) throws RemoteException{
        double sum = 0;
        double standardDeviation = 0;
        for(int i = 0; i < x.size();  i++){
            sum += x.getValue(i);
        }
        double mean = sum/x.size();

        for(int i=0; i < x.size(); i++) {
            standardDeviation += Math.pow((x.getValue(i) - mean), 2);
        }
        return Math.sqrt(standardDeviation/x.size());
    }
}