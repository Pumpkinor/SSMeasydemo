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

@Controller
@RequestMapping("")
public class StudentsController {

    @Autowired
    StudentsServices studentsServices;

    @RequestMapping("listStudents")
    public ModelAndView listStudents(){
        ModelAndView studentMAV =new ModelAndView();
        List<Student> sList = studentsServices.list();
        studentMAV.addObject("stu",sList);
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
