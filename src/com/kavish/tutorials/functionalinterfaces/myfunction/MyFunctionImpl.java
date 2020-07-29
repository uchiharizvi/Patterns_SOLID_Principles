package com.kavish.tutorials.functionalinterfaces.myfunction;

public class MyFunctionImpl {



    public static void main(String[] args) {
        /*Lambda Example*/
        CustomInterface add = (a,b)->a+b;
        CustomInterface substract = (a,b)-> a-b;
        CustomInterface multiply = (a,b)-> a*b;
        CustomInterface divide = (a,b)-> a/b;
        CustomInterface def;

        System.out.println("Addition : " + add.calculate(5,4)); ;
        System.out.println("Substraction : " + substract.calculate(5,4)); ;
        System.out.println("Multiplication : " + multiply.calculate(5,4)); ;
        System.out.println("Division : " + divide.calculate(5,4)); ;
        System.out.println("Default : ");
    }
}
