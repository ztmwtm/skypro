package course_works.first;

import java.util.List;

public class Employee {

    private static long count = 0;
    private long id;
    private String name;
    private String secondName;
    private String middleName;
    private long salary;
    private int departmentID;

    private List<String> fullName;

    public Employee(String secondName, String name, String middleName, long salary, int idDepartment) {
        this.name = name;
        this.secondName = secondName;
        this.middleName = middleName;
        this.salary = salary;
        this.departmentID = idDepartment;
        this.id = setId();
        this.fullName = List.of(secondName, name, middleName);
    }

    private long setId() {
        count++;
        return count;
    }

    public List<String> getFullName() {
        return fullName;
    }

    public static long getCount() {
        return count;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    @Override
    public String toString() {
        return String.format("Employee: |id%5d|%20s|%20s|%20s|  Salary |%10.2f|  DepartmentID |%3d|",
                id, secondName, name, middleName, (double) salary / 100, departmentID);
    }
}
