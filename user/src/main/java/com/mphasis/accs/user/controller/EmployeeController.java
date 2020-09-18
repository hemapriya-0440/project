package com.mphasis.accs.user.controller;

import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.accs.user.model.EmployeeRegister;
import com.mphasis.accs.user.repository.EmployeeRegisterRepository;
import com.mphasis.accs.user.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@Autowired
	private EmployeeRegisterRepository registerRepository;

	/*
	 * @RequestMapping(value = "/api/v1/save", method = RequestMethod.POST, produces
	 * = MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<Boolean>
	 * saveEmployeeDetails(@Valid @RequestBody Employee requestData) { Boolean
	 * responseData = service.saveemploee(requestData); return new
	 * ResponseEntity<Boolean>(responseData, HttpStatus.CREATED);
	 * 
	 * }
	 */
	
	@RequestMapping(value = "/api/v1/saveemp", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> saveemployeeRegisterDetails(@Valid @RequestBody EmployeeRegister requestData) {
		if(registerRepository.existsById(requestData.getEmpId())){
			return new  ResponseEntity<Boolean>(HttpStatus.BAD_REQUEST);
		}
		Boolean responseData = service.saveEmployeeDetails(requestData);
		return new ResponseEntity<Boolean>(responseData, HttpStatus.CREATED);
		
	
	}
	
	@RequestMapping(value = "/api/v1/emp", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<EmployeeRegister>> getallemployeeRegisterDetails() {
		List<EmployeeRegister> responseData = service.getAllEmp();
		return new ResponseEntity<List<EmployeeRegister>>(responseData, HttpStatus.FOUND);

	}

	@RequestMapping(value = "/api/v1/emp/id/get", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeRegister> getemployeeRegisterDetailsById(
			@Valid @RequestBody List<EmployeeRegister> employyee) {
		EmployeeRegister employyees = service.findByempid(employyee.get(0).getEmpId());
		return new ResponseEntity<EmployeeRegister>(employyees, HttpStatus.OK);
	}

	@RequestMapping(value = "/api/v1/emp/id/delete", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeRegister> deleteEmployeeById(@Valid @RequestBody List<EmployeeRegister> employyee) {
		service.deleteEmployeeById(employyee.get(0).getEmpId());
		return new ResponseEntity<EmployeeRegister>(HttpStatus.FOUND);
	}

	
	  @RequestMapping(value = "/api/v1/emp/id/updatebyid", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	  public ResponseEntity<EmployeeRegister> updateEmployeeById(@PathVariable long id,
			  @RequestBody List<EmployeeRegister> employyee) {
	 EmployeeRegister employeeRegister=service.findByempid(id);
	
	  return new ResponseEntity<EmployeeRegister>(HttpStatus.CREATED); }
	 
	
	@RequestMapping(value = "/api/v1/emp/id/update", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<EmployeeRegister> updateeEmployeeById( @Valid @RequestBody EmployeeRegister employyee) {
		
		EmployeeRegister  employeeRegister=	service.upDateEmployeeById(employyee);
		return new ResponseEntity<EmployeeRegister>(employeeRegister,HttpStatus.CREATED);
	}
	
}
