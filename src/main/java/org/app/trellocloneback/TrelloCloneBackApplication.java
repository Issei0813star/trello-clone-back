package org.app.trellocloneback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class TrelloCloneBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrelloCloneBackApplication.class, args);
	}

}
