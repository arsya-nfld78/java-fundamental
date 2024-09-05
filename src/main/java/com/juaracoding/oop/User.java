package com.juaracoding.oop;

public class User {

    private String username;
    private String password;
    private String currentPassword;
    private String newPassword;
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    //fungsi change pass
    //currentPass, newPass, confirmPass
    public void changePassword(String currentPassword, String newPassword, String confirmPassword){
        boolean isCurrentPassword = getPassword().equals(getCurrentPassword());
        if (isCurrentPassword){
            if (getNewPassword().equals(getConfirmPassword())){
                System.out.println("Password berhasil diubah");
            } else {
                System.out.println("password baru salah/berbeda");
            }
        } else {
            System.out.println("password lama salah/berbeda");
        }

    }

}
