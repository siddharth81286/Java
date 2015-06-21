package org.sayem.java8.stream.api.find;

import org.sayem.java8.stream.api.models.Employee;

import java.util.List;
import java.util.Optional;

/**
 * Created by syed.sayem on 6/14/15.
 */
public class Main {

    public static void main(String[] args) {

        List<Employee> persons = Employee.persons();

        // Find any male
        Optional<Employee> anyMale = persons
                .stream()
                .filter(Employee::isMale)
                .findAny();

        if (anyMale.isPresent()) {
            System.out.println("Any male:  " + anyMale.get());
        }else {
            System.out.println("No male found");
        }


        // Find the first male
        Optional<Employee> firstMale = persons
                .stream().filter(Employee::isMale)
                .findFirst();

        if (firstMale.isPresent()){
            System.out.println("First male:  " + anyMale.get());
        }else {
            System.out.println("No male found");
        }
    }
}
