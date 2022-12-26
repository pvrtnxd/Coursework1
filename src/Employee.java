public class Employee {
    private final Integer id;
    private  String fullName;
    private Integer salary;
    private Integer departmentID;

    private static Integer idCounter = 1;

    public Employee(String fullName, Integer salary, Integer departmentID) {
        this.id = idCounter++;
        this.fullName = fullName;
        this.salary = salary;
        this. departmentID = departmentID;
    }

    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getSalary() {
        return salary;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", salary=" + salary +
                ", departmentID=" + departmentID +
                '}';
    }
}
