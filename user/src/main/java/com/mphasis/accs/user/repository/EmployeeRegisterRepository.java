package com.mphasis.accs.user.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.accs.user.model.EmployeeRegister;

@Repository

public interface EmployeeRegisterRepository extends CrudRepository<EmployeeRegister, Long>{

	public EmployeeRegister findByEmpId(long empId);


}
