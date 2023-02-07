package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "studtbl")
@ToString(callSuper = true)
public class Student extends BaseEntity {
	
	@Column(name="sname",length=30)
	private String name;
	@Column(name="scourse",length=30)
	private String course;
	@Column(name="roll_no")
	private int rollNumber;
	@Column(name="add_date")
	private LocalDate addDate;
	@Column(name="email",length=30)
	private String email;
	@Column(name="pass",length=30)
	private String password;
	
	@Column(name="fees")
	private double fees;

	public Student(String name, String course, int rollNumber, LocalDate addDate, String email, String password,
			double fees) {
		super();
		this.name = name;
		this.course = course;
		this.rollNumber = rollNumber;
		this.addDate = addDate;
		this.email = email;
		this.password = password;
		this.fees = fees;
	}
	
	
	

}
