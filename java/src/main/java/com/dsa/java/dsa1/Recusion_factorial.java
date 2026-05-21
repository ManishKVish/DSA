package com.dsa.java.dsa1;

public class Recusion_factorial {
    public static void main(String[] args) {
        int i = fact(3);
        System.out.println(i);
    }

    public static int fact(int i) {
        if (i == 0) {
            return 1;
        }
        int get = fact(i - 1);
        System.out.println(i);
        return get * i;
    }
}
