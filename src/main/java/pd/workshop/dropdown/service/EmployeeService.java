package pd.workshop.dropdown.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pd.workshop.dropdown.model.EmployeeForm;
import pd.workshop.dropdown.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(EmployeeForm employeeForm) {
        employeeRepository.save(employeeForm);

    }

    public Object findAll() {
        return employeeRepository.findAll();
    }

    public List<EmployeeForm> getEmployeeForm() {
        List<EmployeeForm> emp=new ArrayList<>();
        employeeRepository.save(new EmployeeForm("BBA"));
        employeeRepository.save(new EmployeeForm("BBa"));
        employeeRepository.save(new EmployeeForm("BBA"));
        List<EmployeeForm> employeeFormList = employeeRepository.findAll();
        System.out.printf(employeeFormList.get(1).getDesignation());
        return employeeFormList;
    }
}
