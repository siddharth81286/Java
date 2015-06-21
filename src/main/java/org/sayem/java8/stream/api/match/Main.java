package org.sayem.java8.stream.api.match;

import org.sayem.java8.stream.api.models.Employee;

import java.util.List;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class Main {

    public static void main(String[] args) {

        List<Employee> persons = Employee.persons();

        // Check if all person are males
        boolean allMales = persons
                .stream()
                .allMatch(Employee::isMale);
        System.out.println("All makes: " + allMales);

        // Check if any person was born in 1971
        boolean anyOneBornIn1971 = persons
                .stream()
                .anyMatch(p -> p.getDob().getYear() == 1971);

        System.out.println(anyOneBornIn1971);

    }
}
