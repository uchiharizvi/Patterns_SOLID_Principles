package com.kavish.tutorials.collections.maps;

import java.util.HashMap;
import java.util.Map;

public class AppDemo {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap();
        Employee emp = new Employee(25);
        map.put(emp, "Random");
        map.put(emp, "Do IT");

        map.get(emp);
    }
}
