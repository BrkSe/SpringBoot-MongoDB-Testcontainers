package com.burakkutbay.springbootmongodbtestcontainers;

import com.burakkutbay.springbootmongodbtestcontainers.entity.Student;
import com.burakkutbay.springbootmongodbtestcontainers.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.ContextConfiguration;
import org.testcontainers.junit.jupiter.Testcontainers;

/**
 * @author burakkutbay
 */
@DataMongoTest
@Testcontainers
@ContextConfiguration(classes = MongoDBTestContainerConfig.class)
public class StudentRepositoryIntegrationTest {
 

  @Autowired
  private StudentRepository studentRepository;

  @Test
  public void testStudentSave() {
    Student student = new Student();
    student.setName("Burak");
    student.setAge(20);
    Student savedStudent = studentRepository.save(student);
    Assertions.assertNotNull(savedStudent.getId());
    Assertions.assertEquals(student.getName(), savedStudent.getName());
    Assertions.assertEquals(student.getAge(), savedStudent.getAge());
  }
}
