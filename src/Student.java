public class Student extends Person {
    public static String status;

    public Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        Student.status = status;
    }
}
