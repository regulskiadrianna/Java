import java.io.Serializable;

class Email implements Serializable {
    String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email Address:  " + email;
    }
}