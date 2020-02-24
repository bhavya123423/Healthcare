package com.capg.DTO;
import java.util.List;
public class User {
	String UserId;
	List<DiagnosticCenter> centerList;
	public User(String userId, List<DiagnosticCenter> centerList) {
		super();
		this.UserId = userId;
		this.centerList = centerList;
	}
	public User() {
		super();
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		this.UserId = userId;
	}
	public List<DiagnosticCenter> getCenterList() {
		return centerList;
	}
	public void setCenterList(List<DiagnosticCenter> centerList) {
		this.centerList = centerList;
	}

	}


