package composition.exercise;

/**
 * Created by Klaus on 30/3/2017.
 */
public class Author {

    private String name;
    private String email;
    private Gender gender;

    public Author(String name, String email, Gender gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author[name=" + this.getName() + ",email=" + this.getEmail() + ",gender=" + this.getGender() + "]";
    }
}
