package com.usecase4.IncidentManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Incident {

	@Id
	@GeneratedValue
	private long id;

	private String inciName;
	private String description;
	private String inciPriority;
	private String inciCategory;
	private String inciStatus;
	private long userId;
	private String userName;
	private String userDept;

	public Incident() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Incident(long id, String inciName, String description, String inciPriority, String inciCategory,
			String inciStatus, long userId, String userName, String userDept) {
		super();
		this.id = id;
		this.inciName = inciName;
		this.description = description;
		this.inciPriority = inciPriority;
		this.inciCategory = inciCategory;
		this.inciStatus = inciStatus;
		this.userId = userId;
		this.userName = userName;
		this.userDept = userDept;
	}

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getInciName() {
		return inciName;
	}

	public void setInciName(String inciName) {
		this.inciName = inciName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getInciPriority() {
		return inciPriority;
	}

	public void setInciPriority(String inciPriority) {
		this.inciPriority = inciPriority;
	}

	public String getInciCategory() {
		return inciCategory;
	}

	public void setInciCategory(String inciCategory) {
		this.inciCategory = inciCategory;
	}

	public String getInciStatus() {
		return inciStatus;
	}

	public void setInciStatus(String inciStatus) {
		this.inciStatus = inciStatus;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserDept() {
		return userDept;
	}

	public void setUserDept(String userDept) {
		this.userDept = userDept;
	}

	@Override
	public String toString() {
		return "Incident [id=" + id + ", inciName=" + inciName + ", description=" + description + ", inciPriority="
				+ inciPriority + ", inciCategory=" + inciCategory + ", inciStatus=" + inciStatus + ", userId=" + userId
				+ ", userName=" + userName + ", userDept=" + userDept + "]";
	}



}
