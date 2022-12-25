package course_works.first;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee("Kuf", "Se", "AFg", 753000, 1));
        employeeBook.addEmployee(new Employee("Kud", "Seb", "Ag", 153000, 1));


        employeeBook.printAllEmployees();
        employeeBook.printFullNamesAllEmployees();
        employeeBook.getMinSalaryEmployee();



        System.out.printf("Total month salary: %.2f\n", (double)employeeBook.getTotalMonthSalary() / 100);
        System.out.printf("Average month salary: %.2f\n", (double)employeeBook.getAverageSalary() / 100);
    }
}
