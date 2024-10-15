package com.LoginRegistration.LoginRegistrationServer.Repository;

import com.LoginRegistration.LoginRegistrationServer.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * UsersRepo is a Spring Data JPA repository interface for accessing
 * and managing user entities in the database.
 * It provides CRUD operations and custom query methods for the Users entity.
 */
@Repository // Indicates that this interface is a Spring Data repository
public interface UsersRepo extends JpaRepository<Users, String> {
    // No additional methods are required at this time, as JpaRepository provides
    // basic CRUD functionality out of the box for Users entities identified by email.
}
