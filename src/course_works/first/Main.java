package course_works.first;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Kuf", "Se", "AFg", 753100, 1));
        employeeBook.addEmployee(new Employee("Kud", "Seb", "Ag", 153000, 1));
        employeeBook.addEmployee(new Employee("Ku", "Se", "Ag", 183000, 2));


        employeeBook.printAllEmployees();
        employeeBook.growSalary(10);
        employeeBook.removeEmployee(1);
        employeeBook.printAllEmployees();

        employeeBook.printMinSalaryWithDepartmentID(1);
        employeeBook.printMinSalaryWithDepartmentID(2);
        employeeBook.printMinSalaryWithDepartmentID(3);


        employeeBook.printEmployeesByDepartments();
        System.out.println("============FULL NAME OF ALL EMPLOYEES============");
        employeeBook.printFullNamesAllEmployees();
        employeeBook.printMinSalaryEmployee();



        System.out.printf("Total month salary: %.2f\n", (double)employeeBook.getTotalMonthSalary() / 100);
        System.out.printf("Average month salary: %.2f\n", (double)employeeBook.getAverageSalary() / 100);
    }
}
