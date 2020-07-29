package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.strategy;

public class QuickSort implements Sorter {
    @Override
    public void sort() {
        //Concrete Impl of quick sort
        System.out.println("Sorting with Quick Sort...");
    }
}
