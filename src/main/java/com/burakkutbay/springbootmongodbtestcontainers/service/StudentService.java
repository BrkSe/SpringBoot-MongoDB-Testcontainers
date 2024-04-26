package com.burakkutbay.springbootmongodbtestcontainers.service;

import com.burakkutbay.springbootmongodbtestcontainers.entity.Student;
import com.burakkutbay.springbootmongodbtestcontainers.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author burakkutbay
 */
@Service
public class StudentService {

  private final StudentRepository repository;

  public StudentService(StudentRepository repository) {
    this.repository = repository;
  }

  public Student saveStudent(Student student) {
    return this.repository.save(student);
  }

  public List<Student> getStudents() {
    return this.repository.findAll();
  }
}
