package com.pathashala;

/**
 * Created by Hp user on 14-07-2016.
 */
public class FizzBuzz {
    public void fizzBuzz (){
        int n = 100;
        for(int i = 0; i<=n; i++) {
            if ( i%15 == 0) { System.out.println("FizzBuzz"); }
            else if(i%3 == 0) { System.out.println("Fizz"); }
            else if(i%5 == 0) { System.out.println("Buzz"); }
            else System.out.println(i);
        }
    }
}
