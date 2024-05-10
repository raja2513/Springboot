package com.sample.Project.Student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
  public List<Student> getStudent(){
    return  Arrays.asList(new Student(
        1L,"raja","raja@gmail.com", LocalDate.of(2002, Month.AUGUST,14),22
    ));
  }
}
