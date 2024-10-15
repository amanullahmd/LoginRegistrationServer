package com.LoginRegistration.LoginRegistrationServer.Service;

import com.LoginRegistration.LoginRegistrationServer.Repository.UsersRepo;
import com.LoginRegistration.LoginRegistrationServer.Requests.LoginRequest;
import com.LoginRegistration.LoginRegistrationServer.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * UserService provides business logic for managing users in the system.
 * It interacts with the UsersRepo to perform operations such as
 * adding users and authenticating user login requests.
 */
@Service // Indicates that this class is a Spring service component
public class UserService {

    @Autowired
    UsersRepo usersRepo; // Automatically injects the Users repository

    /**
     * Adds a new user to the system.
     *
     * @param users The user object containing the user's information.
     * @return The saved Users object after successful addition.
     */
    public Users addUser(Users users) {
        return usersRepo.save(users); // Save the user using the repository
    }

    /**
     * Authenticates a user based on the provided login request.
     *
     * @param loginRequest The login request containing the user's email and password.
     * @return True if the login is successful; otherwise, false.
     */
    public Boolean loginUser(LoginRequest loginRequest) {
        // Fetch the user by email
        Optional<Users> userOptional = usersRepo.findById(loginRequest.getEmail());

        // Check if the user is present
        if (userOptional.isEmpty()) {
            return false; // User not found
        }

        Users user = userOptional.get();

        // Check if the password matches
        if (!user.getPassword().equals(loginRequest.getPassword())) {
            return false; // Invalid password
        }

        return true; // Successful login
    }
}
