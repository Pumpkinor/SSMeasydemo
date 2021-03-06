package cn.pumpkinor.services.impl;

import cn.pumpkinor.dao.StudentsMapper;
import cn.pumpkinor.entity.Student;
import cn.pumpkinor.services.StudentsServices;
import com.github.pagehelper.PageHelper;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Pumpkinor
 */
@Service
public class StudentsServicesImpl implements StudentsServices {
    private StudentsMapper studentsMapper;
    @Autowired
    public StudentsServicesImpl(StudentsMapper studentsMapper){
        this.studentsMapper = studentsMapper;
    }

    @Override
    public List<Student> list(int page,int rows){
        PageHelper.startPage(page, rows);
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
