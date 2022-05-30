package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.Teacher;

@Repository
public interface One2ManyBiDRepo extends CrudRepository<Teacher, Long>{

}
