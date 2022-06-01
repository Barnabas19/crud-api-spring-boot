package com.restapi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.api.bean.Subject;
import com.restapi.api.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired
	private SubjectService subjectService;
	
	//READ ALL SUBJECTS
	@RequestMapping("/subjects")
	public List<Subject> getAllSubjects(){
		return subjectService.getAllSubjects();
	}
	
	//READ SUBJECT BY ID
	@RequestMapping("/subjects/{id}")
	public Optional<Subject> getSubjectByID(@PathVariable String id){
		return subjectService.getSubjectByID(id);
	}
	
	//CREATE NEW SUBJECT
	@RequestMapping(method = RequestMethod.POST, value="/subjects/new")
	public void addSubject(@RequestBody Subject subject) {
		subjectService.addSubject(subject);
	}
	
	//UPDATE SUBJECT BY ID
	@RequestMapping(method = RequestMethod.PUT, value="/subjects/update/{id}")
	public void updateSubject(@PathVariable String id, @RequestBody Subject subject) {
		subjectService.updateSubject(id, subject);
	}

	//DELETE SUBJECT BY ID
	@RequestMapping(method = RequestMethod.DELETE, value="subjects/delete/{id}")
	public void DeleteSubject(@PathVariable String id) {
		subjectService.deleteSubject(id);
	}
	
	//DELETE ALL SUBJECTS
	@RequestMapping(method = RequestMethod.DELETE, value="subjects/delete")
	public void DeleteAllSubjects() {
		subjectService.deleteAllSubjects();
	}
	
}
