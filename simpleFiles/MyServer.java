import java.rmi.*;
import java.rmi.registry.*;

public class MyServer {
    
    public static void main(String[] args) {
        try {
            
            Adder adder = new AdderRemote();

            LocateRegistry.createRegistry(5000);
            Naming.rebind("rmi://localhost:5000/aptech", adder);

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
