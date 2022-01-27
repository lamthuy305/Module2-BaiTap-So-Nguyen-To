package com.codegym;

public class OptimizedPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
        if (isPrime(i)==true) {
            System.out.println("OptimizedPrimeFactorization "+i);
        }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isPrime(int number) {
        if (number < 2)
            return false;
        if (number == 2)
            return true;
        if (number % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
