package com.example.springbootmovie.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //Path uploadDir = Paths.get("/Users/chaabane/Downloads/springboot-movie-master/movie-images");
        //String uploadPath = uploadDir.toFile().getAbsolutePath();
        //registry.addResourceHandler("/movie-images/**").addResourceLocations("file:/" + uploadPath + "/");
        registry.addResourceHandler("/movie-images/**").addResourceLocations("file:/Users/chaabane/Downloads/SpringBoot/movie-images/");
    }
}
