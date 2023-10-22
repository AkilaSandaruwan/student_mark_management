package com.hansaka.student_mark_management.model;

import javax.persistence.*;

@Entity
@Table(name = "student_mark")
public class Student {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String schoolName;

    @Column
    private String studentName;

    @Column
    private String subject;

    @Column
    private String grade;

    @Column
    private String mark;

    @Column
    private String teacherName;

    public Student() {
    }

    public Student(Long id, String schoolName, String studentName, String subject, String grade, String mark, String teacherName) {
        this.id = id;
        this.schoolName = schoolName;
        this.studentName = studentName;
        this.subject = subject;
        this.grade = grade;
        this.mark = mark;
        this.teacherName = teacherName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
