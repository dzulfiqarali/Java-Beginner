package com.FirstProject;

public class Main { // defining a class named as 'Main'. Note: the class name cannot be main or any token 

    public static void main(String[] args) { //defining the main function
	// write your code here
        selamatPagi("Jul");// calling another function and sending a String parameter "Jul"
    }

    public static void selamatPagi(String nama){//defining another function
        System.out.println("Selamat pagi " + nama);//printing a statement
    }
}
