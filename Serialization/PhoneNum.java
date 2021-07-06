import java.io.Serializable;

class PhoneNum implements Serializable {
    String phoneNum;

    public PhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "Phone Number: " + phoneNum;
    }
}