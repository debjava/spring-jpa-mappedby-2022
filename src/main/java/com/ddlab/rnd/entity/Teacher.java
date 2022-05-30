package com.ddlab.rnd.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Teacher")
@Table(name = "teacher")
//@Data // Do not use @Data, it creates StackOverflow Error
// https://stackoverflow.com/questions/54775257/jpa-bidirectional-relationship-throws-java-lang-stackoverflowerror-null
@Getter
@Setter
public class Teacher {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "teacher", cascade = CascadeType.ALL)

	private Set<Student> students = new HashSet<>();

	public void addStudent(Student student) {
		students.add(student);
		student.setTeacher(this);
	}

	public void removeStudent(Student student) {
		student.setTeacher(null);
		students.remove(student);
	}
}
