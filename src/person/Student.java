package person;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public Student(Person person, String program, int year, double fee) {
        this(person.getName(), person.getAddress(), program, year, fee);
    }

    public String toString() {
        return "Student[" + super.toString() + ",program=" + this.getProgram() + ",year=" + this.getYear() + ",fee=" + this.getFee() + "]";
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
