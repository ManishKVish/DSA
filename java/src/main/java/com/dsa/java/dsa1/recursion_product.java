package com.dsa.java.dsa1;

public class recursion_product {
    public static void main(String[] args) {
        int i = product(5, 3);
        System.out.println(i);
    }

    public static int product(int i, int j) {
        if (i < j) {
            return product(j, i);
        }
        if (j == 1) {
            return i;
        }
        int sum = product(i, j - 1);
        return sum + i;
    }
}
