import java.rmi.*;

public class MyClient {
    public static void main(String[] args) {
        try {
            Adder getter = (Adder) Naming.lookup("rmi://localhost:5000/aptech");
            System.out.println(getter.add(50, 21));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
