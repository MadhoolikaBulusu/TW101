package com.pathashala;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Hp user on 12-07-2016.
 */
public class implement {
    public static void main(String[] args) {

        LinesTrianglesAndDiamonds line = new LinesTrianglesAndDiamonds();

        line.printAnAsterisk();

        Scanner reader = new Scanner(System.in);
        System.out.print("\nEnter number to generate horizontal line:");
        int num = reader.nextInt();

        line.horizontalLine(num);

        System.out.print("\nEnter number to generate horizontal line:");
        num = reader.nextInt();
        line.verticalLine(num);

        System.out.print("\nEnter number to generate right triangle:");
        num = reader.nextInt();
        line.rightTriangle(num);

        System.out.print("\nEnter number to generate isosceles triangle:");
        num = reader.nextInt();
        line.isoscelesTriangle(num);

        System.out.print("\nEnter number to generate diamond:");
        num = reader.nextInt();
        line.diamond(num);

        System.out.print("\nEnter number to generate name in diamond:");
        num = reader.nextInt();
        line.nameInDiamond(num);

        FizzBuzz fb = new FizzBuzz();
        fb.fizzBuzz();

        factors f = new factors();
        System.out.print("\nEnter number to generate prime factors:");
        num = reader.nextInt();
        ArrayList<Integer> l = f.generate(num);
        for(Integer i : l) {
            System.out.println(i);
        }
    }
}
