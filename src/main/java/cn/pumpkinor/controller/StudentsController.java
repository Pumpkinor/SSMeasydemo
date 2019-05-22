package cn.pumpkinor.controller;

import cn.pumpkinor.entity.Student;
import cn.pumpkinor.services.StudentsServices;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Pumpkinor
 */
@Controller
@RequestMapping("")
public class StudentsController {
//    Java变量的初始化顺序为：静态变量或静态语句块–>实例变量或初始化语句块–>构造方法–>@Autowired
    //依赖注入有三种方式：
    //
    //变量（filed）注入
    //构造器注入
    //set方法注入
    //所以此处使用变量注入会有警告 推荐使用构造器注入

    private StudentsServices studentsServices;
    @Autowired
    public StudentsController(StudentsServices studentsServices){
        this.studentsServices = studentsServices;
    }



    @RequestMapping("/listStudents")
    public ModelAndView listStudents(@RequestParam(required = false, defaultValue = "1") int page,
                                     @RequestParam(required = false, defaultValue = "8") int rows){
        ModelAndView studentMAV =new ModelAndView();
        List<Student> sList = studentsServices.list(page,rows);
        studentMAV.addObject("pageInfo", new PageInfo<Student>(sList));
        studentMAV.addObject("stu",sList);
        studentMAV.addObject("page",page);
        studentMAV.addObject("rows",rows);
        studentMAV.setViewName("listStudents");
        return studentMAV;
    }

   /* @RequestMapping("addStudent")
    public String addStudent(@ModelAttribute Student student){

        studentsServices.addStudent(student);
        return "redirect:listStudents";
    }*/

    @RequestMapping("addStudent")
    public String addStudent(HttpServletRequest request){

        Student student = new Student();

        String studentName = request.getParameter("name");
        String studentGender = request.getParameter("gender");
        int studentAge = Integer.parseInt(request.getParameter("age"));

        student.setName(studentName);
        student.setAge(studentAge);
        student.setGender(studentGender);
        studentsServices.addStudent(student);
        return "redirect:listStudents";
    }

    @RequestMapping("deleteStudent")
    public String deleteStudent(int id) {
        studentsServices.deleteStudent(id);
        return "redirect:listStudents";
    }

    @RequestMapping("editStudent")
    public ModelAndView editStudent(int id){
        ModelAndView modelAndView = new ModelAndView();
        Student student = studentsServices.getStudent(id);
        modelAndView.addObject("stu",student);
        modelAndView.setViewName("editStudent");
        return modelAndView;
    }

    @RequestMapping("updateStudent")
    public String updateStudent(@ModelAttribute Student student){
        studentsServices.updateStudent(student);
        return "redirect:listStudents";
    }

}
