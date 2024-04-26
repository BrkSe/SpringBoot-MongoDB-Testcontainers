package com.burakkutbay.springbootmongodbtestcontainers.controller;

import com.burakkutbay.springbootmongodbtestcontainers.entity.Student;
import com.burakkutbay.springbootmongodbtestcontainers.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author burakkutbay
 */
@RestController
@RequiredArgsConstructor
public class StudentController {

  private final StudentService service;

  @PostMapping
  public Student createTodo(@RequestBody Student student) {
    return this.service.saveStudent(student);
  }

  @GetMapping
  public List<Student> createTodo() {
    return this.service.getStudents();
  }
}
