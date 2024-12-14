package com.RahgulKrishnaC.assignment.utilities;
import com.RahgulKrishnaC.assignment.employees.Employee;
import com.RahgulKrishnaC.assignment.employees.Manager;
import com.RahgulKrishnaC.assignment.employees.Developer;


public class AssignmentMain {
	 public static void main(String[] args) {
	        Manager manager = new Manager();
	        manager.setName("Rahgul C");
	        manager.setEmployeeId(101);
	        manager.setSalary(75000);
	        manager.setDepartment("HR");

	        Developer developer = new Developer();
	        developer.setName("Vicky A");
	        developer.setEmployeeId(102);
	        developer.setSalary(65000);
	        developer.setProgrammingLanguage("Java");

	        System.out.println("Manager Details:");
	        EmployeeUtilities.printManagerDetails(manager);

	        System.out.println("\nDeveloper Details:");
	        EmployeeUtilities.printDeveloperDetails(developer);
	    }
	}


