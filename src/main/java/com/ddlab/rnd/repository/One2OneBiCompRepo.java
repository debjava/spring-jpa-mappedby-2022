package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.Company;

@Repository
public interface One2OneBiCompRepo extends CrudRepository<Company, Long>{

}
