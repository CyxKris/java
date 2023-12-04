import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DoSomethingRemote extends UnicastRemoteObject implements DoSomething {
    DoSomethingRemote() throws RemoteException {
        super();
    }

    public String sayName(String name) {
        return "Hello, " + name + "! It's really nice to see you\n";
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}
