import Entities.Employee;
import Entities.GenericList;

public class Main {
    public static void main(String[] args) {
        // Create a new list of employees
        GenericList<Employee> employeeList = new GenericList<>();

        // Add some employees to the list
        employeeList.add(new Employee("John", "Doe", 1234, 5));
        employeeList.add(new Employee("Jane", "Smith", 5678, 10));
        employeeList.add(new Employee("Bob", "Johnson", 9012, 2));

        // Print out the list of employees
        System.out.println("List of employees:");
        for (Employee e : employeeList.objectList()) {
            System.out.println(e.getName() + " " + e.getSurname() + " (" + e.getLegajo() + ") - " + e.getYearsWorked() + " years");
        }

        // Add an employee to the beginning of the list
        Employee newEmployee = new Employee("Alice", "Brown", 3456, 3);
        employeeList.addToTheBeginning(newEmployee);

        // Print out the updated list of employees
        System.out.println("List of employees with new employee added to beginning:");
        for (Employee e : employeeList.objectList()) {
            System.out.println(e.getName() + " " + e.getSurname() + " (" + e.getLegajo() + ") - " + e.getYearsWorked() + " years");
        }

        // Sort the list by years worked
        employeeList.sortList();
        System.out.println("List sorted by years worked:");
        for (Employee e : employeeList.objectList()) {
            System.out.println(e.getName() + " " + e.getSurname() + " - Years worked: " + e.getYearsWorked());
        }

        // Shuffle the list
        employeeList.shuffleList();

        // Print out the shuffled list of employees
        System.out.println("List of employees shuffled:");
        for (Employee e : employeeList.objectList()) {
            System.out.println(e.getName() + " " + e.getSurname() + " (" + e.getLegajo() + ") - " + e.getYearsWorked() + " years");
        }

        // Add a new employee at a specific index
        Employee newEmployee2 = new Employee("Sam", "Lee", 6789, 7);
        employeeList.addAtSpecificIndex(newEmployee2, 1);

        // Print out the updated list of employees
        System.out.println("List of employees with new employee added at index 1:");
        for (Employee e : employeeList.objectList()) {
            System.out.println(e.getName() + " " + e.getSurname() + " (" + e.getLegajo() + ") - " + e.getYearsWorked() + " years");
        }

        // Get an employee at a specific index
        Employee employeeAtIndex2 = employeeList.objectAtIndex(2);
        System.out.println("Employee at index 2: " + employeeAtIndex2.getName() + " " + employeeAtIndex2.getSurname() + " (" + employeeAtIndex2.getLegajo() + ") - " + employeeAtIndex2.getYearsWorked() + " years");


    }}
