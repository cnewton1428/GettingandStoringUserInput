package com.company;

        /*
         *
         */


import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {

                Scanner keyboard = new Scanner(System.in);
                System.out.println("firstInitial");
                String firstInitial= keyboard.next();

                System.out.println("lastName");
                String lastName = keyboard.next();

                System.out.println("houseNumber");
                int houseNumber = keyboard.nextInt();

                System.out.println("streetName");
                String streetName = keyboard.next();

                System.out.println("streetType");
                String streetType = keyboard.next();

                System.out.println("city");
                String city = keyboard.next();

                System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
                System.out.println(streetName + " " + streetType + " " + city);



            }
        }

