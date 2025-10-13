package com.spring.boot.pipeline.dto;

import com.spring.boot.pipeline.entity.User;

public class UserDTO {

    private Long id;
    private String name;
    private String age;

    public UserDTO() {
    }

    public UserDTO(Long id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public UserDTO(User entity) {

        this.id = entity.getId();
        this.name = entity.getName();
        this.age = entity.getAge();
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
