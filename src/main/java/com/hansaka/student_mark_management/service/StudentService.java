package com.hansaka.student_mark_management.service;

import com.hansaka.student_mark_management.DTO.StudentInputDTO;
import com.hansaka.student_mark_management.model.Student;
import com.hansaka.student_mark_management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(StudentInputDTO studentInputDTO) {
        Student student = new Student();
        student.setSchoolName(studentInputDTO.getSchoolName());
        student.setStudentName(studentInputDTO.getStudentName());
        student.setSubject(studentInputDTO.getSubject());
        student.setGrade(studentInputDTO.getGrade());
        student.setMark(studentInputDTO.getMark());
        student.setTeacherName(studentInputDTO.getTeacherName());
        studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
