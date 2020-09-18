package com.mphasis.accs.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.accs.user.model.Employee;
@Repository
public interface  EmployeeRepository extends CrudRepository<Employee, Long>{

}
