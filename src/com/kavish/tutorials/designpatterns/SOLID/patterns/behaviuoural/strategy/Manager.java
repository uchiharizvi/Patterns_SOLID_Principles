package com.kavish.tutorials.designpatterns.SOLID.patterns.behaviuoural.strategy;

public class Manager  implements Strategy{
    /**Use Composition over inheritance
     * Use Interface to change strategy at runtime
     */
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void operation(int num1, int num2) {
        this.strategy.operation(num1, num2);
    }
}
