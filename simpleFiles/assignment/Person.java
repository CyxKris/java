package assignment;

public class Person {
    String name;
    int age;

    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void displayData() {
        System.out.println("-----PERSON-----" + "\nNAME: " + name + "\nAGE: " + age + "\n");
    }
}
