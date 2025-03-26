package com.example.Body_tracker.service;

import com.example.Body_tracker.models.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    User create ();

    User update (User user);

    User read (User user);

    void delete (User user);

    List <User> findAllUsers ();
}
