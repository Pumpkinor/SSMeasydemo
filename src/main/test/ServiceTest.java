import cn.pumpkinor.dao.StudentsMapper;
import cn.pumpkinor.entity.Student;
import cn.pumpkinor.services.StudentsServices;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ServiceTest {

    @Autowired
    private StudentsServices studentsServices;


    @Test
    public void testList() {
        //PageHelper.offsetPage(0, 5);
        List<Student> cs=studentsServices.list();
        System.out.println(cs.getClass());
        for (Student c : cs) {
            System.out.println(c.getId()+" "+c.getName()+" "+c.getGender());
        }
        System.out.println(new PageInfo(cs).getTotal());
    }

}
