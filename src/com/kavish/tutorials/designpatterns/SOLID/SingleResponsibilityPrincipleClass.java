package com.kavish.tutorials.designpatterns.SOLID;

public class SingleResponsibilityPrincipleClass {
    int data = 50;
    public void change(int data){
        data+=100;
    }

    public static void main(String[] args) {
        SingleResponsibilityPrincipleClass obj = new SingleResponsibilityPrincipleClass();
        System.out.println("Before change " + obj.data);
        obj.change(obj.data);
        System.out.println("After change " + obj.data);
    }
}
