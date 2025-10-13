package com.spring.boot.pipeline.service;

import com.spring.boot.pipeline.dto.UserDTO;
import com.spring.boot.pipeline.entity.User;
import com.spring.boot.pipeline.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<UserDTO> findAll(){
        List<User> list = userRepository.findAll();
        List<UserDTO> dtoList = list.stream().map(x -> new UserDTO(x)).toList();
        return dtoList;
    }

    public UserDTO findById(Long id){
        User user = userRepository.findById(id).orElseThrow(( -> new ResourceNotFoundException("Id" +id+ " Not Found");
        return new UserDTO();
    }



}
