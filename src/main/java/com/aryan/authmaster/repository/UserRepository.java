package com.aryan.authmaster.repository;

import com.aryan.authmaster.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
    User findByVerificationToken(String token);
    void deleteAllByIsVerifiedFalseAndVerificationTokenExpiryBefore(LocalDateTime expiryDate);
}
