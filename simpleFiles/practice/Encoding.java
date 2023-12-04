package practice;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Encoding {
    public static void main(String[] args) throws Exception {
        final String s = "Hello ";
        final byte[] bytes = s.getBytes("UTF-8");
        final String encoded = Base64.getEncoder().encodeToString(bytes);
        System.out.println(s + " is encoded as " + encoded);
    }
}
