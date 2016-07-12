package com.pathashala;

/**
 * Created by Hp user on 12-07-2016.
 */
public class lines {

    public void printAnAsterisk() {
        System.out.println('*');
    }

    public void horizontalLine(int n) {
        for(int i=0; i<n; i++) {
            System.out.print('*');
        }
    }

    public void verticalLine(int n) {
        for (int i=0; i<n; i++) {
            System.out.println('*');
        }
    }
}
