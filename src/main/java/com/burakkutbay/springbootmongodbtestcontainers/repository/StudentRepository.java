package com.burakkutbay.springbootmongodbtestcontainers.repository;

import com.burakkutbay.springbootmongodbtestcontainers.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author burakkutbay
 */
@Repository
public interface StudentRepository extends MongoRepository<Student, Long> {
}
