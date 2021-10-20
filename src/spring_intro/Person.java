package spring_intro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

   /* public Person() {
        System.out.println("Person");
    }*/
@Autowired
    public Person(Pet pet) {
        System.out.println("Person");
        this.pet = pet;
    }


    public void callPet(){
        System.out.println("Hello my lovely pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Set pet");
        this.pet = pet;
    }
}
