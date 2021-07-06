import java.io.Serializable;

class DOB implements Serializable {
    String dob;

    public DOB(String dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Birth Date: " + dob;
    }
}