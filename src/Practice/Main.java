package Practice;

public class Main {
    private static Employee[] employees;

    public static void main(String[] args) {
        employees = new Employee[10];
        employees[0] = new Employee("Петров Петр Петрович", 15000, 1);
        employees[1] = new Employee("Сидоров Семен Семенович", 150000, 5);
        employees[2] = new Employee("Александров Александр Александрович", 44000, 1);
        employees[3] = new Employee("Викторов Виктор Викторович", 18000, 3);
        employees[4] = new Employee("Вишнев Виталий Витальевич", 184000, 5);
        employees[5] = new Employee("Васечкин Василий Васильевич", 102000, 2);
        employees[8] = new Employee("Анатольев Анатолий Анатольевич", 44800, 3);
        employees[9] = new Employee("Черничкин Игорь Игоревич", 8000, 1);
        printEmployees();
        printSeparator();
        System.out.println("Сумма затрат на зарплаты сотрудников: " + sumSalaries());
        printSeparator();
        System.out.println("Сотрудник с минимальной зарплатой за месяц: " + findEmployeeMinSalary());
        printSeparator();
        System.out.println("Сотрудник с максимальной зарплатой за месяц: " + findEmployeeMaxSalary());
        printSeparator();
        System.out.println("Среднее значение зарплат за месяц: " + averageSalary());
        printSeparator();
        printFullName();
    }

    public static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.println(employees[i].toString());
            }
        }
    }
    public static int sumSalaries(){
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                total += employees[i].getSalary();
            }
        }
        return total;
    }

    public static Employee findEmployeeMinSalary(){
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }
    public static Employee findEmployeeMaxSalary(){
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                result = employees[i];
            }
        }
        return result;
    }

    public static int averageSalary() {
        int counterNotNullEnployee = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                counterNotNullEnployee++;
            }
        }
        return sumSalaries() / counterNotNullEnployee;
    }
    public static void printFullName(){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                System.out.print(employees[i].getName() + ", ");
            }
        }
    }

    public static void printSeparator(){
        System.out.println("_______________");
    }
}

