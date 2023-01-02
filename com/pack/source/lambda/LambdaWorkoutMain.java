package com.pack.source.lambda;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.pack.source.model.Employee;

public class LambdaWorkoutMain {

    public static void main(String[] args) {
        
        Date joiningDate = null;
        List<Employee> employeeList = new ArrayList<>();
        try {
            joiningDate = new SimpleDateFormat("dd/MM/yyyy").parse("01/04/2021");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Employee vishnu = new Employee("A1", 1000000, 40, new Date());
        Employee vibha = new Employee("A2", 1000000, 4, new Date());
        Employee sija = new Employee("A3", 1000000, 35, new Date());
        Employee vivaan = new Employee("A4", 1000000, 07, new Date());
        Employee smelly = new Employee("A5", 1000000, 60, new Date());
        Employee vyasan = new Employee("A6", 1000000, 64, new Date());
        employeeList.add(smelly);
        employeeList.add(vishnu);
        employeeList.add(vibha);
        employeeList.add(vyasan);
        employeeList.add(sija);
        employeeList.add(vivaan);

        employeeList.forEach(employee -> System.out.println(employee));
        
    }
    
}
