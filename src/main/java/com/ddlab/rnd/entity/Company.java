package com.ddlab.rnd.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Company")
@Table(name = "company")
@Data
public class Company {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="name")
	private String name;
	
	/*
	 * In this case Branch class
	 * is the owning side.
	 * Whenever you use mappedBy,
	 * the opposite side class
	 * will be the owner.
	 */
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "company")
	private Branch branch;
}
