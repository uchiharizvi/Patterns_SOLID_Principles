package com.kavish.tutorials.threads;

public class ThreadJob implements Runnable{


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " Thread started the job");
    }
}
