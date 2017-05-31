package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(product(10,2));
        System.out.println(product(20,3));
    }
    public static  int product(int x, int y) {
    if ((x == 0) || (y == 0)) {
        return 0;
    }
    int k = 0;
    for (int i = 0; i < y ; i++) {
        k+=x;
    }
    return k;
    }
}
