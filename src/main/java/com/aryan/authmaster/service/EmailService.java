//package com.alfabeto.tls.service;
//
//import com.alfabeto.tls.model.User;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class EmailService {
//
//    private final JavaMailSender mailSender;
//
//    @Value("${spring.mail.username}")
//    private String fromEmail;
//
//    public EmailService(JavaMailSender mailSender) {
//        this.mailSender = mailSender;
//    }
//
//    public void sendVerificationEmail(User user) {
//        try {
//            SimpleMailMessage message = new SimpleMailMessage();
//            message.setFrom(fromEmail);
//            message.setTo(user.getEmail());
//            message.setSubject("Email Verification");
//            message.setText("Please verify your email using this link: http://localhost:8080/api/users/verify?token=" + user.getVerificationToken());
//            mailSender.send(message);
//        } catch (Exception e) {
//            // Log the exception for debugging
//            e.printStackTrace();
//            throw new RuntimeException("Failed to send verification email: " + e.getMessage());
//        }
//    }
//
//    public void sendPasswordResetEmail(User user) {
//        try {
//            SimpleMailMessage message = new SimpleMailMessage();
//            message.setFrom(fromEmail);
//            message.setTo(user.getEmail());
//            message.setSubject("Password Reset Request");
//            message.setText("Please reset your password using this link: http://localhost:8080/api/users/reset-password?token=" + resetToken);
//            mailSender.send(message);
//        } catch (Exception e) {
//            // Log the exception for debugging
//            e.printStackTrace();
//            throw new RuntimeException("Failed to send password reset email: " + e.getMessage());
//        }
//    }
//}
package com.aryan.authmaster.service;

import com.aryan.authmaster.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    @Value("${spring.mail.username}")
    private String fromEmail;

    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendVerificationEmail(User user) {
        try {
            String verificationUrl = "http://localhost:8080/api/users/verify?token=" + user.getVerificationToken();
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(fromEmail);
            message.setTo(user.getEmail());
            message.setSubject("Email Verification");
            message.setText("Please verify your email using this link: " + verificationUrl);
            mailSender.send(message);
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
            throw new RuntimeException("Failed to send verification email: " + e.getMessage());
        }
    }

    public void sendPasswordResetEmail(User user) {
        try {
            String resetUrl = "http://localhost:8080/api/users/reset-password?token=" + user.getVerificationToken();
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(fromEmail);
            message.setTo(user.getEmail());
            message.setSubject("Password Reset Request");
            message.setText("Please reset your password using this link: " + resetUrl);
            mailSender.send(message);
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
            throw new RuntimeException("Failed to send password reset email: " + e.getMessage());
        }
    }
}
