package in.greatlearning.Employee_Management.Controller;


import in.greatlearning.Employee_Management.Service.EmployeeService;
import in.greatlearning.Employee_Management.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeesController {

    @Autowired
    private EmployeeService employeeService;


    @RequestMapping("/list")
    public String listEmployees(Model theModel){

        List<Employee> employees=employeeService.findAll();
        theModel.addAttribute("Employees",employees);
        return "list-Employees";
    }

    @RequestMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){
        Employee theEmployee=new Employee();
        theModel.addAttribute("Employee",theEmployee);
        return "Employee-Form";
    }

    @RequestMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("employeeId") int theId, Model theModel){
        Employee theEmployee=employeeService.findById(theId);
        theModel.addAttribute("Employee",theEmployee);
        return "Employee-Form";
    }

    @PostMapping("/save")
    public String saveEmployee(@RequestParam("id") int id,@RequestParam("first_name") String firstName,@RequestParam("last_name") String lastName,@RequestParam("email") String email){
        System.out.println(id);
        Employee theEmployee;
        if(id!=0){
            theEmployee=employeeService.findById(id);
            theEmployee.setFirstName(firstName);
            theEmployee.setLastName(lastName);
            theEmployee.setEmail(email);
        }
        else
            theEmployee=new Employee(firstName,lastName,email);
        employeeService.save(theEmployee);
        return "redirect:/employees/list";
    }

    @RequestMapping("/delete")
    public  String deleteEmployee(@RequestParam("employeeId") int theId){
        employeeService.deleteById(theId);
        return "redirect:/employees/list";
    }

    @RequestMapping(value="/403")
    public ModelAndView accessDenied(Principal user){
        ModelAndView model=new ModelAndView();
        if (user!=null) {
            model.addObject("msg", "Hi" + user.getName() + ",You do not have permission to access this page!");
        }else {
            model.addObject("msg","You do not have permission to access this page!");
        }
        model.setViewName("403");
        return model;
    }
}
