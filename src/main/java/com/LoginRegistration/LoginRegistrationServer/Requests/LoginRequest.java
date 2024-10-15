package com.LoginRegistration.LoginRegistrationServer.Requests;

import lombok.Data;

/**
 * LoginRequest represents the data required for user login.
 * This class contains the necessary fields for authenticating a user.
 */
@Data // Generates getters, setters, toString, equals, and hashCode methods
public class LoginRequest {

    private String email; // The email of the user, used as a unique identifier for login
    private String password; // The password for the user's account
}
