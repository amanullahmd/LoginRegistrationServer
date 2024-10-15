package com.LoginRegistration.LoginRegistrationServer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * Represents a user in the system.
 * This class is mapped to the database table as an entity.
 */
@Entity // Indicates that this class is a JPA entity
@Data // Generates getters, setters, toString, equals, and hashCode methods
public class Users {

    @Id // Specifies the primary key of the entity
    private String email; // Unique identifier for the user, typically used for login

    private String name; // The name of the user

    private String password; // The password for the user's account
}
