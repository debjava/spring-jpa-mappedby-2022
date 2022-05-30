package com.ddlab.rnd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Branch")
@Table(name = "branch")
@Data
public class Branch {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="name")
	private String name;
	
	@OneToOne
	private Company company;
}
