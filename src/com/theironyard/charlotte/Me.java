package com.theironyard.charlotte;

/**
 * Created by Joe on 11/29/16.
 */
public class Me {
    String name = "Joe";
    String gender = "male";
    String location = "Charlotte";
    String team = "Panthers";
    int age = 31;

    public void myInfo(){
        System.out.println("Hi, my name is " + name + " and I'm " + age + ". I'm a " + gender + " and live in " +
                "" + location + ". I'm a fan of the " + team + ".");
    }

}
