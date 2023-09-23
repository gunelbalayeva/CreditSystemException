import java.math.BigDecimal;

public class Customer {
    private String name;
    private String surname;
    private BigDecimal salary;

    public Customer(String name, String surname, BigDecimal salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public Customer() {
        this("", "", BigDecimal.ZERO);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
