package com.hansaka.student_mark_management.DTO;

import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
public class StudentInputDTO {

    private String schoolName;

    private String studentName;

    private String subject;

    private String grade;

    private String mark;

    private String teacherName;

    public StudentInputDTO() {
    }

    public StudentInputDTO(String schoolName, String studentName, String subject, String grade, String mark, String teacherName) {
        this.schoolName = schoolName;
        this.studentName = studentName;
        this.subject = subject;
        this.grade = grade;
        this.mark = mark;
        this.teacherName = teacherName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
