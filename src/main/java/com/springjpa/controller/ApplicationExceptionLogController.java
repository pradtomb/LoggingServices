package com.springjpa.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springjpa.dto.ApplicationExceptionLogDTO;
import com.springjpa.service.ApplicationExceptionLogServices;

@RestController
@RequestMapping("/applicationexceptionlog")
public class ApplicationExceptionLogController {

	@Autowired
	ApplicationExceptionLogServices applicationExceptionService;
	
	@RequestMapping(method=RequestMethod.POST,produces="application/json")
	public Map<String,Object> saveLog(@RequestBody ApplicationExceptionLogDTO appExceptionDTO){
		
		applicationExceptionService.logException(appExceptionDTO);//improve
		Map<String,Object> result=new HashMap<String, Object>();
		result.put("operation_result", "true"); 
		result.put("response", appExceptionDTO); //
		return result;
	}
}
