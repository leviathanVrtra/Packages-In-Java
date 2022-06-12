package com.packagetest;

import com.packages.Series;

public class Main {
    public static void main(String[] args) {
        Series src = new Series();
        for (int i = 0; i <= 5; i++) {
            System.out.print(src.nSum(i) + " ");
        }
        System.out.println();
        for (int i = 0; i <= 5; i++) {
            System.out.print(src.factorial(i) + " ");
        }
        System.out.println();
    }
}