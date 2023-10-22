package com.hansaka.student_mark_management.controller;

import com.hansaka.student_mark_management.DTO.LoginInputDTO;
import com.hansaka.student_mark_management.Util.Constant;
import com.hansaka.student_mark_management.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    LoginService loginService;

    @GetMapping(Constant.LOGOUT_URL)
    public String logout(Model model, HttpSession httpSession) {
        loginService.logout(httpSession);
        return "redirect:" + Constant.LOGIN_URL;
    }

    @GetMapping(Constant.LOGIN_URL)
    public String getLoginPage(Model model, HttpSession httpSession) {
        if (loginService.isUserAuthenticated(httpSession)) {
            return "redirect:" + Constant.HOME_URL;
        }
        return Constant.LOGIN_VIEW;
    }

    @PostMapping(Constant.LOGIN_URL)
    public String loginAction(LoginInputDTO loginInputDTO, Model model, HttpSession httpSession) {

        if (loginService.isCredentialsMatching(loginInputDTO.getUsername(), loginInputDTO.getPassword())) {
            httpSession.setAttribute("username", loginInputDTO.getUsername());
            return "redirect:" + Constant.HOME_URL;
        }
        model.addAttribute("invalidLogin", true);
        return Constant.LOGIN_VIEW;
    }
}
