package com.kavish.tutorials.functionalinterfaces.myfunction;

@FunctionalInterface/*To check if interface follows guidelines to be a functionalInterface
 *Compilation error if no abstract method or more than 1 abstract method found
 */
public interface CustomInterface {

    /**
     * Abstract Method
     */
    public Integer calculate(int a, int b);

    /**
     * default method
     */
    default void print() {
        /**
         access identifier : default
         */
        System.out.println("Execution Complete");
    }

}
