package com.spring.boot.pipeline.service;

import com.spring.boot.pipeline.dto.UserDTO;
import com.spring.boot.pipeline.entity.User;
import com.spring.boot.pipeline.exception.ResourceNotFoundException;
import com.spring.boot.pipeline.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(UserDTO::new)
                .collect(Collectors.toList());
    }

    public UserDTO findById(Long id){
        User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Id" +id+ " Not Found"));
        return new UserDTO();
    }

    public UserDTO create(UserDTO userDTO) {

        User entity = userDTO.toEntity();
        entity = userRepository.save(entity);
        return new UserDTO(entity);
    }

    public UserDTO update(Long id, UserDTO userDTO) {
        User entity = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User " + id + " Not Found"));

        entity.setName(userDTO.getName());
        entity.setAge(userDTO.getAge());

        entity = userRepository.save(entity);
        return new UserDTO(entity);
    }


    public void deleteById(Long id) {

        User entity = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User with id :  " +id+ " Not Found"));
        userRepository.deleteById(id);
    }
 }
