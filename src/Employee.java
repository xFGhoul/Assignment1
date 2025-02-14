public class Employee extends Person {
    public String office;
    public double salary;
    public String date_hired;

    public Employee(String name, String address, String phone, String email, String office, double salary, String date_hired) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.date_hired = date_hired;
    }
}
