public class Coursework {
    public static final  Employee[] employees = {
            new Employee("Иванов Дмитрий Дмитриевич", 10000, 1),
            new Employee("Занин Алексей Иванович", 30000, 2),
            new Employee("Федоров Федор Федорович", 30000, 3),
            new Employee("Лебедев Максим Александрович", 40000, 4),
            new Employee("Некрасов Николай Николаевич", 50000, 5),
            new Employee("Скичко Алексей Александрович", 60000, 1),
            new Employee("Иванов Роман Романович", 70000, 2),
            new Employee("Степанов Степан Степанович", 80000, 3),
            new Employee("Акимов Сергей Петрович", 90000,4),
            new Employee("Ледяйкин Денис Анатольевич", 100000, 5)
    };

    // База
    public static  void printEmployee() {
        for (Employee employee: employees) {
            System.out.println(employee);
        }
    }

    public  static  int calcTotalSalary() {
        int sum = 0;
        for (Employee employee: employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();

        for(Employee employee: employees){
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();

        for(Employee employee: employees){
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public  static  float calcAverageSalary(){
        return calcTotalSalary() / (float) employees.length;
    }

    public  static void  printFullNames() {
        for (Employee employee: employees){
            System.out.println(employee.getFullName());
        }
    }


    // Повышенная сложность
    public  static void increaseSalary (int percent) {
        for (Employee employee: employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    public static  Employee findMinSalaryOfDep (int departmentID) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for ( Employee employee: employees) {
            if (employee.getDepartmentID() != departmentID) {
                continue;
            }

            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return  result;
    }

    public static  Employee findMaxSalaryOfDep (int departmentID) {
        int maxSalary = Integer.MIN_VALUE;
        Employee result = null;
        for ( Employee employee: employees) {
            if (employee.getDepartmentID() != departmentID) {
                continue;
            }

            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return  result;
    }

    public static int calcTotalSalaryOfDep (int departmentID) {

        int memCount = 0;
        int sum = 0;
        for (Employee employee: employees) {
            if (employee.getDepartmentID() == departmentID) {
                sum += employee.getSalary();
                memCount++;
            }
        }
        return sum /  memCount;
    }

    public static void  increaseSalaryOfDep (int departmentID, int percent) {
        for (Employee employee: employees){
            if (employee.getDepartmentID() == departmentID) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f +1)));

            }
        }
    }

    public  static void printDepartment (int departmentID){
        for (Employee employee: employees) {
            if (employee.getDepartmentID() == departmentID){
                System.out.println(employee);
            }
        }
    }

    public  static void printEmployeeWithLessSalary(int salary) {
        for (Employee employee: employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }

    public  static void printEmployeeWithMoreSalary(int salary) {
        for (Employee employee: employees) {
            if (employee.getSalary() > salary) {
                System.out.println(employee);
            }
        }
    }

}
