package pl.jagodaprogramuje;

import java.sql.SQLOutput;
import java.util.Scanner;

public class  main {


    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Frizz Buzz");

            } else if (i%3==0) {
                System.out.println("fizz");}
            else if (i%5==0){
                System.out.println("buzz");}
            else{
                System.out.println(i);
            }
        }
    }
}