package com.example.Body_tracker.models;

import lombok.*;

import javax.management.relation.Role;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    private int id;
    private String email;
    private String password;
    private String name;
    private LocalDate creationDate;
    private Role role;
}
