package course_works.first;

import java.util.*;

public class EmployeeBook {

    private static Map<List<String>, Employee> employees = new HashMap<>();
    private static Map<Long, Employee> employeesId = new HashMap<>();

    public void printAllEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    public void printFullNamesAllEmployees() {
        for (Employee employee : employees.values()) {
            System.out.printf("%s %s %s\n", employee.getSecondName(), employee.getName(), employee.getMiddleName());
        }
    }

    public long getTotalMonthSalary() {
        return employees.values().stream().filter(Objects::nonNull).map(Employee::getSalary).mapToLong(Long::longValue).sum();
    }

    public void printMinSalaryEmployee() {
        Optional<Employee> employee = employees.values().stream().filter(Objects::nonNull).reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Minimum salary : " + value).orElse("not found"));
    }

    public void printMaxSalaryEmployee() {
        Optional<Employee> employee = employees.values().stream().filter(Objects::nonNull).reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Maximum salary : " + value).orElse("not found"));
    }

    public long getAverageSalary() {
        long count = employees.values().stream().filter(Objects::nonNull).count();
        return count == 0 ? 0 : getTotalMonthSalary() / count;
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getFullName(), employee);
        employeesId.put(employee.getId(), employee);
    }

    public void removeEmployee(long id) {
        Employee employee = employeesId.get(id);
        if (employee == null) {
            System.out.printf("Employee with ID %d, not found.\n", id);
        } else {
            employees.remove(employee.getFullName());
            employeesId.remove(employee.getId());
        }
    }

    public void removeEmployee(String secondName, String name, String middleName) {
        Employee employee = employees.get(List.of(secondName, name, middleName));
        if (employee == null) {
            System.out.printf("Employee with fullname %s %s %s, not found.\n", secondName, name, middleName);
        } else {
            employees.remove(employee.getFullName());
            employeesId.remove(employee.getId());
            System.out.printf("Employee with fullname %s %s %s, removed.\n", name, middleName, secondName);
        }
    }

    public void printEmployeesByDepartments() {
        HashMap<Integer, List<Employee>> departments = new HashMap<>();
        for (Employee value : employees.values()) {
            List<Employee> currentList = departments.get(value.getDepartmentID());
            if (currentList == null) {
                currentList = new ArrayList<>();
                currentList.add(value);
                departments.put(value.getDepartmentID(), currentList);
            } else {
                departments.get(value.getDepartmentID()).add(value);
            }
        }

        for (Map.Entry<Integer, List<Employee>> entry : departments.entrySet()) {
            System.out.printf("Department id : %d, employees:\n", entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.printf("%s %s %s\n", employee.getSecondName(), employee.getName(), employee.getMiddleName());
            }
        }
    }

    public void growSalary(int percent) {
        double multiplier = 1 + (double) percent / 100;
        for (Employee employee : employees.values()) {
            employee.setSalary((long) (employee.getSalary() * multiplier));
        }
    }

    public void printMinSalaryWithDepartmentID(int id) {
        Optional<Employee> employee = employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Minimum salary in department with id " + id + ": \n" + value)
                .orElseGet(() -> "Not found employees with department id " + id));
    }

    public void printMaxSalaryWithDepartmentID(int id) {
        Optional<Employee> employee = employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Maximum salary in department with id " + id + ": \n" + value)
                .orElseGet(() -> "Not found employees with department id " + id));
    }

    public void printSalaryWithDepartmentID(int id) {
        System.out.printf("Salary in department with id %d: %.2f\n", id, (double) employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .map(Employee::getSalary)
                .mapToLong(Long::longValue)
                .sum() / 100);
    }

    public void printAverageSalaryWithDepartmentID(int id) {
        int count = (int) employees.values().stream().filter(Objects::nonNull).filter(e -> e.getDepartmentID() == id).count();
        System.out.printf("Average salary in department with id %d: %.2f\n", id, (double) employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .map(Employee::getSalary)
                .mapToLong(Long::longValue)
                .sum() / count / 100);
    }

    public void growSalaryWithDepartmentID(int id, int percent) {
        double multiplier = 1 + (double) percent / 100;
        employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .forEach(e -> e.setSalary((long) (e.getSalary() * multiplier)));
    }

    public void printEmployeeWithDepartmentID(int id) {
        System.out.printf("All employees of department with id %d:\n", id);
        employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .forEach(e -> System.out.printf("id = %d, second name = %s, name = %s, middle name = %s, salary = %.2f\n"
                        , e.getId(), e.getSecondName(), e.getName(), e.getMiddleName(), (double) e.getSalary() / 100));
    }

    public void printEmployeeWithSalaryBigger(double salary) {
        System.out.printf("All employees with salary bigger than %.2f :\n", salary);
        employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> (double) e.getSalary() / 100 >= salary)
                .forEach(System.out::println);
    }

    public void printEmployeeWithSalaryBigger(int salary) {
        System.out.printf("All employees with salary bigger than %d :\n", salary);
        employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> (double) e.getSalary() / 100 >= salary)
                .forEach(System.out::println);
    }

    public void printEmployeeWithSalaryLower(double salary) {
        System.out.printf("All employees with salary lower than %.2f :\n", salary);
        employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> (double) e.getSalary() / 100 < salary)
                .forEach(System.out::println);
    }

    public void printEmployeeWithSalaryLower(int salary) {
        System.out.printf("All employees with salary lower than %d :\n", salary);
        employees.values().stream()
                .filter(Objects::nonNull)
                .filter(e -> (double) e.getSalary() / 100 < salary)
                .forEach(System.out::println);
    }

    public void editEmployee(String secondName, String name, String middleName, double newSalary, int newDepartmentID) {
        Employee employee = employees.get(List.of(secondName, name, middleName));
        if (employee == null) {
            System.out.printf("Employee with fullname %s %s %s, not found.\n", secondName, name, middleName);
        } else {
            employee.setSalary((long) (newSalary * 100));
            employee.setDepartmentID(newDepartmentID);
        }
    }

    public void editEmployee(long id, double newSalary, int newDepartmentID) {
        Employee employee = employeesId.get(id);
        if (employee == null) {
            System.out.printf("Employee with id %d , not found.\n", id);
        } else {
            employee.setSalary((long) (newSalary * 100));
            employee.setDepartmentID(newDepartmentID);
        }
    }
}
