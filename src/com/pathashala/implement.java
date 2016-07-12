package com.pathashala;

import java.util.Scanner;
/**
 * Created by Hp user on 12-07-2016.
 */
public class implement {
    public static void main(String[] args) {
        printAsterisk myStar = new printAsterisk();
        myStar.printAnAsterisk();

        lines line = new lines();
        line.printAnAsterisk();

        Scanner reader = new Scanner(System.in);
        int num = reader.nextInt();

        line.horizontalLine(num);
        System.out.println("\nVertical Line");
        line.verticalLine(num);

    }
}
