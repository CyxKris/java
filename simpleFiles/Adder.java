import java.rmi.*;
// *rmi: remote method invocation

public interface Adder extends Remote {

    public int add(int x, int y) throws RemoteException;
}
