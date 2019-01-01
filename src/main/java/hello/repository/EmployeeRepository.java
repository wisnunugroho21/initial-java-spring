package hello.repository;

import org.springframework.data.repository.CrudRepository;
import hello.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{

}