package com.springboot.project.exception;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;



@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fieldName;
	private Object fieldValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValueObject, Object fieldValue) {
		super(String.format("%s not found with %s : '%s'", resourceName,fieldName,fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
//	public ResourceNotFoundException(String string, String string2, long id) {
//		// TODO Auto-generated constructor stub
//	}

	public ResourceNotFoundException(String string, String string2, long id) {
		// TODO Auto-generated constructor stub
	}

	public String getResourceName() {
		return resourceName;
	}
	
	public String getFieldName() {
		return fieldName;
	}
	
	public Object getFieldValue() {
		return fieldValue;
	}
	
}
