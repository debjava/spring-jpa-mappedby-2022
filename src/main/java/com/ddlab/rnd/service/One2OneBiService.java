package com.ddlab.rnd.service;

import com.ddlab.rnd.entity.Company;
import com.ddlab.rnd.entity.Parent;

public interface One2OneBiService {
	
	void saveParent(Parent parent);
	
	void saveCompany(Company company);
}
