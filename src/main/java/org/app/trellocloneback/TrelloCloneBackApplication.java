package org.app.trellocloneback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}, scanBasePackages={"org.app.trellocloneback"})
@EnableJpaRepositories("org.app.trellocloneback.repository")
@EntityScan("org.app.trellocloneback.entity")
public class TrelloCloneBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrelloCloneBackApplication.class, args);
	}

}
