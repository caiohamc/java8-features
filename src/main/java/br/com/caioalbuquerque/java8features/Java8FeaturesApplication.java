package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.StringJoiner;

@SpringBootApplication
@Slf4j
public class Java8FeaturesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Java8FeaturesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.info("-----------------------------------------------------------------------------------------");

		// ----- ITEM 01 -----
		StringJoiner x = new StringJoiner(";");
		x.add("3a");
		x.add("#");
		log.info("String created with StringJoiner: {}", x.toString());

		log.info("-----------------------------------------------------------------------------------------");
	}
}
