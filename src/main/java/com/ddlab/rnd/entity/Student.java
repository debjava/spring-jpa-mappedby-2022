package com.ddlab.rnd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name="Student")
@Table(name = "student")
@Getter @Setter
public class Student {
	
	@Id @GeneratedValue
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	private Teacher teacher;

}
