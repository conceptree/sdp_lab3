import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

public class ServerProgram {
    public static void main(String[] args) {
        System.out.println("Connected to the Server");
        try {
            Naming.rebind("MathServer1", new MathServerClass());
        }  catch (RemoteException e){
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
