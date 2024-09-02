//package com.alfabeto.tls.model;
//
//public class UserRegistrationRequest {
//    private String fullName;
//    private String email;
//    private String encryptedPassword;
//
//    // Getters and Setters
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
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
//public class UserRegistrationRequest {
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String encryptedPassword;
//
//    // Getters and Setters
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
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
//    public String getEncryptedPassword() {
//        return encryptedPassword;
//    }
//
//    public void setEncryptedPassword(String encryptedPassword) {
//        this.encryptedPassword = encryptedPassword;
//    }
//}

package com.aryan.authmaster.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserRegistrationRequest {

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Password is required")
    private String encryptedPassword;

    // Getters and Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }
}
