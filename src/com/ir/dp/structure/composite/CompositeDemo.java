package com.ir.dp.structure.composite;

import com.ir.dp.structure.composite.core.Employee;

/**
 * @author i-rain
 */
public class CompositeDemo {

    public static void main(String[] args) {
        Employee ceo = new Employee("qwer", "ceo", 5000);
        Employee xiaohong = new Employee("xiaohong", "dagong", 1);

        ceo.add(xiaohong);

        System.out.println(ceo);
        for (Employee employee : ceo.getSubordinates()) {
            System.out.println(employee);
         }
    }
}
