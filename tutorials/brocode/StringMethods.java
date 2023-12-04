public class StringMethods {
    public static void main(String[] args) {
        String name = "Cyx";

        // The .equals() method
        // checks for equality between two strings
        // boolean result = name.equals("cyx");
        // boolean result = name.equalsIgnoreCase("cyx");

        // The .length() method
        // returns the length of a string
        // int result = name.length();

        // The .charAt() method
        // Returns the character at a particular index position
        // char result = name.charAt(1);

        // The .indexOf() method
        // Returns the index position of a particular character
        // int result = name.indexOf("x");

        // The .isBlank() method
        // Returns true if the string variable is empty or contains only whitespace
        // boolean result = name.isBlank();

        // The .isEmpy() method
        // Returns true if and only if the length of a string is 0
        // boolean result = name.isEmpty();

        // The .replace() method
        // Replaces a certain character with another character
        String result = name.replace("C", "S");

        // ?OTHER METHODS INCLUDE..
        // .toLowerCase()
        // .toUpperCase()
        // .trim()... this removes all extra whitespace before and after the string

        System.out.println(result);
    }
}
