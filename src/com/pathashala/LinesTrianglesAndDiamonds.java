package com.pathashala;

/**
 * Created by Hp user on 12-07-2016.
 */
public class LinesTrianglesAndDiamonds {

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

    public void rightTriangle(int n) {
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<i+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void isoscelesTriangle (int n) {
        int count = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<count; j++) {
                System.out.print('*');
            }
            count = count+2;
            System.out.print('\n');
        }
    }

    public void diamond(int n) {
        int count = n-1;
        int x = 0;
        for(int i=0; i<(2*n-1); i++) {
            for(int j=0; j<(2*n-1); j++) {
                if (j>=count-x && j<=count+x) {
                    System.out.print('*');
                }
                else{
                    System.out.print(' ');
                }
            }
            if(i<n-1) { x++; }
            else { x--; }

            System.out.print('\n');
        }
    }

    public void nameInDiamond (int n) {
        int count = n-1;
        int x = 0;
        for(int i=0; i<(2*n-1); i++) {
            for(int j=0; j<(2*n-1); j++) {
                if (count-x == 0){
                    System.out.print("Madhoolika");
                    break;
                }
                else {
                    if (j>=count-x && j<=count+x) {
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            if(i<n-1) { x++; }
            else { x--; }

            System.out.print('\n');
        }
    }
}
