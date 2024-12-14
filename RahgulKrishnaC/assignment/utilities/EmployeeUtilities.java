package com.RahgulKrishnaC.assignment.utilities;
import com.RahgulKrishnaC.assignment.employees.Employee;
import com.RahgulKrishnaC.assignment.employees.Manager;
import com.RahgulKrishnaC.assignment.employees.Developer;

public class EmployeeUtilities {
	public static void printEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    public static void printManagerDetails(Manager manager) {
        printEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());
    }

    public static void printDeveloperDetails(Developer developer) {
        printEmployeeDetails(developer);
        System.out.println("Programming Language: " + developer.getProgrammingLanguage());
    }
}

