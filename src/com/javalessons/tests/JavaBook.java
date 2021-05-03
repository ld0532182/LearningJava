package com.javalessons.tests;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * this is a comment <code>Variable</code>
 */
public class JavaBook {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Lara", 15, 2002, 12, 30);
        Employee emp2 = new Employee("Lara", 15, 2002, 12, 30);
        String string = emp1.toString();
        System.out.println(string);
        System.out.println(emp1.getSalary());
        System.out.println(emp1.equalsName(emp2));
        emp1.increaseCount();
        emp1.increaseCount();
        emp1.increaseCount();
        System.out.println(emp2.getCount());
        System.out.println("The first emp id is " + emp1.getId());
        System.out.println("The second emp id is " + emp2.getId());
        Manager manager = new Manager("Ban", 300, 1980, 12, 12);
        emp1 = manager;
        Manager manager1 = manager;
        System.out.println(manager.getSalary());
        manager.raiseSalary(100);
        System.out.println(manager.getSalary());
        System.out.println(emp1.getSalary());
    }
}

class Employee implements Comparable<Employee> {
    private final String name;
    private double salary;
    private Date hireDay;
    public static int count;
    private int id;
    private static int nextId = 1;

    public void setId() {
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void increaseCount() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public double getSalary() {
        return salary;
    }

    public boolean equalsName(Employee other) {
        return this.name.equals(other.name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDay=" + hireDay +
                '}';
    }

    public Employee(String name, double salary, int year, int month, int day) {
        setId();
        this.name = Objects.requireNonNullElse(name, "unknown!");
        this.salary = salary;
        GregorianCalendar calendar =
                new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public void raiseSalary(double percent) {
        double raise = this.salary * percent / 100;
        this.salary += raise;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}

class Manager extends Employee {

    private double bonus;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        this.bonus = 5;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
    public double riseSalary(){
        return super.getSalary() + 100;
    }

}