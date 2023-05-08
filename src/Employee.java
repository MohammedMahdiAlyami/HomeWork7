public class Employee {
    private String id;
    private String name;
    private int salary;

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getAnnualSalary() {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }

    @Override
    public String toString() {
        return "{Employee ID: " + this.id + ", Name: " + this.name + ", Salary: " + this.salary+ '}';
    }
}
