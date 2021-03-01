package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/students")

public class StudentController {
    @GetMapping("/list")
    public String listStudent(ModelMap modelMap){
        modelMap.addAttribute("name","tungle");
        System.out.println("ket noi");
        return "list";
    }
    @GetMapping("")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView("list");
        modelAndView.addObject("name","tunglee");
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
}
