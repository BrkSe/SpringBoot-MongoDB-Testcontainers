package com.burakkutbay.springbootmongodbtestcontainers;

import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;

/**
 * @author burakkutbay
 */
@Configuration
@EnableMongoRepositories
public class MongoDBTestContainerConfig {
  
  @Container
  @ServiceConnection
  public static MongoDBContainer mongoDBContainer = new MongoDBContainer("mongo:latest");

  static {
    mongoDBContainer.start();
    var mappedPort = mongoDBContainer.getMappedPort(27017);
    System.setProperty("mongodb.container.port", String.valueOf(mappedPort));
  }
  
}
