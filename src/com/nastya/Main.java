package com.nastya;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main ( String[] args ) {
        int repeat = 1;

        do {
            int compChoice = randomCompChoice ();
            for (int i = 0; i < 3; i++) {

                int userChoice = getNumberFromScanner ("Введите число в пределах от 0 до 9" , 0 , 9);


                if (userChoice > compChoice) {
                    System.out.println ("Вы ввели слишком большое число.");

                }
                if (userChoice < compChoice) {
                    System.out.println ("Вы ввели слишком маленькое число.");
                }
                if (userChoice == compChoice) {
                    System.out.println ("Поздравляю! Вы угадали!");
                    break;
                }

            }
            repeat = getAnswer ("Повторить игру еще раз? 1 – да / 0 – нет" , 0 , 1);

        }
        while (repeat != 0);
    }


    private static int randomCompChoice () {
        Random rand = new Random ();
        int a = rand.nextInt (10);
        //System.out.println (a);
        return a;
    }

    public static int getNumberFromScanner ( String message , int min , int max ) {
        int x;
        do {
            System.out.println (message);
            Scanner sc = new Scanner (System.in);
            x = sc.nextInt ();
        } while (x < min || x > max);
        return x;
    }
    public static int getAnswer ( String message , int min , int max ) {
        int x;
        do {
            System.out.println (message);
            Scanner sc = new Scanner (System.in);
            x = sc.nextInt ();
        } while (x < min || x > max);
        return x;
    }

}

