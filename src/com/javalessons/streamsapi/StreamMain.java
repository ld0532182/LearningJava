package com.javalessons.streamsapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        //.filter
        ArrayList<String> cities = new ArrayList<>();
        Collections.addAll(cities, "Лондон", "Париж", "Москва", "Стамбул");
        cities.stream()
                .filter(s -> s.charAt(0) == 'Л')
                .forEach(System.out::println);

        ArrayList<Employee> employeesList = new ArrayList<>();

        employeesList.add(new Employee(1, "Viktor", "Makarov", "IT", 75000));
        employeesList.add(new Employee(2, "Ilya", "Pivov", "Sales", 91000));
        employeesList.add(new Employee(4, "Darya", "Vodyanova", "IT", 58000));
        employeesList.add(new Employee(6, "Dmitry", "Gavrilov", "Supply", 61000));
        employeesList.add(new Employee(7, "Oleg", "Chapaev", "HR", 99000));
        employeesList.add(new Employee(12, "Ekaterina", "Makarov", "IT", 88000));
        employeesList.add(new Employee(11, "Oleg", "Strunkin", "Supply", 54000));
        employeesList.add(new Employee(9, "Semen", "Slepakov", "Sales", 68000));
        employeesList.add(new Employee(16, "Maksim", "Maksim", "HR", 52500));
        //comparator
        employeesList.stream()
                .sorted(Comparator.comparingInt(Employee::getId))
                .forEach(System.out::println);
        System.out.println("-------------------\nComparison by LastName");
        employeesList.stream()
                .sorted(Comparator.comparing(e -> e.getLastName().toLowerCase()))
                .forEach(System.out::println);
        //filter
        System.out.println("-------------------\nEmployees with salary >= 70 000");
        employeesList.stream().filter(x -> x.getSalary() >= 70000).forEach(System.out::println);

        //skip and limit
        System.out.println("-------------------\nskip and limit");
        System.out.println(employeesList.stream().skip(4).findFirst());
        System.out.println("Limit 3 / 4");
        employeesList.stream().skip(3).limit(4).forEach(System.out::println);
        //reduce
        System.out.println("-------------------\nSalary amount");
        Integer sum = 0;
        sum = employeesList.stream().reduce(sum, (x, y) -> x + y.getSalary(), Integer::sum);
        System.out.println(sum);
        //collect to map
        System.out.println("-------------------\nCollect to map");
        Map<Integer, String> collectionEmployees = employeesList.stream()
                .collect(Collectors.toMap(Employee::getId, Employee::getFirstName));
        collectionEmployees.forEach((x, y) -> System.out.println("Id: " + x + ", name " + y));
        //Grouping by department
        System.out.println("-------------------\nGrouping by department");
        Map<String, List<Employee>> mapByDepartment = employeesList.stream().
                collect(Collectors.groupingBy(Employee::getDepartment));
        for(Map.Entry<String, List<Employee>> dep : mapByDepartment.entrySet()) {
            System.out.println(dep.getKey());
            for(Employee emp : dep.getValue()){
                System.out.println(emp);
            }
        }
    }
}

class Employee {

    private int id;
    private String firstName;
    private String lastName;
    private String department;
    private int salary;

    public Employee(int id, String firstName, String lastName, String department, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }

    @Override
    public String toString() {
        return "{id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}