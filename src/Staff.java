public class Staff extends Employee {
    public String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, String date_hired, String title) {
        super(name, address, phone, email, office, salary, date_hired);
        this.title = title;
    }
}
