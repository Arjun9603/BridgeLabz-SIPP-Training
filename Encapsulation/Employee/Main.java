package Encapsulation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fte = new FullTimeEmployee(1001, "Alice", 60000);
        fte.assignDepartment("HR");

        PartTimeEmployee pte = new PartTimeEmployee(1002, "Bob", 300, 20);
        pte.assignDepartment("Support");

        employees.add(fte);
        employees.add(pte);

        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());

            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }

            System.out.println("---------------------------");
        }
    }
}