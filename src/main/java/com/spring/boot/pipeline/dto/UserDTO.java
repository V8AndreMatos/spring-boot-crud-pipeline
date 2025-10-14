package com.spring.boot.pipeline.dto;

import com.spring.boot.pipeline.entity.User;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class UserDTO {

    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @Min(value = 0, message = "Age must be positive")
    @Max(value = 120, message = "Age must be realistic")

    private Integer age;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UserDTO(User entity) {

        this.id = entity.getId();
        this.name = entity.getName();
        this.age = entity.getAge();
    }

    public User toEntity() {
        User user = new User();
        user.setId(this.id);
        user.setName(this.name);
        user.setAge(this.age);
        return user;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
