package course_works.first;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Kuf", "Se", "AFg", 753100, 1));
        employeeBook.addEmployee(new Employee("Kud", "Seb", "Ag", 153000, 1));
        employeeBook.addEmployee(new Employee("Ku", "Se", "Ag", 183000, 2));


        employeeBook.printAllEmployees();
        employeeBook.growSalary(10);
        employeeBook.printAllEmployees();

        employeeBook.printMinSalaryWithDepartmentID(1);
        employeeBook.printMinSalaryWithDepartmentID(2);
        employeeBook.printMinSalaryWithDepartmentID(3);

        employeeBook.printMaxSalaryWithDepartmentID(1);
        employeeBook.printMaxSalaryWithDepartmentID(2);
        employeeBook.printMaxSalaryWithDepartmentID(3);

        employeeBook.printEmployeesByDepartments();
        System.out.println("============FULL NAME OF ALL EMPLOYEES============");
        employeeBook.printFullNamesAllEmployees();
        employeeBook.printMinSalaryEmployee();

        employeeBook.printSalaryWithDepartmentID(1);
        employeeBook.printAverageSalaryWithDepartmentID(1);
        employeeBook.printEmployeeWithDepartmentID(1);
        employeeBook.printEmployeeWithSalaryBigger(8284.1);
        employeeBook.printEmployeeWithSalaryBigger(7500);
        employeeBook.printEmployeeWithSalaryLower(8500);
        employeeBook.printEmployeeWithSalaryLower(1684.00);


        System.out.printf("Total month salary: %.2f\n", (double)employeeBook.getTotalMonthSalary() / 100);
        System.out.printf("Average month salary: %.2f\n", (double)employeeBook.getAverageSalary() / 100);
    }
}
