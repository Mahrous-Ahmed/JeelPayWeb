package Utils;

import Models.UserModel;

public class LoggedInUserInfo {
    public static UserModel userData;

    public static void setUserData(UserModel userData){
        LoggedInUserInfo.userData = userData;
    }
}
