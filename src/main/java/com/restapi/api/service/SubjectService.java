package com.restapi.api.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.api.bean.Subject;
import com.restapi.api.repository.SubjectRepository;

@Service
public class SubjectService {
	
	@Autowired
	public SubjectRepository subjectRepo;
	
	public List<Subject> getAllSubjects(){
		List<Subject> subjects = new ArrayList<>();
		subjectRepo.findAll().forEach(subjects::add);
		return subjects;
	}
	
	public Optional<Subject> getSubjectByID(String id){
		return subjectRepo.findById(id);
	}
	
	public void addSubject(Subject subject) {
		subjectRepo.save(subject);
	}
	
	public void updateSubject(String id, Subject subject) {
		subjectRepo.save(subject);
	}
	
	public void deleteSubject(String id) {
		subjectRepo.deleteById(id);
	}
	
	public void deleteAllSubjects() {
		subjectRepo.deleteAll();
	}

}
