package com.company;

import java.util.Scanner;

public class Person {
    private String fName;
//    private String gender;

    public Person(){

    }

    public Person(String fName){
        this.fName = fName;
//        this.gender = gender;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

}
