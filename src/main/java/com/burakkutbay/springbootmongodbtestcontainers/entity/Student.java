package com.burakkutbay.springbootmongodbtestcontainers.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author burakkutbay
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Student {
  @Id
  String id;
  String name;
  Integer age;
}
