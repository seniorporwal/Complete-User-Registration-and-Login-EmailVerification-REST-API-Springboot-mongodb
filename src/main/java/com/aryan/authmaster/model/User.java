//package com.alfabeto.tls.model;
//
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//
//import java.time.LocalDateTime;
//
//@Document(collection = "users")
//public class User {
//    @Id
//    private String id;
//    private String fullName;
//    private String email;
//    private String encryptedPassword;
//    private boolean isVerified;
//    private String verificationToken;
//    private LocalDateTime verificationTokenExpiry;
////    private String resetToken; // Field for password reset token
////    private LocalDateTime resetTokenCreationTime; // Field for reset token creation time
//
//    // Getters and Setters
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public LocalDateTime getVerificationTokenExpiry() {
//        return verificationTokenExpiry;
//    }
//
//    public void setVerificationTokenExpiry(LocalDateTime verificationTokenExpiry) {
//        this.verificationTokenExpiry = verificationTokenExpiry;
//    }
//
//    public String getVerificationToken() {
//        return verificationToken;
//    }
//
//    public void setVerificationToken(String verificationToken) {
//        this.verificationToken = verificationToken;
//    }
//
//    public boolean isVerified() {
//        return isVerified;
//    }
//
//    public void setVerified(boolean verified) {
//        isVerified = verified;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getFullName() {
//        return fullName;
//    }
//
//    public void setFullName(String fullName) {
//        this.fullName = fullName;
//    }
//
//    public String getEncryptedPassword() {
//        return encryptedPassword;
//    }
//
//    public void setEncryptedPassword(String encryptedPassword) {
//        this.encryptedPassword = encryptedPassword;
//    }
//}


//package com.alfabeto.tls.model;
//
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//
//
//import java.time.LocalDateTime;
//
//@Document(collection = "users")
//public class User {
//    @Id
//    private String id;
//    @NotBlank(message = "First name is required")
//    private String firstName;
//    @NotBlank(message = "Last name is required")
//    private String lastName;
//    @NotBlank(message = "Email is required")
//    @Email(message = "Email should be valid")
//    private String email;
//    @NotBlank(message = "Password is required")
//    private String encryptedPassword;
//    private boolean isVerified;
//    private String verificationToken;
//    private LocalDateTime verificationTokenExpiry;
////    private String resetToken; // Field for password reset token
////    private LocalDateTime resetTokenCreationTime; // Field for reset token creation time
//
//    // Getters and Setters
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public LocalDateTime getVerificationTokenExpiry() {
//        return verificationTokenExpiry;
//    }
//
//    public void setVerificationTokenExpiry(LocalDateTime verificationTokenExpiry) {
//        this.verificationTokenExpiry = verificationTokenExpiry;
//    }
//
//    public String getVerificationToken() {
//        return verificationToken;
//    }
//
//    public void setVerificationToken(String verificationToken) {
//        this.verificationToken = verificationToken;
//    }
//
//    public boolean isVerified() {
//        return isVerified;
//    }
//
//    public void setVerified(boolean verified) {
//        isVerified = verified;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getEncryptedPassword() {
//        return encryptedPassword;
//    }
//
//    public void setEncryptedPassword(String encryptedPassword) {
//        this.encryptedPassword = encryptedPassword;
//    }
//}

//package com.alfabeto.tls.model;
//
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import java.time.ZonedDateTime;
//
//
//import java.time.LocalDateTime;
//
//@Document(collection = "users")
//public class User {
//
//
//    @Id
//    private String id;
//
//    @NotBlank(message = "First name is required")
//    private String firstName;
//
//    @NotBlank(message = "Last name is required")
//    private String lastName;
//
//    @NotBlank(message = "Email is required")
//    @Email(message = "Email should be valid")
//    private String email;
//
//    @NotBlank(message = "Password is required")
//    private String encryptedPassword;
//
//    private boolean isVerified;
//    private String verificationToken;
//
//    @CreatedDate
//    private ZonedDateTime createdAt;
//
//    private ZonedDateTime verificationTokenExpiry;
//
//    // Getters and Setters
//    public ZonedDateTime getVerificationTokenExpiry() {
//        return verificationTokenExpiry;
//    }
//
//    public void setVerificationTokenExpiry(ZonedDateTime verificationTokenExpiry) {
//        this.verificationTokenExpiry = verificationTokenExpiry;
//    }
//
//    public ZonedDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(ZonedDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    // getting getter and setters
//
//    public String getVerificationToken() {
//        return verificationToken;
//    }
//
//    public void setVerificationToken(String verificationToken) {
//        this.verificationToken = verificationToken;
//    }
//
//    public @NotBlank(message = "Last name is required") String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(@NotBlank(message = "Last name is required") String lastName) {
//        this.lastName = lastName;
//    }
//
//    public boolean isVerified() {
//        return isVerified;
//    }
//
//    public void setVerified(boolean verified) {
//        isVerified = verified;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public @NotBlank(message = "First name is required") String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(@NotBlank(message = "First name is required") String firstName) {
//        this.firstName = firstName;
//    }
//
//    public @NotBlank(message = "Password is required") String getEncryptedPassword() {
//        return encryptedPassword;
//    }
//
//    public void setEncryptedPassword(@NotBlank(message = "Password is required") String encryptedPassword) {
//        this.encryptedPassword = encryptedPassword;
//    }
//
//    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
//        return email;
//    }
//
//    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
//        this.email = email;
//    }
//}















//package com.alfabeto.tls.model;
//
//import org.springframework.data.annotation.CreatedDate;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//
//import java.time.LocalDateTime;
//
//@Document(collection = "users")
//public class User {
//
//    @Id
//    private String id;
//
//    @NotBlank(message = "First name is required")
//    private String firstName;
//
//    @NotBlank(message = "Last name is required")
//    private String lastName;
//
//    @NotBlank(message = "Email is required")
//    @Email(message = "Email should be valid")
//    private String email;
//
//    @NotBlank(message = "Password is required")
//    private String encryptedPassword;
//
//    private boolean isVerified;
//    private String verificationToken;
//
//    @CreatedDate
//    private LocalDateTime createdAt;
//
//    private LocalDateTime verificationTokenExpiry;
//
//    // Getters and Setters
//    public LocalDateTime getVerificationTokenExpiry() {
//        return verificationTokenExpiry;
//    }
//
//    public void setVerificationTokenExpiry(LocalDateTime verificationTokenExpiry) {
//        this.verificationTokenExpiry = verificationTokenExpiry;
//    }
//
//    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
//        return email;
//    }
//
//    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
//        this.email = email;
//    }
//
//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public @NotBlank(message = "Password is required") String getEncryptedPassword() {
//        return encryptedPassword;
//    }
//
//    public void setEncryptedPassword(@NotBlank(message = "Password is required") String encryptedPassword) {
//        this.encryptedPassword = encryptedPassword;
//    }
//
//    public @NotBlank(message = "First name is required") String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(@NotBlank(message = "First name is required") String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public @NotBlank(message = "Last name is required") String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(@NotBlank(message = "Last name is required") String lastName) {
//        this.lastName = lastName;
//    }
//
//    public boolean isVerified() {
//        return isVerified;
//    }
//
//    public void setVerified(boolean verified) {
//        isVerified = verified;
//    }
//
//    public String getVerificationToken() {
//        return verificationToken;
//    }
//
//    public void setVerificationToken(String verificationToken) {
//        this.verificationToken = verificationToken;
//    }
//}

package com.aryan.authmaster.model;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is required")
    private String encryptedPassword;

    private boolean isVerified;
    private String verificationToken;

    @CreatedDate
    private LocalDateTime createdAt;

    private LocalDateTime verificationTokenExpiry;

    // Getters and Setters
    public LocalDateTime getVerificationTokenExpiry() {
        return verificationTokenExpiry;
    }

    public void setVerificationTokenExpiry(LocalDateTime verificationTokenExpiry) {
        this.verificationTokenExpiry = verificationTokenExpiry;
    }

    public @NotBlank(message = "Email is required") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email is required") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public @NotBlank(message = "Password is required") String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(@NotBlank(message = "Password is required") String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public @NotBlank(message = "First name is required") String getFirstName() {
        return firstName;
    }

    public void setFirstName(@NotBlank(message = "First name is required") String firstName) {
        this.firstName = firstName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public @NotBlank(message = "Last name is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotBlank(message = "Last name is required") String lastName) {
        this.lastName = lastName;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getVerificationToken() {
        return verificationToken;
    }

    public void setVerificationToken(String verificationToken) {
        this.verificationToken = verificationToken;
    }
}