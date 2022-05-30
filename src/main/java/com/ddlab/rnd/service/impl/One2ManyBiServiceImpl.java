package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.Teacher;
import com.ddlab.rnd.repository.One2ManyBiDRepo;
import com.ddlab.rnd.service.One2ManyBiService;

@Service
public class One2ManyBiServiceImpl implements One2ManyBiService {

	@Autowired
	private One2ManyBiDRepo biRepo;
	
	@Override
	public void saveTeacher(Teacher teacher) {
		biRepo.save(teacher);
	}

}
