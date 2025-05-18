package Models;

public class UserModel {
    public String phoneNumber;
    public String password;
    public String OTP;

    public UserModel(String phoneNumber, String password , String OTP) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.OTP = OTP;
    }
}
