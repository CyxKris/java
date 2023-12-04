public class Employee {
        int id = 0;
        String name = "John";
        String department = "Technical";
        String gender = "Male";
        String address = "Lagos, Nigeria";

        public void displayData() {
            System.out.println("\nTHE REQUESTED DATA OF YOUR EMPLOYEE...\n");

            System.out.println("Employee ID: " + id);
            System.out.println("Employee name: " + name);
            System.out.println("Employee Department: " + department);
            System.out.println("Employee Gender: " + gender);
            System.out.println("Employee Address: " + address);
        }
}
