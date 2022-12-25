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

    public void getMinSalaryEmployee() {
        Optional<Employee> employee = Arrays.stream(employees).filter(Objects::nonNull).reduce((e1, e2) -> e1.getSalary() < e2.getSalary() ? e1 : e2);
        System.out.println(employee.map(value -> "Minimum salary : " + value).orElse("not found"));
    }

    public void getMaxSalaryEmployee() {
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
            if (compareFullName(employees[i], secondName, name, middleName)) {
                employees[i] = null;
                return;
            }
        }
        System.out.printf("Employee with fullname %s %s %s, not found.\n", name, middleName, secondName);
    }

    public void printEmployeesByDepartments() {
        HashMap<Integer, List<Employee>> departments = new HashMap<>();
        for (Employee value : employees) {
            List<Employee> currentList = departments.get(value.getIdDepartment());
            if (currentList == null) {
                currentList = new ArrayList<>();
                currentList.add(value);
                departments.put(value.getIdDepartment(), currentList);
            } else {
                departments.get(value.getIdDepartment()).add(value);
            }
        }

        for (Map.Entry<Integer, List<Employee>> entry: departments.entrySet()) {
            System.out.printf("Department id : %d, employees:\n", entry.getKey());
            for (Employee employee : entry.getValue()) {
                System.out.printf("%s %s %s\n", employee.getSecondName(), employee.getName(), employee.getMiddleName());
            }
        }
    }

    private boolean compareFullName(Employee employee, String secondName, String name, String middleName) {
        return employee.getName().equals(name)
                && employee.getMiddleName().equals(middleName)
                && employee.getSecondName().equals(secondName);
    }


}
