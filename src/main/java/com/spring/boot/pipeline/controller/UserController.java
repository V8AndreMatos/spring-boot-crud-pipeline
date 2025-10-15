package com.spring.boot.pipeline.controller;

import com.spring.boot.pipeline.dto.UserDTO;
import com.spring.boot.pipeline.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Users", description = "User-related operations")
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @Operation(summary = "List all users", description = "Returns a list of all registered users")
    @ApiResponse(responseCode = "200", description = "List returned successfully")
    @GetMapping
    public List<UserDTO> findAll() {
        return userService.findAll();
    }

    @Operation(
            summary = "Search user by ID",
            description = "Returns data for a specific user",
            responses = {
                    @ApiResponse(responseCode = "200", description = "User found successfully"),
                    @ApiResponse(responseCode = "404", description = "User not found")
            }
    )
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        UserDTO dto = userService.findById(id);
        return ResponseEntity.ok(dto);
    }

    @Operation(
            summary = "Create a new user",
            description = "Creates a new user with name and age",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "User data",
                    required = true,
                    content = @Content(
                            schema = @Schema(implementation = UserDTO.class),
                            examples = @ExampleObject(value = "{ \"name\": \"User in the afternoon\", \"age\": 15 }")
                    )
            ),
            responses = {
                    @ApiResponse(responseCode = "201", description = "User created successfully"),
                    @ApiResponse(responseCode = "400", description = "Invalid input")
            }
    )
    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody @Valid UserDTO userDTO) {
        UserDTO userCreated = userService.create(userDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
    }

    @Operation(
            summary = "Update an existing user",
            description = "Updates user data by ID",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Updated user data",
                    required = true,
                    content = @Content(
                            schema = @Schema(implementation = UserDTO.class),
                            examples = @ExampleObject(value = "{ \"name\": \"User number one tuesday\", \"age\": 30 }")
                    )
            ),
            responses = {
                    @ApiResponse(responseCode = "200", description = "User updated successfully"),
                    @ApiResponse(responseCode = "404", description = "User not found")
            }
    )
    @PutMapping("/{id}")
    public ResponseEntity<UserDTO> update(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        UserDTO updatedUser = userService.update(id, userDTO);
        return ResponseEntity.ok(updatedUser);
    }

    @Operation(
            summary = "Delete user by ID",
            description = "Removes a user from the system",
            responses = {
                    @ApiResponse(responseCode = "204", description = "User deleted successfully"),
                    @ApiResponse(responseCode = "404", description = "User not found")
            }
    )
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
