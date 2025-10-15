package com.spring.boot.pipeline.repository;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;
import org.testcontainers.utility.TestcontainersConfiguration;

@DataJpaTest
@Import(TestcontainersConfiguration.class)
public class UserRepositoryTest {



}
