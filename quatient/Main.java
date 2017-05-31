package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(product(10,2));
    }
    public static  int product(int x, int y) {
        int max = y > x ? y:x ;
        int min = y > x ? x:y ;
        int counter = 1;
        if (min!=0) {
            for (int i = min ; i < max; i+=min ){
                counter++;
            }
        } else {
            return 0;
        }
        return counter;
    }
}
