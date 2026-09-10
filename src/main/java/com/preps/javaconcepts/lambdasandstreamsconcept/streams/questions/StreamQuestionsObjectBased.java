package com.preps.javaconcepts.lambdasandstreamsconcept.streams.questions;

import com.sun.security.jgss.GSSUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.stream.Collectors;

public class StreamQuestionsObjectBased {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Ravi", 28, 60000, "IT"),
                new Employee("Anjali", 32, 72000, "HR"),
                new Employee("Karan", 26, 48000, "Sales"),
                new Employee("Preeti", 30, 52000, "Sales"),
                new Employee("Aman", 35, 85000, "Finance"),
                new Employee("Divya", 24, 45000, "HR"),
                new Employee("Sahil", 31, 67000, "IT"),
                new Employee("Megha", 29, 58000, "Marketing"),
                new Employee("Nikhil", 27, 61000, "Finance"),
                new Employee("Sanya", 34, 79000, "Marketing"),
                new Employee("Raj", 33, 74000, "IT"),
                new Employee("Neha", 25, 50000, "HR"),
                new Employee("Tarun", 28, 54000, "Sales"),
                new Employee("Ruchi", 36, 88000, "Finance"),
                new Employee("Arjun", 29, 69000, "IT")
        );

        // Get a list of all employees in the "HR" department
        List<Employee> hrs = employees.stream().filter(employee -> employee.getDepartment().equals("HR")).toList();
        hrs.forEach(System.out::println);

        // Get names of employees whose salary is above 50,000
        List<String> employeeNames = employees.stream().filter(employee -> employee.getSalary() > 50000).map(Employee::getName).toList();
        employeeNames.forEach(System.out::println);

        // Find the average salary of all employees
        double avgSalary = employees.stream().mapToDouble(Employee::getSalary).average().orElse(0);
        System.out.println("\nAverage salary of employees: " + avgSalary);

        // Find the highest paid employee
        Optional<Employee> empl = employees.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println("\nHighest paid employee is: " + empl.get() + "\n");

        // Sort employees by age
        List<Employee> sortedByAge = employees.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        sortedByAge.forEach(System.out::println);

        // Get a list of names sorted by salary in descending order
        List<String> namesSortedBySalary = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).map(Employee::getName).toList();
        System.out.println("\n" + namesSortedBySalary);

        // Count employees in each department
        Map<String, Long> count = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("\nCount of employees by department: " + count);

        // Increase salary by 10% for all employees in "Sales"
        List<Employee> salaryIncrease = employees.stream().map(emp -> {
            if (emp.getDepartment().equals("Sales")) {
                emp.setSalary(emp.getSalary() + (emp.getSalary() * 0.1));
            }
            return emp;
        }).toList();
        System.out.println("\nEmployees after salary increase: " + salaryIncrease);

        // Find the youngest employee in "IT"
        Optional<Employee> emp = employees.stream().filter(employee -> employee.getDepartment().equals("IT"))
                .min(Comparator.comparing(Employee::getAge));
        System.out.println("\n" + emp.get());

        // List departments where at least one employee earns more than ₹75,000
        List<String> dist = employees.stream().filter(em -> em.getSalary() > 75000).map(Employee::getDepartment).distinct().toList();
        System.out.println("\nDepartment with at least one employee with more than 75000 salary: " + dist);

        // Sort employees by department (ascending), and within each department, by salary (descending).
        List<Employee> sortedByDepAndSal = employees.stream()
                .sorted(Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Comparator.comparing(Employee::getSalary).reversed()))
                .toList();
        System.out.println("\nEmployees sorted based on department and then salary: ");
        sortedByDepAndSal.forEach(System.out::println);
        sortedByDepAndSal.add(new Employee());

        /*=========================================================================================================================================================================*/

//        List<Product> products = Arrays.asList(
//                new Product("Laptop", 55000, "Electronics", 4),
//                new Product("Smartphone", 22000, "Electronics", 5),
//                new Product("Headphones", 1500, "Accessories", 3),
//                new Product("T-shirt", 700, "Clothing", 4),
//                new Product("Jeans", 1800, "Clothing", 5),
//                new Product("Air Conditioner", 33000, "Home Appliance", 4),
//                new Product("Refrigerator", 28000, "Home Appliance", 4),
//                new Product("Shoes", 2200, "Clothing", 3),
//                new Product("Book - Java", 450, "Books", 5),
//                new Product("Book - Python", 500, "Books", 4),
//                new Product("TV", 40000, "Electronics", 4),
//                new Product("Blender", 2500, "Kitchen", 3),
//                new Product("Smartwatch", 3500, "Accessories", 4),
//                new Product("Microwave", 9000, "Kitchen", 4),
//                new Product("Charger", 600, "Accessories", 2)
//        );
//
//        // Get all products priced under ₹1000
//        List<Product> under1000 = products.stream().filter(product -> product.getPrice() < 1000).toList();
//        System.out.println("\nProducts under 1000: " + under1000);
//
//        // Find the average rating of products in the "Electronics" category
//        double avg = products.stream().filter(p -> p.getCategory().equals("Electronics"))
//                .mapToDouble(Product::getRating).average().getAsDouble();
//        System.out.println("\nAverage rating in Electronics: " + avg);
//
//        // Sort products by rating (descending) and then by price (ascending)
//        List<Product> sortedByRating = products.stream().sorted(Comparator.comparing(Product::getRating).reversed()).toList();
//        System.out.println("\nSorted by rating descending ->");
//        sortedByRating.forEach(System.out::println);
//        List<Product> sortedByPrice = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();
//        System.out.println("\nSorted by price ascending ->");
//        sortedByPrice.forEach(System.out::println);
//
//        // Get names of the top 3 most expensive products
//        List<String> top3Products = products.stream()
//                .sorted(Comparator.comparing(Product::getPrice).reversed())
//                .limit(3)
//                .map(Product::getName)
//                .toList();
//        System.out.println("\nTop 3 product names: ");
//        top3Products.forEach(System.out::println);
//
//        // Count the number of products per category
//        Map<String, Long> productsPerCategory = products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
//        System.out.println("\nProduct per category -> " + productsPerCategory);
//
//        // Get a list of distinct categories available
//        List<String> categories = products.stream().map(Product::getCategory).distinct().toList();
//        System.out.println("\nDistinct categories: " + categories);
//
//        // Create a Map<String, Double> of product name to price
//        Map<String, Double> nameToPrice = products.stream().collect(Collectors.toMap(Product::getName, Product::getPrice));
//        System.out.println("\nProduct name to price map: " + nameToPrice);
//
//        // Group products by category and list product names in each
//        Map<String, List<String>> catAndList = products.stream()
//                .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getName, Collectors.toList())));
//        System.out.println("\nCategory to list map: " + catAndList);
//
//        // List all product names with price greater than the average price
//        double avgPrice = products.stream().mapToDouble(Product::getPrice).average().orElse(0.0);
//        List<String> namesWithMoreThanAvgPrice = products.stream().filter(p -> p.getPrice() > avgPrice).map(Product::getName).toList();
//        System.out.println("\nItems with price higher than average price: " + namesWithMoreThanAvgPrice);
//
//        // Partition products into expensive (≥₹10,000) and affordable (<₹10,000)
//        Map<Boolean, List<Product>> partition = products.stream().collect(Collectors.partitioningBy(p -> p.getPrice() >= 10000));
//        System.out.println("\nPartitioned products: " + partition);
//
//        // Get the total price of all products in the "Kitchen" category
//        double sumOfPrices = products.stream().filter(p -> p.getCategory().equals("Kitchen")).mapToDouble(Product::getPrice).sum();
//        System.out.println("\nSum of all items from kitchen category: " + sumOfPrices);

    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Employee {
    String name;
    int age;
    double salary;
    String department;
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Product {
    String name;
    double price;
    String category;
    int rating;
}