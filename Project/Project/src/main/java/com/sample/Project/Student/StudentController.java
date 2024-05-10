package com.sample.Project.Student;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="get")
public class StudentController {
  public StudentService stdser;
  @Autowired
  public StudentController(StudentService stdser){
    this.stdser=stdser;
  }
  @GetMapping(path="gstudent/details")
  public List<Student> getStudent(){
    return stdser.getStudent();
  }

}
