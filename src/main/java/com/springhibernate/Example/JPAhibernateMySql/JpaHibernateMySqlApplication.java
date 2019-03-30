package com.springhibernate.Example.JPAhibernateMySql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.springhibernate.Example.JPAhibernateMySql.Repository")
@SpringBootApplication
public class JpaHibernateMySqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaHibernateMySqlApplication.class, args);
	}

}
