package com.kavish.tutorials.threads;

public class AppDemo {

    public static void main(String[] args) {
        System.out.println("MultiThreaded System...");
        Runnable job = new ThreadJob();//create an object of class implementing Runnable Interface
        Thread t1 = new Thread(job); //Object of Thread class--thread | State : New
        Thread t2 = new Thread(job); //Object of Thread class--thread | State : New
        t1.setName("T1");
        t2.setName("T2");
        t1.start();//Execute the thread | State : Runnable
        t2.start();
        //State : Running
    }
}
