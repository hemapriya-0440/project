package com.mphasis.accs.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.mphasis.accs.user.model.EmployeeRegister;
import com.mphasis.accs.user.repository.EmployeeRegisterRepository;
import com.mphasis.accs.user.repository.EmployeeRepository;

@Service
@Validated
public class SeviceImpl implements EmployeeService {
@Autowired
private EmployeeRepository repo;
@Autowired
private EmployeeRegisterRepository regrepo;
//	@Override
//	public Boolean saveemploee(Employee data) {
//		Boolean response = false;
//			Employee emp=new Employee();
//			emp.setEmpid(data.getEmpid());
//			emp.setFirstName(data.getFirstName());
//			emp.setLastName(data.getLastName());
//			emp.setPhoneno(data.getPhoneno());
//			emp.setGender(data.getGender());
//			emp.setId(data.getId());
//			emp.setEmailid(data.getEmailid());
//			
//			if ((data.getEmpid() == null ) && ((data.getEmpid())==(emp.getEmpid())) )
//				Employee empdata=repo.save(emp);
//			{
//				response = false;
//			}
//			else{
//				response = true;
//			}
//		return response;
//	}
	/*
	 * @Override public Boolean saveEmployeeDetails(EmployeeRegister data) { Boolean
	 * response=false; ModelMapper mapper=new ModelMapper(); EmployeeRegister
	 * storedUserDetails = regrepo.save(data); EmployeeRegisterDto returnValue =
	 * mapper.map(storedUserDetails ,EmployeeRegisterDto.class); return response; }
	 */

	@Override
	@Transactional
	public boolean saveEmployeeDetails(EmployeeRegister data) {
		Boolean response = false;
		EmployeeRegister employeeRegister=regrepo.save(data);
		//!((employeeRegister.getEmpId()==data.getEmpId())))

		if ((data != null )) { //&& data.getEmpId()!=2354913) {
			response = true;
		}else{
			response = false;
		}
	return response;
}
	@Override
	public List<EmployeeRegister> getAllEmp() {
List<EmployeeRegister> employeeRegisters=(List<EmployeeRegister>) regrepo.findAll();
return employeeRegisters;	
	}
	@Override
	public EmployeeRegister findByempid(Long id) {
EmployeeRegister employeeRegistesr=regrepo.findByEmpId(id);
if(!((employeeRegistesr.getEmpId())==id)) {
	return null;
}
		return employeeRegistesr;
	
}
	@Override
	public void deleteEmployeeById(Long id) {
		if(id==null) {
			return;
		}
regrepo.deleteById(id);

	}

	/*
	 * @Override public EmployeeRegister updateById(Long id) {
	 * 
	 * EmployeeRegister register=new EmployeeRegister(); EmployeeRegister
	 * employeeRegister= regrepo.save(register);
	 * 
	 * return employeeRegister; }
	 */
	@Override
public EmployeeRegister upDateEmployeeById(EmployeeRegister regg) {
	List<EmployeeRegister> emp=new ArrayList<>();
for(int i=0; i<emp.size(); i++)
        {
	EmployeeRegister employeeRegister = emp.get(i);
            if(emp.get(0).getEmpId()==(regg.getEmpId())) {
            	emp.set(i, regg);//update the new record
             
            }
        }
return regg ;
}
}

	

