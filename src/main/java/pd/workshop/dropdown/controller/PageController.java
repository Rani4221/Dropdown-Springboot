package pd.workshop.dropdown.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pd.workshop.dropdown.model.EmployeeForm;
import pd.workshop.dropdown.repository.EmployeeRepository;
import pd.workshop.dropdown.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {
    @Autowired
    private final EmployeeService employeeService;

    public PageController(EmployeeService employeeService ) {
        this.employeeService = employeeService;
    }

    //request mapping method to get employee form
    @GetMapping("/employee")
    public String getEmployeeForm(Model model) {
        List<EmployeeForm> employeeFormList= employeeService.getEmployeeForm();
        model.addAttribute("employeeFormList", employeeFormList);  // Add employeeForm to the model
//        model.addAttribute("employeeForm", new EmployeeForm());
        return "employee-form";
    }



    //request mapping method for submit employee form
    @PostMapping(path = "/employee")
    public String submitEmployeeForm(@ModelAttribute("employeeForm") EmployeeForm employeeForm,
                                     Model model){
        employeeForm.setDesignation(employeeForm.getDesignation());
        employeeService.save(employeeForm);
        //place employee form data in model
        model.addAttribute("data", employeeForm.toString());
        return "success";
    }
}
