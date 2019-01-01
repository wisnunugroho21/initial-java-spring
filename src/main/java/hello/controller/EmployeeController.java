package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.model.Employee;
import hello.repository.EmployeeRepository;

@Controller
@RequestMapping(path="/employee")
public class EmployeeController
{
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/index")
    public String index(Model model)
    {
        model.addAttribute("employees", employeeRepository.findAll());
        return "employee_index_bootstrap";
    }

    @GetMapping("/create")
    public String create(Model model)
    {
        model.addAttribute("employee", new Employee());
        return "employee_create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Employee employee)
    {
        employeeRepository.save(employee);
        return "redirect:/employee/index";
    }
}