public class Faculty extends Employee {
    public String office_hours;
    public String rank;

    public Faculty(String name, String address, String phone, String email, String office, double salary, String date_hired, String office_hours, String rank) {
        super(name, address, phone, email, office, salary, date_hired);
        this.office_hours = office_hours;
        this.rank = rank;
    }
}
