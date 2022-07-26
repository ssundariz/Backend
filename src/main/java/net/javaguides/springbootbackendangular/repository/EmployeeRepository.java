package net.javaguides.springbootbackendangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootbackendangular.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
