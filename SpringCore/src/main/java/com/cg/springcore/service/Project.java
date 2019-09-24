package com.cg.springcore.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("proj")
public class Project {
	@Value("1")
	private int projId;

	public int getProjId() {
		return projId;
	}

	public void setProjId(int projId) {
		this.projId = projId;
	}
	
	public void getData() {
		System.out.println("Inside Project " + this.projId);
	}
	
}
