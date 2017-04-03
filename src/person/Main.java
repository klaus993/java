package person;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Main {

    public static void main(String[] args) {
        //studentTest();
        staffTest();
    }

    private static void staffTest() {
        Person person = new Person("Klaus", "Correa 4595");
        Staff staff = new Staff(person, "UBA", 2500);
        System.out.println(staff);
    }

    private static void studentTest() {
        Student student = new Student("Klaus Lungwitz", "Correa 4595", "Informática", 3, 1500);
        System.out.println(student);
    }
}
