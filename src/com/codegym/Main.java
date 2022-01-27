package com.codegym;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Thread thread1 = new Thread(new LazyPrimeFactorization());
        Thread thread2 = new Thread(new OptimizedPrimeFactorization());

        thread1.start();
        thread2.start();
    }
}
