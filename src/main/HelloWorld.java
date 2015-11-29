package com.customsite.helloworld;

/**
 * Created by julian.bishop on 11/21/15.
 */
public class HelloWorld {


    public static void main (String [] args) {


        System.out.println("Hello World!");


        boolean isValidUser = new com.customsite.helloworld.Login().isValidUsername("fred");
        System.out.println(isValidUser);

        isValidUser = new com.customsite.helloworld.Login().isValidUsername("user3");
        System.out.println(isValidUser);



    }
}


