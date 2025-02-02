package com.preps.javaconcepts.equalsandhascodeconcept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EqualsAndHashcodeConcept {

    public static void main(String[] args) {
        Employee emp1 = new Employee(18, "Rajat", "Ambastha");
        Employee emp2 = new Employee(24, "Anushri", "Jain");
        Employee emp3 = new Employee(18, "Rajat", "Ambastha");
        Employee emp4 = new Employee(18, "Palak", "Ambastha");

        Map<Employee, Integer> salaryMap = new HashMap<>();
        salaryMap.put(emp1, 80000);
        salaryMap.put(emp2, 75000);
        salaryMap.put(emp4, 32000);
        System.out.println("Before adding an object with same value: " + salaryMap);
        salaryMap.put(emp3, 90000);
        System.out.println("After adding an object with same value: " + salaryMap);

        for (Map.Entry<Employee, Integer> employeeIntegerEntry : salaryMap.entrySet()) {
            System.out.println(employeeIntegerEntry);
        }
        System.out.println();

        System.out.println(salaryMap.get(emp1));
        System.out.println(emp3 == emp1);
        System.out.println(emp3.equals(emp1));
        System.out.println(emp1.hashCode() + ", " + emp3.hashCode());
    }
}
