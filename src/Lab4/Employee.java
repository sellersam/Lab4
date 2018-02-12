package Lab4;

/**
 * Employee.java
 * Date Modified: 02-12-2018
 * @author Alex Sellers
 *
 * Employee is the parent class of Faculty, and it implements Rules. It contains general information which pertains to
 * all UNK employees.
 */
public class Employee implements Rules {

    private String name;
    private double salary;

    /**
     * Primary Employee Constructor
     * Sets name and salary
     *
     * @param name - Employee's name
     * @param salary - Employee's salary
     */
    public Employee(String name, double salary) {

        this.name = name;
        this.salary = salary;
    }

    /**
     * Default Constructor
     * Uses primary constructor to set name and salary to blank and zero
     */
    public Employee() {

        this("", 0);
    }

    /**
     * getName Method
     *
     * @return name - Employee's name
     */
    public String getName() {

        return name;
    }

    /**
     * getSalary Method
     *
     * @return Employee's salary as a formatted dollar amount
     */
    public String getSalary() {

        return String.format("$%,.2f", salary);
    }

    /**
     * toString Method
     *
     * @return Employee's name and salary, formatted
     */
    public String toString() {

        return String.format("Employee Name: %s\nEmployee Salary: %s\n", getName(), getSalary());
    }
}
