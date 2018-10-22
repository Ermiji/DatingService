package com.company;
import javax.swing.*;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        int random, rand;
        ArrayList<Person> tempPerson1= new ArrayList<Person>();
        ArrayList<Person> tempPerson2= new ArrayList<Person>();

        ArrayList<Person> persons = new ArrayList<Person>();

        Person p = new Person("Ermias");
        persons.add(p);
        Person p1 = new Person("Ariam");
        persons.add(p1);
        Person p2 = new Person("Sam");
        persons.add(p2);
        Person p3 = new Person("Weldu");
        persons.add(p3);
        Person p4 = new Person("Helen");
        persons.add(p4);
        Person p5 = new Person("Erica");
        persons.add(p5);

        for(int i = 0; i< 10; i++) {

            random = (int) (Math.random() * 5+1);
            rand = (int)(Math.random()* 5+1);
            if(random != rand){
                tempPerson1.add(persons.get(random));
                tempPerson2.add(persons.get(rand));

            }


        }
        for(int i = 0; i< 10; i++) {

            System.out.println(i + " " + tempPerson1.get(i).getfName() + " asked " + tempPerson2.get(i).getfName() +
                    " out, and " + tempPerson2.get(i).getfName() + " accepted");
            System.out.println(tempPerson1.get(i).getfName() + " played chess with "  + tempPerson2.get(i).getfName());
            System.out.println(tempPerson1.get(i).getfName() + " visited " + tempPerson2.get(i).getfName());
            System.out.println(tempPerson1.get(i).getfName() + " went to dinner with " + tempPerson2.get(i).getfName());

        }
    }
}