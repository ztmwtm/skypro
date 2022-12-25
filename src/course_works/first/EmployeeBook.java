package course_works.first;

import java.util.*;

public class EmployeeBook {

    private static Employee[] employees = new Employee[10];

    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public void printFullNamesAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.printf("%s %s %s\n", employee.getSecondName(), employee.getName(), employee.getMiddleName());
            }
        }
    }

    public long getTotalMonthSalary() {
        return Arrays.stream(employees).filter(Objects::nonNull).map(Employee::getSalary).mapToLong(Long::longValue).sum();
    }

    public void printMinSalaryEmployee() {
        Optional<Employee> employee = Arrays.stream(employees).filter(Objects::nonNull).reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Minimum salary : " + value).orElse("not found"));
    }

    public void printMaxSalaryEmployee() {
        Optional<Employee> employee = Arrays.stream(employees).filter(Objects::nonNull).reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Maximum salary : " + value).orElse("not found"));
    }

    public long getAverageSalary() {
        long count = Arrays.stream(employees).filter(Objects::nonNull).count();
        return count == 0 ? 0 : getTotalMonthSalary() / count;
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
        System.out.println("EmployeeBook is full, remove someone to add new.");
    }

    public void removeEmployee(long id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                return;
            }
        }
        System.out.printf("Employee with ID %d, not found.\n", id);
    }

    public void removeEmployee(String secondName, String name, String middleName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && compareFullName(employees[i], secondName, name, middleName)) {
                employees[i] = null;
                return;
            }
        }
        System.out.printf("Employee with fullname %s %s %s, not found.\n", name, middleName, secondName);
    }

    public void printEmployeesByDepartments() {
        HashMap<Integer, List<Employee>> departments = new HashMap<>();
        for (Employee value : employees) {
            if (value == null) {
                continue;
            }
            List<Employee> currentList = departments.get(value.getDepartmentID());
            if (currentList == null) {
                currentList = new ArrayList<>();
                currentList.add(value);
                departments.put(value.getDepartmentID(), currentList);
            } else {
                departments.get(value.getDepartmentID()).add(value);
            }
        }

        for (Map.Entry<Integer, List<Employee>> entry: departments.entrySet()) {
            System.out.printf("Department id : %d, employees:\n", entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.printf("%s %s %s\n", employee.getSecondName(), employee.getName(), employee.getMiddleName());
            }
        }
    }

    public void growSalary(int percent) {
        double multiplier = 1 + (double) percent / 100;
        for (Employee employee: employees) {
            if (employee != null) {
                employee.setSalary((long) (employee.getSalary() * multiplier));
            }
        }
    }

    public void printMinSalaryWithDepartmentID(int id) {
        Optional<Employee> employee = Arrays.stream(employees)
                                .filter(Objects::nonNull)
                                .filter(e -> e.getDepartmentID() == id)
                                .reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Minimum salary in department with id " + id + ": \n" + value)
                                    .orElseGet(() -> "Not found employees with department id " + id));
    }

    public void printMaxSalaryWithDepartmentID(int id) {
        Optional<Employee> employee = Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .reduce((e1, e2) -> e1.getSalary() > e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Maximum salary in department with id " + id + ": \n" + value)
                                    .orElseGet(() -> "Not found employees with department id " + id));
    }

    public void printSalaryWithDepartmentID(int id) {
        System.out.printf("Salary in department with id %d: %.2f\n", id, (double) Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .map(Employee::getSalary)
                .mapToLong(Long::longValue)
                .sum() / 100);
    }

    public void printAverageSalaryWithDepartmentID(int id) {
        int count = (int) Arrays.stream(employees).filter(Objects::nonNull).filter(e -> e.getDepartmentID() == id).count();
        System.out.printf("Average salary in department with id %d: %.2f\n", id, (double) Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .map(Employee::getSalary)
                .mapToLong(Long::longValue)
                .sum() / count / 100);
    }

    public void growSalaryWithDepartmentID(int id, int percent) {
        double multiplier = 1 + (double) percent / 100;
        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .forEach(e -> e.setSalary((long) (e.getSalary() * multiplier)));
    }

    public void printEmployeeWithDepartmentID(int id) {
        System.out.printf("All employees of department with id %d:\n", id);
        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> e.getDepartmentID() == id)
                .forEach(e -> System.out.printf("id = %d, second name = %s, name = %s, middle name = %s, salary = %.2f\n"
                        , e.getId(), e.getSecondName(),e.getName(),e.getMiddleName(), (double) e.getSalary() / 100 ));
    }

    public void printEmployeeWithSalaryBigger(double salary) {
        System.out.printf("All employees with salary bigger than %.2f :\n", salary);
        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> (double)e.getSalary() / 100 >= salary)
                .forEach(System.out::println);
    }

    public void printEmployeeWithSalaryBigger(int salary) {
        System.out.printf("All employees with salary bigger than %d :\n", salary);
        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> (double)e.getSalary() / 100 >= salary)
                .forEach(System.out::println);
    }

    public void printEmployeeWithSalaryLower(double salary) {
        System.out.printf("All employees with salary lower than %.2f :\n", salary);
        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> (double)e.getSalary() / 100 < salary)
                .forEach(System.out::println);
    }

    public void printEmployeeWithSalaryLower(int salary) {
        System.out.printf("All employees with salary lower than %d :\n", salary);
        Arrays.stream(employees)
                .filter(Objects::nonNull)
                .filter(e -> (double)e.getSalary() / 100 < salary)
                .forEach(System.out::println);
    }

    public void editEmployee(String secondName, String name, String middleName, double newSalary, int newDepartmentID) {
        for (Employee employee : employees) {
            if (employee != null && compareFullName(employee, secondName, name, middleName)) {
                employee.setSalary((long) (newSalary * 100));
                employee.setDepartmentID(newDepartmentID);
            }
        }
    }

    public void editEmployee(long id, double newSalary, int newDepartmentID) {
        for (Employee employee : employees) {
            if (employee != null && employee.getId() == id) {
                employee.setSalary((long) (newSalary * 100));
                employee.setDepartmentID(newDepartmentID);
            }
        }
    }


    private boolean compareFullName(Employee employee, String secondName, String name, String middleName) {
        return employee.getName().equals(name)
                && employee.getMiddleName().equals(middleName)
                && employee.getSecondName().equals(secondName);
    }


}
