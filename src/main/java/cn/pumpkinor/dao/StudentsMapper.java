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
     * @return Student 返回所有学生的信息
     */
    List<Student> list();

    /**
     * @param student 以需要添加的学生对象作为参数
     */
    void addStudent(Student student);

    /**
     * @param id   以需要查询的学生id作为参数
     * @return Student  返回学生对象
     */
    Student getStudent(int id);

    /**
     * @param id 以需要删除的学生id作为参数
     */
    void deleteStudent(int id);

    /**
     * @param student  以需要修改的学生对象作为参数
     */
    void updateStudent(Student student);

}
