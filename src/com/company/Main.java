package com.company;
import java.util.ArrayList;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Person> person = new ArrayList<>();

        Person p = new Person("Ermias");
        person.add(p);
        p = new Person("Ariam");
        person.add(p);
        p = new Person("Sam");
        person.add(p);
        p = new Person("Daniel");
        person.add(p);
        p = new Person("Helen");
        person.add(p);
        p = new Person("Erica");
        person.add(p);

        System.out.println();
    }
}
