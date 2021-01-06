package com.drDetails.Pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class drPojo {
     
	@Id
	private String componentName;
	
	private String drNumber;
	
	private String environment;
	
	private String approvalStatus;
	
	private String stories;
	
	private String release;
	
	private String notes;
	
	private String version;

	public drPojo() {
		
	}

	public drPojo(String drNumber, String environment, String approvalStatus, String stories, String release,
			String notes, String version) {
		super();
		this.drNumber = drNumber;
		this.environment = environment;
		this.approvalStatus = approvalStatus;
		this.stories = stories;
		this.release = release;
		this.notes = notes;
		this.version = version;
	}

	public String getDrNumber() {
		return drNumber;
	}

	public void setDrNumber(String drNumber) {
		this.drNumber = drNumber;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getApprovalStatus() {
		return approvalStatus;
	}

	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}

	public String getStories() {
		return stories;
	}

	public void setStories(String stories) {
		this.stories = stories;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
