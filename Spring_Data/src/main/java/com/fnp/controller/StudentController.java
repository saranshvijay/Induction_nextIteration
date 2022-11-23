package com.fnp.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.fnp.dto.Student;

@Controller
public class StudentController {
	
	@PostMapping("/details")
	public Model sendEmployee(Student student,Model model) {
		
		
		model.addAttribute("studentId",student.getId());
		model.addAttribute("studentName",student.getName());
		model.addAttribute("studentEmail",student.getEmail());
		model.addAttribute("studentCreator",student.getCreatedby());
		model.addAttribute("studentUpdater",student.getUpdatedBy());
		model.addAttribute("studentPhone",student.getPhone());
		model.addAttribute("studentCreationDate",student.getCreatedOn());
		model.addAttribute("studentUpdationDate",student.getLastUpdatedBy());
		
		System.out.println(student);
		System.out.println(student.getCreatedby());
		
		return model;
	}
		

}
