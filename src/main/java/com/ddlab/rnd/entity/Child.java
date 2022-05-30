package com.ddlab.rnd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity(name = "Child")
@Table(name = "child")
@Data
public class Child {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name="name")
	private String name;
	
	/*
	 * By writting mappedBy = child,
	 * Here Parent is the owner
	 * and parent table will have
	 * child id as reference
	 */
	@OneToOne(mappedBy = "child")
	private Parent parent;

}
