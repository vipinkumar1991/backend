package com.niit.shoppingcartbackend.model;

import org.springframework.stereotype.Component;

@Component
public class category {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescript() {
		return descript;
	}
	public void setDescript(String descript) {
		this.descript = descript;
	}
	private String id;
	private String name;
	private String descript;

}
