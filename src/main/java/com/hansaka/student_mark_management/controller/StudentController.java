package com.hansaka.student_mark_management.controller;

import com.hansaka.student_mark_management.DTO.StudentInputDTO;
import com.hansaka.student_mark_management.Util.Constant;
import com.hansaka.student_mark_management.service.LoginService;
import com.hansaka.student_mark_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class StudentController {

    @Autowired
    LoginService loginService;

    @Autowired
    StudentService studentService;

    @GetMapping(Constant.ADD_STUDENT_URL)
    public String getAddStudentPage(Model model, HttpSession httpSession) {
        if (loginService.isUserAuthenticated(httpSession)) {
            return Constant.ADD_STUDENT_VIEW;
        }
        return "redirect:" + Constant.LOGIN_URL;
    }

    @PostMapping(Constant.ADD_STUDENT_URL)
    public String addStudent(StudentInputDTO studentInputDTO, Model model, HttpSession httpSession) {
        if (loginService.isUserAuthenticated(httpSession)) {
            studentService.addStudent(studentInputDTO);
            return "redirect:" + Constant.HOME_URL;
        }
        return "redirect:" + Constant.LOGIN_URL;
    }
}
