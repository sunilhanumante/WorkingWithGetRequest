package com.BikkadIt.GetRequest.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIt.GetRequest.Model.Student;
@RestController
public class StudentController {
	

	@GetMapping(value="/getStudent",produces = { "application/json","application/xml"})
	public ResponseEntity<Student> getStudent() {

		Student stu = new Student();
		stu.setSid(111);
		stu.setSname("Sunil");
		stu.setSaddress("Pune");
		stu.setSage(25);

		return new ResponseEntity<Student>(stu,HttpStatus.OK);

	}
	@PostMapping(value="/addStudent",consumes = {"application/json","application/xml"},produces = {"application/json", "application/xml" })
	public ResponseEntity<Student> addStudent(@RequestBody Student stu) {
		System.out.println(stu);
		return new ResponseEntity<Student>(stu,HttpStatus.CREATED);
		
	}

}
