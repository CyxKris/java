public class WrapperClass {
    public static void main(String[] args) {
        // wrapper class => provides a way to use primitive data types as reference data types.
        // Reference data types contain useful methods and can be used with collections e.g ArrayList

        // PRIMITIVE DATA TYPES AND THEIR CORRESPONDING WRAPPER CLASS
        // *primitive       // wrapper
        // ----------       // --------
        // boolean          // Boolean
        // char             // Character
        // int              // Integer
        // double           // Double

        // *autoboxing => the automatic conversion that the Java Compiler makes between primitive data types and their corresponding object wrapper class
        // *unboxing => the reverse of autoboxing. Automatic conversion of wrapper class to primitive data types

        // ?AUTOBOXING
        Boolean a = false;
        Character b = 'I';
        Integer c = 123;
        Double d = 3.14;
        String e = "Cyx";

        // ?UNBOXING
        if (a) {
            System.out.println("This is true");
        }

        // !Primitive data types are much faster than reference types
    }
}
