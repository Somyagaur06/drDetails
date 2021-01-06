package com.drDetails.RestApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.drDetails.DataRepository.drRepository;
import com.drDetails.Pojo.drPojo;

@RestController()
public class drDetails {

	
	
	
	@Autowired
	private drRepository drRepository;
	
	
	
	@PostMapping("/dot/rest/drApiService/getDRDetails/component/{componentName}")
	public drPojo getdrDetails(@PathVariable String componentName) {
		
		
		return drRepository.findByComponentName(componentName);
}


	
	








}
