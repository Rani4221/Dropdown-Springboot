package pd.workshop.dropdown.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pd.workshop.dropdown.model.EmployeeForm;
import pd.workshop.dropdown.service.EmployeeService;

import java.util.List;

@Repository
public interface EmployeeRepository extends MongoRepository<EmployeeForm,String> {

    public List<EmployeeForm> findAll();
}
