package com.LoginRegistration.LoginRegistrationServer.Controller;

import com.LoginRegistration.LoginRegistrationServer.Requests.LoginRequest;
import com.LoginRegistration.LoginRegistrationServer.Service.UserService;
import com.LoginRegistration.LoginRegistrationServer.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * UsersController is a Spring REST controller that handles user-related
 * operations such as adding new users and logging in existing users.
 * It communicates with the UserService to perform these operations.
 */
@RestController // Indicates that this class is a Spring REST controller
public class UsersController {

    @Autowired
    private UserService userService; // Automatically injects the UserService

    /**
     * Adds a new user to the system.
     *
     * @param users The user object containing the information of the user to be added.
     * @return The saved Users object after successful addition.
     * @CrossOrigin allows requests from the specified origin (React frontend).
     */
    @PostMapping("/addUser")
    @CrossOrigin(origins = "http://localhost:3000")
    public Users addUser(@RequestBody Users users) {
        // Call the service method to save the user
        return userService.addUser(users);
    }

    /**
     * Logs in an existing user.
     *
     * @param loginRequest The login request containing username and password.
     * @return True if the login is successful; otherwise, false.
     * @CrossOrigin allows requests from the specified origin (React frontend).
     */
    @PostMapping("/loginUser")
    @CrossOrigin(origins = "http://localhost:3000")
    public Boolean loginUser(@RequestBody LoginRequest loginRequest){
        return userService.loginUser(loginRequest); // Call the service method to authenticate the user
    }
}
