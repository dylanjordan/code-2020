package Udemy.Exercise30;

import java.util.Scanner;

public class Person {
    public Scanner input = new Scanner(System.in);
    public String firstName, lastName;
    public int age;

    public void setFirstName(String firstName) {
        System.out.println("Please enter your first name:");
        firstName = input.next();
        this.firstName = firstName;
        
    }
    public void setLastName(String lastName) {
        System.out.println("Please enter your last name");
        lastName = input.next();
        this.lastName = lastName;
        
    }
    public void setAge(int age) {
        System.out.println("Please enter your age:");
        age = input.nextInt();
        if (age > 100 || age < 0) {
            age = 0;
            this.age = age;
        } 
        else {
            this.age = age;
        }
    }
    public boolean isTeen() {
        if (age > 12 || age < 20) {
            return true;
        } else {
            return false;
        }

    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public String getFullName() {
        if (firstName.isEmpty() == true && lastName.isEmpty() == true) {
            String empty = "";
            return empty;
        }
        if (lastName.isEmpty() == true && firstName.isEmpty() == false) {
            return this.firstName;
        }
        if (lastName.isEmpty() == false && firstName.isEmpty() == true) {
            return this.lastName;
        }
        else {
            return firstName + lastName;
    }
    
}
}
