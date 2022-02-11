package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 11/02/2022
 */
@SpringBootApplication
public class Java8FeaturesApplication implements CommandLineRunner {

	private final Logger LOGGER = Logger.getLogger("MAIN");
	public static void main(String[] args) {
		SpringApplication.run(Java8FeaturesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("1. StringJoiner Example");
		String firstCustomStringCreated = StringUtil.createStringUsingStringJoiner(":");
		String secondCustomStringCreated = StringUtil.createStringUsingStringJoiner(";","[",")");
		LOGGER.info("-----------------------------------------------------------------------------------------");
	}
}