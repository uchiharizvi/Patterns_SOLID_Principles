package com.kavish.tutorials.functionalinterfaces;

import java.util.function.*;

/**
 * @author Kavish Rizvi
 */
public class FunctionInterfacesExample {

    public static void main(String[] args) {
        //using the test method of Predicate
        Predicate<String> stringPredicate = (s) -> s.length() < 10;//specify condition to match and return boolean value
        System.out.println("Predicate : ");
        System.out.println(stringPredicate.test("Apples") + " - Apples length is less than 10");

        //Consumer example uses accept method--(return type void|single argument)
        System.out.println("Consumer : ");
        Consumer<String> stringConsumer = (s)-> System.out.println(s.toLowerCase());//implementation of consumer accept method
        stringConsumer.accept("ABCDefghijklmnopQRSTuvWxyZ"); //consumer called using accept(abstract method)

        //Function Interface--<x,y>-- x is for input, Y is for output
        Function<Integer, String> converter = (num)-> Integer.toString(num);
        System.out.println("Function : ");
        System.out.println("length of 26 : " + converter.apply(26).length());

        //Supplier Example--(return type void, no arguments)
        Supplier<String> stringSupplier = ()->"Java is fun"; // Difference b/w () and (s) lambda params?
        System.out.println("Supplier : ");
        System.out.println(stringSupplier.get());//get() abstract method

        //Binary Operator(Return type<x>, arguments(a,b))
        BinaryOperator<Integer> add = (a,b)-> a+b;
        System.out.println(add.apply(10,25));
        //Unary Operator
        UnaryOperator<Integer> square = (a)->a*a;
        System.out.println("Square of 66 : " + square.apply(66));
    }
}
