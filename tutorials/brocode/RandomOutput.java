// IMPORTS
import java.util.Random;

public class RandomOutput {
    public static void main(String[] args) {
        // NEW RANDOM INSTANCE
        Random random = new Random();

        int x = random.nextInt(6);
        // The above code displays a 'pseudo random number' between 0 and 6 exclusive. i.e 0 to 5;

        double y = random.nextDouble();
        // Displays a 'pseudo random number' between 0 and 1 exclusive;

        boolean z = random.nextBoolean();
        // Displays a 'pseudo random boolean';

        System.out.println(x + " " + y + " " + z);
    }
}
