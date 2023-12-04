import java.rmi.*;
import java.rmi.registry.LocateRegistry;

public class DoSomethingServer {
    public static void main(String[] args) {
        try {
            DoSomething doSomething = new DoSomethingRemote();

            LocateRegistry.createRegistry(5000);
            // Naming.rebind("assignment", doSomething);
            Naming.rebind("rmi://localhost:5000/assignment", doSomething);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
