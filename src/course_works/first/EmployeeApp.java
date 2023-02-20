package course_works.first;

import java.util.Random;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();
        System.out.println("============ADD 10 EMPLOYEES============");
        for (int i = 0; i < 10; i++) {
            employeeBook.addEmployee(generateEmployee());
        }
        System.out.println();
        System.out.println("============PRINT ALL EMPLOYEES============");
        employeeBook.printAllEmployees();
        System.out.println("============PRINT SALARY STATS============");
        System.out.printf("Total month salary: %.2f\n", (double) employeeBook.getTotalMonthSalary() / 100);
        employeeBook.printMinSalaryEmployee();
        employeeBook.printMaxSalaryEmployee();
        System.out.printf("Average month salary: %.2f\n", (double) employeeBook.getAverageSalary() / 100);
        System.out.println();
        System.out.println("============PRINT ALL NAMES OF EMPLOYEES============");
        employeeBook.printFullNamesAllEmployees();
        System.out.println();
        System.out.println("============ADD 11% TO ALL SALARY============");
        employeeBook.growSalary(11);
        System.out.printf("Total month salary: %.2f\n", (double) employeeBook.getTotalMonthSalary() / 100);
        employeeBook.printMinSalaryWithDepartmentID(1);
        employeeBook.printMaxSalaryWithDepartmentID(2);
        employeeBook.printSalaryWithDepartmentID(3);
        employeeBook.printAverageSalaryWithDepartmentID(4);
        employeeBook.printEmployeeWithDepartmentID(5);
        System.out.println();
        System.out.println("============ADD 15% TO SALARY WITH DEPARTMENT ID 5============");
        employeeBook.growSalaryWithDepartmentID(5, 15);
        employeeBook.printEmployeeWithDepartmentID(5);
        employeeBook.printEmployeeWithSalaryLower(75000.00);
        employeeBook.printEmployeeWithSalaryBigger(25000.00);
        System.out.println();
        System.out.println("============REMOVE EMPLOYEES WITH ID 2 AND 5============");
        employeeBook.removeEmployee(2);
        employeeBook.removeEmployee(5);
        employeeBook.printAllEmployees();
        System.out.println();
        System.out.println("============ADD TWO NEW EMPLOYEES============");
        employeeBook.addEmployee(generateEmployee());
        employeeBook.addEmployee(generateEmployee());
        employeeBook.printAllEmployees();
        System.out.println("============EDIT EMPLOYEE WITH ID 1============");
        employeeBook.editEmployee(1, 120000.00, 5);
        employeeBook.printAllEmployees();
        System.out.println();
        System.out.println("============PRINT ALL EMPLOYEES BY DEPARTMENT ID============");
        employeeBook.printEmployeesByDepartments();
    }

    private static Employee generateEmployee() {
        String[] secondName = {"IVANOV", "PETROV", "SIDOROV", "SERGEEV", "KROTOV", "BINGO", "BONGO"};
        String[] name = {"IVAN", "PETR", "SIDOR", "SERGEY", "KROT", "BING", "BONG"};
        String[] middleName = {"IVANOVICH", "PETROVICH", "SIDOROVICH", "SERGEIVICH", "KROTOVICH", "BINGOVICH", "BONGOVICH"};
        Random random = new Random();
        return new Employee(secondName[random.nextInt(secondName.length)],
                name[random.nextInt(name.length)],
                middleName[random.nextInt(middleName.length)],
                random.nextLong(10_000_00L, 1_000_000_00L),
                random.nextInt(1, 6));
    }
}
