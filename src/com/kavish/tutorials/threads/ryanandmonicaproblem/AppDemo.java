package com.kavish.tutorials.threads.ryanandmonicaproblem;

public class AppDemo {
    public static void main(String[] args) {
        RyanAndMonicaJob job = new RyanAndMonicaJob();
        Thread t1 = new Thread(job);
        Thread t2 = new Thread(job);

        t1.setName("Ryan");
        t2.setName("Monica");
        t1.start();
        t2.start();
    }
}
