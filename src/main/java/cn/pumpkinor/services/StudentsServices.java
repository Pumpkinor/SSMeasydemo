package cn.pumpkinor.services;

import cn.pumpkinor.entity.Student;

import java.util.List;

/**
 * @author Pumpkinor
 */
public interface StudentsServices {
    List<Student> list();
    void addStudent(Student student);
    Student getStudent(int id);
    void deleteStudent(int id);
    void updateStudent(Student student);
}
