package com.codegym;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)==true) {
                System.out.println("LazyPrimeFactorization "+i);
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
        for (int i = 2; i < number; i += 1) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}
