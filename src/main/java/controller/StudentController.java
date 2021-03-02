package controller;

import model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.IServiceStudent;
import service.SericeStudent;

@Controller
@RequestMapping("/students")

public class StudentController {
    @Autowired
    private IServiceStudent serviceStudent;

//    @GetMapping("/list")
//    public String listStudent(ModelMap modelMap){
//        modelMap.addAttribute("name","tungle");
//        System.out.println("ket noi");
//        return "list";
//    }
    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("list");
        modelAndView.addObject("student",serviceStudent.findAll());
        return modelAndView;
    }

    @GetMapping("/detail/{id}")
    public ModelAndView detail(@PathVariable Integer id){
        ModelAndView modelAndView=new ModelAndView("detail");
        modelAndView.addObject("name","ledoantung");
        modelAndView.addObject("age","19");
        modelAndView.addObject("id" ,id);
        return modelAndView;
    }
    @GetMapping("/search")
    public ModelAndView search(@RequestParam String name){
        ModelAndView modelAndView=new ModelAndView("list");
        modelAndView.addObject("search" ,name);
        return modelAndView;
    }
    @RequestMapping(value = "/edit/{id}",method = RequestMethod.GET)
    public String showFormEdit(@PathVariable int id ,ModelMap modelMap){
        Student student=serviceStudent.findById(id);
        modelMap.addAttribute("student",student);
        return "edit";
    }
    @PostMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable int id,@RequestParam String name,int age,String address){
        Student student= new Student(id,name,age,address);
        serviceStudent.save(student,id);
        return new ModelAndView("list","student",serviceStudent.findAll());
    }
}
