package com.codegym.controller;


import com.codegym.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("employee/")
public class EmployeeController {

    @RequestMapping(value = "showForm", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String showForm(Model model){
        model.addAttribute("employee", new Employee());
        return "employee/create";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee") Employee employee, ModelMap model) {
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "employee/info";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String submit(Model model, Employee employee){
        model.addAttribute("id", employee.getId());
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        return "employee/info";
    }
}
