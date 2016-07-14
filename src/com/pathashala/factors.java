package com.pathashala;

import java.util.ArrayList;

/**
 * Created by Hp user on 14-07-2016.
 */
public class factors {
    public ArrayList<Integer> generate(int n) {
        ArrayList<Integer> factorsList = new ArrayList<Integer>();
        for(int i=2; i<n/2; i++) {
            if(n%i == 0) {
                if(isPrime(i))
                    factorsList.add(i);
            }
        }
        return factorsList;
    }

    public boolean isPrime(int n) {
        boolean result = true;
        if (n==2) {
            return true;
        }
        for(int i=2; i<= n/2 + 1; i++) {
            if(n%i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
