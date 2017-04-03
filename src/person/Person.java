package person;

/**
 * Created by Klaus on 3/4/2017.
 */
public class Person {

    private String name;
    private String address;

    protected Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + this.getName() + ",address=" + this.getAddress() + "]";
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected String getName() {
        return name;
    }

    protected String getAddress() {
        return address;
    }
}
