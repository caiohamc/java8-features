package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.example01.StringUtil;
import br.com.caioalbuquerque.java8features.example02.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
		example01();
		example02();
	}

	private void example01() {
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("1. StringJoiner Example");
		LOGGER.info(" ");
		String firstCustomStringCreated = StringUtil.createStringUsingStringJoiner(":");
		LOGGER.info(" ");
		String secondCustomStringCreated = StringUtil.createStringUsingStringJoiner(";","[",")");
	}

	private void example02() {
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("2. Lambda Functions");

		LOGGER.info(" ");
		LOGGER.info("Calling lambda function with no return and no params");
		LOGGER.info("lfNoReturnNoParams.executeNoReturnNoParams(): ");
		LambdaFunctionsNoReturnNoParams lfNoReturnNoParams = () -> LOGGER.info("Hello Lambda!");
		lfNoReturnNoParams.executeNoReturnNoParams();

		LOGGER.info(" ");
		LOGGER.info("Calling lambda function with no return and one param");
		LOGGER.info("lfNoReturnOneParam.executeNoReturnOneParam(param1): ");
		LambdaFunctionsNoReturnOneParam lfNoReturnOneParam = (param1) -> LOGGER.info("param1: " + param1);
		lfNoReturnOneParam.executeNoReturnOneParam("foo");

		LOGGER.info(" ");
		LOGGER.info("Calling lambda function with no return and two params");
		LOGGER.info("lfNoReturnTwoParams.executeNoReturnTwoParams(param1, param2): ");
		LambdaFunctionsNoReturnTwoParams lfNoReturnTwoParams = (param1, param2) -> {
			LOGGER.info("param1: " + param1);
			LOGGER.info("param2: " + param2);
		};
		lfNoReturnTwoParams.executeNoReturnTwoParams("foo", "bar");

		LOGGER.info(" ");
		LOGGER.info("Calling lambda function with return and no params");
		LOGGER.info("lfWithReturnNoParams.executeWithReturnNoParams(): ");
		LambdaFunctionsWithReturnNoParams lfWithReturnNoParams = () -> "Hello Lambda!";
		LOGGER.info("return: " + lfWithReturnNoParams.executeWithReturnNoParams());

		LOGGER.info(" ");
		LOGGER.info("Calling lambda function with return and one param");
		LOGGER.info("lfWithReturnOneParam.executeWithResultOneParam(param1): ");
		LambdaFunctionsWithReturnOneParam lfWithReturnOneParam = (param1) -> {
			LOGGER.info("param1: " + param1);
			return param1;
		};
		LOGGER.info("return (param1): " + lfWithReturnOneParam.executeWithReturnOneParam("foo"));

		LOGGER.info(" ");
		LOGGER.info("Calling lambda function with return and two params");
		LOGGER.info("lfWithReturnTwoParams.executeWithReturnTwoParams(param1, param2): ");
		LambdaFunctionsWithReturnTwoParams lfWithReturnTwoParams = (param1, param2) -> {
			LOGGER.info("param1: " + param1);
			LOGGER.info("param2: " + param2);
			return param1 + " + " + param2;
		};
		LOGGER.info("return (param1 + param2): " + lfWithReturnTwoParams.executeWithReturnTwoParams("foo", "bar"));
	}
}