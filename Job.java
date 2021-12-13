package com;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job")
public class Job {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company_name;
    private String profile;
    private String description;
    private String location;
    private String mode;
    private float salary;
    

	public String getCompany_name() {
		return company_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public static void save(Job job) {
		// TODO Auto-generated method stub
		
	}
    
     
    // other getters and setters are hidden for brevity
}
