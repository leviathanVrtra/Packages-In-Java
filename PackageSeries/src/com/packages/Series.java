package com.packages;

public class Series {
    public int nSum(int n) {
        int sum = 0;
        sum = n * (n + 1);
        sum = sum >> 1;
        return sum;
    }

    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact += fact * i;
        }
        return fact;
    }
}
