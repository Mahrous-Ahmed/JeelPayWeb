package Models;

public class UserModel {
    public String username;
    public String password;
    public String OTP;

    public UserModel(String username, String password , String OTP) {
        this.username = username;
        this.password = password;
        this.OTP = OTP;
    }
}
