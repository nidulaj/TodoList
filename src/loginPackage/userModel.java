package loginPackage;

import javax.swing.ImageIcon;

public class userModel {
    private static int id;
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String username;
    private static String password;
    private static ImageIcon profilePhoto = new ImageIcon();

    public userModel(int id, String firstName, String lastName, String email, String username, String password, ImageIcon profilePhoto) {
        userModel.id = id;
        userModel.firstName = firstName;
        userModel.lastName = lastName;
        userModel.email = email;
        userModel.username = username;
        userModel.password = password;
        userModel.profilePhoto = profilePhoto;
    }

    // Static Getter Methods
    public static int getId() {
        return id;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getEmail() {
        return email;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }
    
    public static ImageIcon getProfilePhoto() {
        return profilePhoto;
    }

    // Static Setter Methods
    public static void setId(int id) {
        userModel.id = id;
    }

    public static void setFirstName(String firstName) {
        userModel.firstName = firstName;
    }

    public static void setLastName(String lastName) {
        userModel.lastName = lastName;
    }

    public static void setEmail(String email) {
        userModel.email = email;
    }

    public static void setUsername(String username) {
        userModel.username = username;
    }

    public static void setPassword(String password) {
        userModel.password = password;
    }
    
    public static void setProfilePhoto(ImageIcon profilePhoto) {
        userModel.profilePhoto = profilePhoto;
    }
}
