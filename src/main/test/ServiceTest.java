import cn.pumpkinor.entity.Student;
import cn.pumpkinor.services.StudentsServices;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class ServiceTest extends BaseJunit4Test {

    @Autowired
    private StudentsServices studentsServices;


    @Test
    public void testList() {
        List<Student> cs=studentsServices.list(1,2);
        System.out.println(cs.getClass());
        for (Student c : cs) {
            System.out.println(c.getId()+" "+c.getName()+" "+c.getGender());
        }
        System.out.println(new PageInfo(cs).getTotal());
    }

}
