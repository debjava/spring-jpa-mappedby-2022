package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.Company;
import com.ddlab.rnd.entity.Parent;
import com.ddlab.rnd.repository.One2OneBiCompRepo;
import com.ddlab.rnd.repository.One2OneBiRepository;
import com.ddlab.rnd.service.One2OneBiService;

@Service
public class One2OneBiServiceImpl implements One2OneBiService {
	
	@Autowired
	private One2OneBiRepository repo;
	
	@Autowired
	private One2OneBiCompRepo compRepo;

	@Override
	public void saveParent(Parent parent) {
		repo.save(parent);
	}

	@Override
	public void saveCompany(Company company) {
		compRepo.save(company);
	}

}
