package cn.pumpkinor.services.impl;

import cn.pumpkinor.dao.StudentsMapper;
import cn.pumpkinor.entity.Student;
import cn.pumpkinor.services.StudentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Pumpkinor
 */
@Service
public class StudentsServicesImpl implements StudentsServices {

    @Autowired
    private StudentsMapper studentsMapper;

    @Override
    public List<Student> list(){
        return studentsMapper.list();
    }

    @Override
    public void addStudent(Student student){
        studentsMapper.addStudent(student);
    }

    @Override
    public Student getStudent(int id) {

        return studentsMapper.getStudent(id);
    }

    @Override
    public void deleteStudent(int id) {
        studentsMapper.deleteStudent(id);
    }

    @Override
    public void updateStudent(Student student) {
        studentsMapper.updateStudent(student);
    }
}
