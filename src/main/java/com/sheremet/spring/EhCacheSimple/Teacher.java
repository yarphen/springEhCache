package com.sheremet.spring.EhCacheSimple;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table(name="TEACHERS")
public class Teacher {
	@Id
	@GeneratedValue
	private int teacherId; 

	@Column(name="firstname")
	private String firstname;

	@Column(name="lastname")
	private String lastname;

	@Column(name="birth_date")
	private Date birthDate;

	@Column(name="cell_phone")
	private String cellphone;

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(java.util.Date date) {
		this.birthDate = date;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", birthDate=" + birthDate + ", cellphone=" + cellphone + "]";
	}
}
