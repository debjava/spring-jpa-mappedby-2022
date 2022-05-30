package com.ddlab.rnd;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.Branch;
import com.ddlab.rnd.entity.Child;
import com.ddlab.rnd.entity.Company;
import com.ddlab.rnd.entity.Parent;
import com.ddlab.rnd.entity.Student;
import com.ddlab.rnd.entity.Teacher;
import com.ddlab.rnd.service.One2ManyBiService;
import com.ddlab.rnd.service.One2OneBiService;

@Component
public class ApplicationAutoStart {
	
	@Autowired
	private One2OneBiService service;
	
	@Autowired
	private One2ManyBiService biService;
	
	@EventListener(ApplicationReadyEvent.class)
	public void afterStartup() {
		System.out.println("Application Started at : " + new Date());

		// Execute your code below
//		storeInfo();
//		storeCompanyInfo();
		storeTeacherStudentInfo();

	}
	
	private void storeTeacherStudentInfo() {
		Teacher teacher = new Teacher();
		teacher.setName("Vladimire Petorva");
		
		Student student = new Student();
		student.setName("Jujinia Petrova");
		
		teacher.addStudent(student);
		
//		// In case of Bidirectional, you have to set it
//		student.setTeacher(teacher);
		
		
		
		
		biService.saveTeacher(teacher);
	}

	public void storeCompanyInfo() {
		Company company = new Company();
		company.setName("EMC");
		Branch branch = new Branch();
		branch.setName("Bangalore");
		company.setBranch(branch);
		branch.setCompany(company);
		
		service.saveCompany(company);
	}
	
	public void storeInfo() {
		Parent parent = new Parent();
		parent.setName("John Abraham");
		Child child = new Child();
		child.setName("Ravi Kapoor");
		parent.setChild(child);
		
		service.saveParent(parent);
	}

}
