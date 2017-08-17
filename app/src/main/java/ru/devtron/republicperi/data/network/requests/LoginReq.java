package ru.devtron.republicperi.data.network.requests;

public class LoginReq {
    String email;
    String password;

    public LoginReq(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
