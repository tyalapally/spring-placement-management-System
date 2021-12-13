package com;
import javax.persistence.*;

@Entity
@Table(name = "student")

public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	@Column(nullable = false, length = 64)
	private String password;
	private String phone_number;
	private String tenth_marks;
	private String twelth_marks;
	private String degree;
	private String college_name;
	private String degree_marks;
	private String passoutyear;
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getTenth_marks() {
		return tenth_marks;
	}
	public void setTenth_marks(String tenth_marks) {
		this.tenth_marks = tenth_marks;
	}
	public String getTwelth_marks() {
		return twelth_marks;
	}
	public void setTwelth_marks(String twelth_marks) {
		this.twelth_marks = twelth_marks;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getCollege_name() {
		return college_name;
	}
	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}
	public String getDegree_marks() {
		return degree_marks;
	}
	public void setDegree_marks(String degree_marks) {
		this.degree_marks = degree_marks;
	}
	public String getPassoutyear() {
		return passoutyear;
	}
	public void setPassoutyear(String passoutyear) {
		this.passoutyear = passoutyear;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
}
