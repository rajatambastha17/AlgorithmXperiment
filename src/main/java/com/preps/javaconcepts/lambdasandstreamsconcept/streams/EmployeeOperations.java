package com.preps.javaconcepts.lambdasandstreamsconcept.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeOperations {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee(21, "Ilsa", 2019);
        Employee e2 = new Employee(22, "Kate", 2018);
        Employee e3 = new Employee(17, "Jerome", 2017);
        Employee e4 = new Employee(32, "Micheal", 2012);
        Employee e5 = new Employee(86, "Stew", 2022);
        Employee e6 = new Employee(39, "Rudd", 2022);
        Employee e7 = new Employee(67, "Gregor", 2021);
        Employee e8 = new Employee(45, "Trevor", 2022);
        Employee e9 = new Employee(96, "Matt", 2021);
        Employee e10 = new Employee(28, "Han", 2020);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);
        employees.add(e7);
        employees.add(e8);
        employees.add(e9);
        employees.add(e10);

        List<Employee> newList = employees.stream().filter(employee -> (employee.getYearOfJoining() > 2012 && employee.getYearOfJoining() < 2022))
                .toList();
        for (Employee e : newList) {
            System.out.println(e);
        }
        List<Integer> years = employees.stream()
                .map(employee -> employee.getYearOfJoining())
                .filter(yearOfJoining -> yearOfJoining > 2012)
                .toList();
        System.out.println(years);
    }
}
