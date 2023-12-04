package com.abstractclass;

public class RunApp {
    public static void main(String[] args) {

        // ?You can't create an object from an abstract class. The following throws an error
        // Student student = new Student();

        // *However, you can create an object from a reference of an abstract class. The following is accepted.
        Student stud = new CompleteStudent();
        stud.display();

        CompleteStudent comstudent = new CompleteStudent();
        comstudent.display();
    }
}

// Create an overloaded method to display Password Tokens (Random numbers) of:
// 4 digits, 5 digits, 6 digits ... 10 digits;
