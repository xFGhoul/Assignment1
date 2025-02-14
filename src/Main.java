public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.println("Stock Change Percent: " + stock.getChangePercent() + "%");

        Person person = new Person("John", "Castries", "(758) 123-4567", "john@gmail.com");
        System.out.println(person);

        Student student = new Student("Daunte", "Monier", "(758) 123-4567", "daunte@gmail.com", "Sophmore");
        System.out.println(student);

        Employee employee = new Employee("Raysean", "Jackmel", "(758) 123-4567", "raysean@gmail.com", "OTW", 2.00, "23/4/04");
        System.out.println(employee);

        Faculty faculty = new Faculty("Ava", "Oleo", "(758) 123-4567", "ava@gmail.com", "LFT", 50000.00, "12/5/06", "8-4", "Principal");
        System.out.println(faculty);

        Staff staff = new Staff("Kem", "Bonne Terre", "(758) 123-4567", "kem@gmail.com", "BUS", 5.00, "3/7/09", "Teacher");
        System.out.println(staff);

        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", 180);
        System.out.println(book.getDescription());

        Magazine magazine = new Magazine("National Geographic", "National Geopgraphic Society", "2024", 12);
        System.out.println(magazine.getDescription());

        DVD dvd = new DVD("Inception", "Warner Bros", "2010", 148);
        System.out.println(dvd.getDescription());
    }
}