package com.andrew.movies.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // TODO Auto-generated method stub
        registry.addMapping("/api/**") // Adjust the mapping to your API endpoints
            .allowedOrigins("http://localhost:3000") // Allow requests from frontend (adjust as needed)
            .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "OPTIONS") // Allow CRUD methods
            .allowedHeaders("*") // Allow all headers
            .allowCredentials(true); // Allow sending cookies
        }
}
