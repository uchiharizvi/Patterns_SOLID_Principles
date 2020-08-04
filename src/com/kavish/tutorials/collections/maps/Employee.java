package com.kavish.tutorials.collections.maps;

public class Employee {
    private int employeeNumber;

    public Employee(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
