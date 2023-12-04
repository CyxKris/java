public class TwoDArray {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];

        cars[0][0] = "Camaro";
        cars[0][1] = "Corvette";
        cars[0][2] = "BMW";
        cars[1][0] = "Ford";
        cars[1][1] = "Bugatti";
        cars[1][2] = "Toyota";
        cars[2][0] = "Hyundai";
        cars[2][1] = "Kia";
        cars[2][2] = "Tesla";

        // ?OR: 
        String[][] colors = {
                { "Blue", "Green", "Yellow" },
                { "Red", "Magenta", "Black" },
                { "Orange", "Indigo", "Purple" }
        };

        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < colors.length; i++) {
            System.out.println();
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j] + " ");
            }
        }
    }
}
