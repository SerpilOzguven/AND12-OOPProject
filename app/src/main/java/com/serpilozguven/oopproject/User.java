package com.serpilozguven.oopproject;

public class User extends People {
    //Property
    String name;
    String job;

    public User(String nameInput, String jobInput) {
        this.name = nameInput;
        this.job = jobInput;

        System.out.println("User created");
    }

    //Constructor

}
