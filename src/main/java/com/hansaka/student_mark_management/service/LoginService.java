package com.hansaka.student_mark_management.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class LoginService {
    @Value("${login-username}")
    private String username;

    @Value("${login-password}")
    private String password;

    public boolean isCredentialsMatching(String username, String password) {
        //todo: in a proper design this password should be hashed and compared the hashes. but for the moment i have compared real values. :)
        return this.username.equalsIgnoreCase(username) && this.password.equals(password);
    }

    public boolean isUserAuthenticated(HttpSession httpSession) {
        return httpSession.getAttribute("username") != null;
    }

    public void logout(HttpSession httpSession) {
        httpSession.setAttribute("username", null);
        httpSession.invalidate();
    }
}
