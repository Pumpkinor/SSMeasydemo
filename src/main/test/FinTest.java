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
    public void testList() {
        //PageHelper.offsetPage(0, 5);
        List<Student> cs=studentsMapper.list();
            System.out.println(cs.getClass());
            for (Student c : cs) {
                System.out.println(c.getId()+" "+c.getName()+" "+c.getGender()+" "+c.getAge());
            }
            System.out.println(new PageInfo(cs).getTotal());
    }

    @Test
    public void updateStudent() {
        Student student = new Student();
        student.setId(10);
        student.setName("小彩虹");
        student.setAge(99);
        student.setGender("女");
        studentsMapper.updateStudent(student);
    }

}


