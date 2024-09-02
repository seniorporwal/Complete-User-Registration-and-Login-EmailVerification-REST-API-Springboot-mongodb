package com.aryan.authmaster.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Disable CSRF (for APIs; ensure to enable CSRF in forms)
                .cors(Customizer.withDefaults()) // Enable CORS with default settings
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/api/users/register", "/api/users/verify", "/api/users/login", "/api/users/reset-password").permitAll() // Public endpoints
                        .anyRequest().authenticated() // All other endpoints require authentication
                );

        return http.build();
    }
}