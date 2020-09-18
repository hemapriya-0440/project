package com.mphasis.accs.user.service;

import java.util.List;
import java.util.Optional;

import com.mphasis.accs.user.model.Employee;
import com.mphasis.accs.user.model.EmployeeRegister;

public interface EmployeeService  {
	//public Boolean saveemploee(Employee data) ;
    public boolean saveEmployeeDetails(EmployeeRegister data);
    public List<EmployeeRegister> getAllEmp();
public EmployeeRegister findByempid(Long id);
public void deleteEmployeeById(Long id);
//public EmployeeRegister updateById(Long id);
public EmployeeRegister upDateEmployeeById(EmployeeRegister regg);
}
