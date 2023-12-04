import java.rmi.*;

public interface DoSomething extends Remote {
    public String sayName(String name) throws RemoteException;
    public int multiply(int a, int b) throws RemoteException;
}
