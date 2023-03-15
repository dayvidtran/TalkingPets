package io.zipcoder.polymorphism;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int pets = Integer.parseInt(scan.nextLine());

        if (pets == 1){
            System.out.println("What is the name of your pet?");
            String pet1 = scan.nextLine();
            System.out.println("What kind of animal is " + pet1 +"?");
            String pet1Type = scan.nextLine();
        }
        if (pets == 2){
            System.out.println("What is the name of your first pet?");
            String pet1 = scan.nextLine();
            System.out.println("What is the name of your second pet?");
            String pet2 = scan.nextLine();
            System.out.println("What kind of animal is " + pet1 +"?");
            String pet1Type = scan.nextLine();
            System.out.println("What kind of animal is " + pet2 +"?");
            String pet2Type = scan.nextLine();
        }
        if (pets == 3){
            System.out.println("What is the name of your first pet?");
            String pet1 = scan.nextLine();
            System.out.println("What is the name of your second pet?");
            String pet2 = scan.nextLine();
            System.out.println("What is the name of your third pet?");
            String pet3 = scan.nextLine();
            System.out.println("What kind of animal is " + pet1 +"?");
            String pet1Type = scan.nextLine();
            System.out.println("What kind of animal is " + pet2 +"?");
            String pet2Type = scan.nextLine();
            System.out.println("What kind of animal is " + pet3 +"?");
            String pet3Type = scan.nextLine();}

    }
}
