package practice;

public class EnumFile {

    public enum Cardinals {
        North, East, South, West;
    }

    public static void main(String[] args) {
        Cardinals firstCardinals = Cardinals.North;

        System.out.println("The first cardinal point is: " + firstCardinals);

        int a = 5;
        System.out.println("\nThe value of a is: " + a);

        int j = a++;
        System.out.println("\nThe value of j is: " + j);
        System.out.println("The value of a is: " + a);

        int k = ++a;
        System.out.println("\nThe value of k is: " + k + "\n");

        String result = (j == a) ? "j is the same as a" : "j is not the same as a";
        System.out.println(result);
    }
}
// *----------------------------------------------------------------

// ?OR:

// *----------------------------------------------------------------
// public enum Cardinals {
//     North, South, East, West;

//     public static void main(String[] args) {
//         Cardinals firstCardinals = Cardinals.East;

//         System.out.println("The firstCardinals variable contains: " + firstCardinals);
//     }
// }
