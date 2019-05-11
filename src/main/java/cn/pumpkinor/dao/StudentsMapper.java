package cn.pumpkinor.dao;

import cn.pumpkinor.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author Pumpkinor
 */
@Repository
//这个注解是将接口的一个实现类(具体这个实现类的name叫什么,还需要再分析源码找找看)
// 交给spring管理(在spring中有开启对@repository注解的扫描),当哪些地方需要用到这个实现类作为依赖时,就可以注入了.
// 当然我们也可以主动给这个实现类命名,在括号中提供名字 默认是类名首字母小写 @Repository(studentsMapper)
public interface StudentsMapper {
    /**
     * @return Student
     */
    List<Student> list();

    /**
     * @param student
     */
    void addStudent(Student student);

    /**
     * @param id
     * @return Student
     */
    Student getStudent(int id);

    /**
     * @param id
     */
    void deleteStudent(int id);

    /**
     * @param student
     */
    void updateStudent(Student student);

}
