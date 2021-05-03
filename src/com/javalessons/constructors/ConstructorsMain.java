package com.javalessons.constructors;

import com.javalessons.domainmodel.Employee;

public class ConstructorsMain {
    public static void main (String[] args) {

        Employee employee = new Employee("Alex", "dev", 777);
        Employee employee1 = new Employee("John", "dev", 777);

        System.out.println(employee.toString());
        System.out.println(employee1);


    }
}
