package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(minus(8,5));
        System.out.println(minus(10,5));
    }

    //@param int x,y
    //@returns int distance
    public static int rMinus(int x, int y) {
        int distance = 0;
        int max = y > x ? y : x ;
        int min = y > x ? x : y ;
        int i = min;
        if (i<max) {
            i++;
            distance = rMinus(i,max);
        }


    }
    //@param int x,y
    //@returns int distance
    public static int minus(int x,int y) {
        int distance = 0;
        int max = y > x ? y : x ;
        int min = y > x ? x : y ;
        for (int i = min; i < max ; i++) {
            distance++;
        }
        return distance;

    }
}
