package com.cito.sinide.model;

import java.util.ArrayList;
import java.util.List;

public class ResponseModelBase extends ModelBase {
	private static final long serialVersionUID = -6473696494213250195L;
	private Boolean response;
	private List<String> errors = new ArrayList<>();
	
	public Boolean getResponse() {
		return response;
	}
	public void setResponse(Boolean response) {
		this.response = response;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
}
