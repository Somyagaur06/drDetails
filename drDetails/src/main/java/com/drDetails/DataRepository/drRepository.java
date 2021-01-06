package com.drDetails.DataRepository;

import org.springframework.data.repository.CrudRepository;

import com.drDetails.Pojo.drPojo;

public interface drRepository extends CrudRepository<drPojo,String> {
	
	
	drPojo findByComponentName(String componentName);

}
