package com.spring.boot.pipeline;

import org.springframework.boot.SpringApplication;

public class TestSpringBootCrudPipelineApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringBootCrudPipelineApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
