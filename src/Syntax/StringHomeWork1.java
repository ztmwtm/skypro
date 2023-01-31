package Syntax;

public class StringHomeWork1 {
    private static Employee employee = new Employee();

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }



    private static void task1() {
        System.out.printf("ФИО сотрудника —  %s\n", employee.getFullName());
    }

    private static void task2() {
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s\n", employee.getFullName().toUpperCase());
    }

    private static void task3() {
        Employee employee = new Employee("Иванов", "Семён", "Семёнович");
        System.out.printf("Данные ФИО сотрудника — %s", employee.getFullName().replaceAll("ё", "е" ));
    }

    private static class Employee {
        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        String fullName = String.join(" ", lastName, firstName, middleName);

        public Employee(String lastName, String firstName, String middleName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.fullName = String.join(" ", lastName, firstName, middleName);
        }

        public Employee() {
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    }

}
