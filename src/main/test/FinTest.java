import cn.pumpkinor.dao.StudentsMapper;
import cn.pumpkinor.entity.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;




public class FinTest extends BaseJunit4Test {

    @Autowired
    private StudentsMapper studentsMapper;


    @Test
    public void listTest() {
        //PageHelper.offsetPage(0, 5);
        List<Student> cs=studentsMapper.list();
            System.out.println(cs.getClass());
            for (Student c : cs) {
                System.out.println(c.getId()+" "+c.getName()+" "+c.getGender()+" "+c.getAge());
            }
            System.out.println(new PageInfo(cs).getTotal());
    }

    @Test
    public void updateStudentTest() {
        Student student = new Student();
        student.setId(10);
        student.setName("小彩虹");
        student.setAge(99);
        student.setGender("女");
        studentsMapper.updateStudent(student);
    }

    @Test
    public void findStudentByNameAndGenderUseIfTest(){
        List<Student> findListIf = studentsMapper.findStudentByNameAndGenderUseIf(null,"女");
        for (Student c : findListIf) {
            System.out.println(c.getId()+" "+c.getName()+" "+c.getGender()+" "+c.getAge());
        }
        System.out.println(new PageInfo(findListIf).getTotal());
    }
    @Test
    public void findStudentByNameAndGenderUseChooseTest(){
        List<Student> findListChoose = studentsMapper.findStudentByNameAndGenderUseChoose(null,null);
        for (Student c : findListChoose) {
            System.out.println(c.getId()+" "+c.getName()+" "+c.getGender()+" "+c.getAge());
        }
        System.out.println(new PageInfo(findListChoose).getTotal());
    }
}


