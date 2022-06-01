package com.restapi.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.restapi.api.bean.Subject;

public interface SubjectRepository extends CrudRepository<Subject, String> {

}
