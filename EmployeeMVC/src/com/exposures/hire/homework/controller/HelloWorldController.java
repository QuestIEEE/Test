package com.exposures.hire.homework.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exposures.hire.homework.bean.Employee;
import com.exposures.hire.homework.service.EmployeeService;

@Controller
@RequestMapping("/")
public class HelloWorldController {
	@Autowired
	EmployeeService service;
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }
 
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public ModelAndView sayHelloAgain(ModelMap model) {
    	List<Employee> list=service.getEmployees();
    	return new ModelAndView("showEmployees","list",list);
    }
    @RequestMapping(value="/del" , method=RequestMethod.GET)
    public ModelAndView delete(HttpServletRequest req) {
    	int id = Integer.parseInt(req.getParameter("id"));
    	if(service.getEmployee(id)!=null) {
    	service.deleteEmployee(id);
    	}
    	List<Employee> list=service.getEmployees();
    	return new ModelAndView("showEmployees","list",list); 
    }
    @RequestMapping(value="/add",method = RequestMethod.GET)
    public String gotoAdd() {
    	return "add";
    }
    @RequestMapping(value="/search",method = RequestMethod.GET)
    public String gotoSearch(HttpServletRequest req,ModelMap modelMap) {
    	if(req.getParameter("id")!=null) {
    		int id=Integer.parseInt(req.getParameter("id"));
    		Employee s=service.getEmployee(id);    	
    		modelMap.addAttribute("Employee",s );
    	}
    	return "search";
    }
    @RequestMapping(value="/update",method = RequestMethod.POST)
    public String gotoUpdete(@ModelAttribute("Employee")Employee Employee,ModelMap map) {
    	map.addAttribute("Employee",Employee);
    	return "update";
    } 
    @RequestMapping(value="addEmployee",method= RequestMethod.POST)
    public ModelAndView addEmployee(@ModelAttribute("Employee")Employee Employee,ModelMap map) {
    	service.addEmployee(Employee);
    	List<Employee>list=service.getEmployees();
    	return new ModelAndView("showEmployees","list",list);
    }
    
    @RequestMapping(value="update1",method= RequestMethod.POST)
    public ModelAndView updateEmployee(@ModelAttribute("Employee")Employee Employee,ModelMap map) {
    	service.updateEmployee(Employee);
    	List<Employee>list=service.getEmployees();
    	return new ModelAndView("showEmployees","list",list);
    }
}
