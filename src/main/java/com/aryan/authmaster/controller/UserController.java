//package com.alfabeto.tls.controller;
//
//import com.alfabeto.tls.model.LoginRequest;
//import com.alfabeto.tls.model.PasswordResetRequest;
//import com.alfabeto.tls.model.UserRegistrationRequest;
//import com.alfabeto.tls.service.UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
//
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequest request) {
//        try {
//            userService.registerUser(request);
//            return ResponseEntity.ok("User registered successfully");
//        } catch (Exception e) {
//            logger.error("Registration failed: ", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration failed: " + e.getMessage());
//        }
//    }
//
//    @GetMapping("/verify")
//    public ResponseEntity<String> verifyUser(@RequestParam String token) {
//        userService.verifyUser(token);
//        return ResponseEntity.ok("User verified successfully.");
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> loginUser(@RequestBody LoginRequest request) {
//        userService.loginUser(request);
//        return ResponseEntity.ok("Login successful.");
//    }
//
//    @PostMapping("/forgot-password")
//    public ResponseEntity<String> forgotPassword(@RequestBody PasswordResetRequest request) {
//        userService.processForgotPassword(request.getEmail());
//        return ResponseEntity.ok("Password reset email sent. Please check your inbox.");
//    }
//
//    @PostMapping("/reset-password")
//    public ResponseEntity<String> resetPassword(@RequestParam String token, @RequestBody PasswordResetRequest request) {
//        userService.resetPassword(token, request.getEncryptedPassword());
//        return ResponseEntity.ok("Password reset successful.");
//    }
//}


//package com.alfabeto.tls.controller;
//
//import com.alfabeto.tls.model.LoginRequest;
//import com.alfabeto.tls.model.PasswordResetRequest;
//import com.alfabeto.tls.model.UserRegistrationRequest;
//import com.alfabeto.tls.service.UserService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/users")
//public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
//
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody UserRegistrationRequest request) {
//        try {
//            userService.registerUser(request);
//            return ResponseEntity.ok("User registered successfully.");
//        } catch (Exception e) {
//            logger.error("Registration failed: ", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration failed: " + e.getMessage());
//        }
//    }
//
//    @GetMapping("/verify")
//    public ResponseEntity<String> verifyUser(@RequestParam String token) {
//        try {
//            userService.verifyUser(token);
//            return ResponseEntity.ok("User verified successfully.");
//        } catch (Exception e) {
//            logger.error("Verification failed: ", e);
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Verification failed: " + e.getMessage());
//        }
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> loginUser(@RequestBody LoginRequest request) {
//        try {
//            userService.loginUser(request);
//            return ResponseEntity.ok("Login successful.");
//        } catch (Exception e) {
//            logger.error("Login failed: ", e);
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed: " + e.getMessage());
//        }
//    }
//
//    @PostMapping("/forgot-password")
//    public ResponseEntity<String> forgotPassword(@RequestBody PasswordResetRequest request) {
//        try {
//            userService.processForgotPassword(request.getEmail());
//            return ResponseEntity.ok("Password reset email sent. Please check your inbox.");
//        } catch (Exception e) {
//            logger.error("Forgot password failed: ", e);
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Forgot password failed: " + e.getMessage());
//        }
//    }
//
//    @PostMapping("/reset-password")
//    public ResponseEntity<String> resetPassword(@RequestParam String token, @RequestBody PasswordResetRequest request) {
//        try {
//            userService.resetPassword(token, request.getEncryptedPassword());
//            return ResponseEntity.ok("Password reset successful.");
//        } catch (Exception e) {
//            logger.error("Password reset failed: ", e);
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Password reset failed: " + e.getMessage());
//        }
//    }
//}

package com.aryan.authmaster.controller;

import com.aryan.authmaster.model.LoginRequest;
import com.aryan.authmaster.model.LoginResponse;
import com.aryan.authmaster.model.UserRegistrationRequest;
import com.aryan.authmaster.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@Valid @RequestBody UserRegistrationRequest request, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            String errorMessage = bindingResult.getFieldError().getDefaultMessage();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Registration failed: " + errorMessage);
        }

        try {
            userService.registerUser(request);
            return ResponseEntity.ok("User registered successfully");
        } catch (Exception e) {
            logger.error("Registration failed: ", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Registration failed: " + e.getMessage());
        }
    }

    @GetMapping("/verify")
    public ResponseEntity<String> verifyUser(@RequestParam("token") String token) {
        try {
            userService.verifyUser(token);
            return ResponseEntity.ok("User verified successfully");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@Valid @RequestBody LoginRequest request) {
        try {
            String token = userService.loginUser(request);
            return ResponseEntity.ok(new LoginResponse("Login successful", token));
        } catch (Exception e) {
            logger.error("Login failed: ", e);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Login failed: " + e.getMessage());
        }
    }
}
