package com.rc.tech;

public class PrintEvenOddThread {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread t1 = new Thread(new TaskEvenOdd(printer, 10, false), "Odd");
        Thread t2 = new Thread(new TaskEvenOdd(printer, 10, true), "Even");
        t1.start();
        t2.start();
    }
}

class TaskEvenOdd implements Runnable {
    private int max;
    private Printer printer;
    private boolean isEvenNumber;

    public TaskEvenOdd(Printer printer, int max, boolean isEvenNumber) {
        this.printer = printer;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        int number = isEvenNumber ? 2 : 1;
        while (number <= max) {
            if (isEvenNumber) {
                printer.printEven(number);
            } else {
                printer.printOdd(number);
            }
            number += 2;
        }
    }
}

class Printer {
    boolean isOdd = false;

    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notifyAll();
    }
}