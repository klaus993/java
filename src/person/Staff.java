package person;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Staff extends Person{

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public Staff(Person person, String school, double pay) {
        this(person.getName(), person.getAddress(), school, pay);
    }

    public String toString() {
        return "Staff[" + super.toString() + ",school=" + this.getSchool() + ",pay=" + this.getPay() + "]";
    }

    public String getSchool() {

        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }
}
