package com.preps.javaconcepts.equalsandhascodeconcept;

import java.util.*;

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
        System.out.println();
        System.out.println("\nBefore adding an key object with same value: " + salaryMap);
        salaryMap.put(emp3, 90000);
        System.out.println("\nAfter adding an key object with same value: " + salaryMap);

        System.out.println();
        for (Map.Entry<Employee, Integer> employeeIntegerEntry : salaryMap.entrySet()) {
            System.out.println(employeeIntegerEntry);
        }
        System.out.println();

        System.out.println(salaryMap.get(emp1));
        System.out.println(emp3 == emp1);
        System.out.println(emp3.equals(emp1));
        System.out.println(emp1.hashCode() + ", " + emp3.hashCode());

        // When we try to change the state of the object, it might cause unwanted behaviour in the map:
        emp1.setLastName("Sinha");


        // Now the state of the object has changed. The key which we stored earlier has different data.
        // Trying to access the map with modified object
        System.out.println("Access map after changing the object state -> " + salaryMap.get(emp1));
        System.out.println("Access map after changing the object state -> " + salaryMap.get(emp3));

        // Changing the key to previous value would restore the original behaviour
        emp1.setLastName("Ambastha");
        System.out.println("Access map after changing the object state and reversing with same data -> " + salaryMap.get(emp1));

    }
}
