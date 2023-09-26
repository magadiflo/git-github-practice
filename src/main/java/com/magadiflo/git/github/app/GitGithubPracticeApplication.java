package com.magadiflo.git.github.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GitGithubPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitGithubPracticeApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            System.out.println("¡¡¡...Iniciando aplicación...!!!");
        };
    }

}
