package com.serpilozguven.oopproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User myUser = new User("Atıl","Instructor");
        System.out.println(myUser.information());

        System.out.println(myUser.name);

        //Encapsulation

        Musician james = new Musician("James","Guitar", 50);

        //james.age = 60;
        //System.out.println(james.age);
        System.out.println(james.getName());
        james.setAge(60,"Atil");
        System.out.println(james.getAge());

        //Inheritance

        SuperMusician lars = new SuperMusician("Lars","Drums",55);
        System.out.println(lars.sing());
        System.out.println(lars.getAge());

        //Polymorphism

        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,3,4));

        //Dynamic Polymorphism
        Animal myAnimal = new Animal();
        myAnimal.sing();

        Dog barley = new Dog();
        barley.test();
        barley.sing();

        //Abstract & Interface

        Piano myPiano = new Piano();
        myPiano.brand = "Yamaha";
        myPiano.digital = true;
        myPiano.info();

    }
}