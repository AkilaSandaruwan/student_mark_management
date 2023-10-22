package com.hansaka.student_mark_management.controller;

import com.hansaka.student_mark_management.Util.Constant;
import com.hansaka.student_mark_management.model.Student;
import com.hansaka.student_mark_management.service.LoginService;
import com.hansaka.student_mark_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    LoginService loginService;

    @Autowired
    StudentService studentService;

    @GetMapping(Constant.HOME_URL)
    public String getHomePage(Model model, HttpSession httpSession) {
        if (loginService.isUserAuthenticated(httpSession)) {
            model.addAttribute("students", studentService.getAllStudents());
            return Constant.HOME_VIEW;
        }
        return "redirect:" + Constant.LOGIN_URL;
    }
}
