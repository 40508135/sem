package com.napier.sem;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AppTest
{
    static App app;

    @BeforeAll
    static void init()
    {
        app = new App();
    }

    @Test
    void printSalariesTestNull()
    {
        app.printSalaries(null);
    }

    @Test
    void printSalariesTestEmpty()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        app.printSalaries(employess);
    }

    @Test
    void printSalariesTestContainsNull()
    {
        ArrayList<Employee> employess = new ArrayList<Employee>();
        employess.add(null);
        app.printSalaries(employess);
    }

    @Test
    void printSalaries()
    {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        Employee emp = new Employee();
        emp.emp_no = 1;
        emp.first_name = "Kevin";
        emp.last_name = "Chalmers";
        emp.title = "Engineer";
        emp.salary = 55000;
        employees.add(emp);
        app.printSalaries(employees);
    }

    @Test
    void DisplayEmployeeTestNull()
    {
        app.displayEmployee(null);
    }

    @Test
    void DisplayEmployeeContainsNull()
    {
        Employee emp1 = new Employee();
        emp1.last_name = null;


    }

    @Test
    void DisplayEmployeeTestEmpty()
    {
        Employee emp1 = new Employee();
        app.displayEmployee(emp1);
    }

    @Test
    void DisplayEmployee()
    {
        Employee emp1 = new Employee();
        emp1.emp_no = 540;
        emp1.first_name = "Dave";
        emp1.last_name = "Chalmers";
        emp1.salary = 20000;
        emp1.title = "Manager";
        emp1.manager = "Dave Davidson";

        app.displayEmployee(emp1);
    }
}