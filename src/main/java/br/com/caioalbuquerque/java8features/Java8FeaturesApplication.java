package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.example01.*;
import br.com.caioalbuquerque.java8features.example02.*;
import br.com.caioalbuquerque.java8features.example03.TimeUtil;
import br.com.caioalbuquerque.java8features.example04.StaticMethodInsideInterfaceImpl;
import br.com.caioalbuquerque.java8features.example05.StreamsUtil;
import br.com.caioalbuquerque.java8features.example06.BinaryTree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;
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
		example03();
		example04();
		example05();
		example06();
	}

	/** StringJoiner */
	private void example01() {
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("1. StringJoiner Examples");
		LOGGER.info(" ");
		String firstCustomStringCreated = StringUtil.createStringUsingStringJoiner(":");
		LOGGER.info(" ");
		String secondCustomStringCreated = StringUtil.createStringUsingStringJoiner(";","[",")");
	}

	/** Lambda */
	private void example02() {
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("2. Lambda Functions Examples ");

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

	/** Clock */
	private void example03(){
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("3. Clock Examples");
		LOGGER.info(" ");
		Long currentTimeMillis = TimeUtil.getCurrentTimeMillis();
		LOGGER.info("Current time millis: " + currentTimeMillis);
		Instant instant = TimeUtil.getInstant();
		LOGGER.info("Instant: " + instant);
	}

	/** Interface with Static Method */
	private void example04(){
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("4. Interface with static method");
		StaticMethodInsideInterfaceImpl staticMethodInsideInterface = new StaticMethodInsideInterfaceImpl();
		String returnedValue = null;

		LOGGER.info(" ");
		LOGGER.info("Calling static method from an interface with no return and no params: ");
		staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnNoParams();

		LOGGER.info(" ");
		LOGGER.info("Calling static method from an interface with no return and one param: ");
		staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnOneParam("foo");

		LOGGER.info(" ");
		LOGGER.info("Calling static method from an interface with no return and two params: ");
		staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnTwoParams("foo", "bar");

		LOGGER.info(" ");
		LOGGER.info("Calling static method from an interface with return and no params: ");
		LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithReturnNoParams());

		LOGGER.info(" ");
		LOGGER.info("Calling static method from an interface with return and one param: ");
		LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithResultOneParam("foo"));

		LOGGER.info(" ");
		LOGGER.info("Calling static method from an interface with return and two params: ");
		LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithResultTwoParams("foo", "bar"));
	}

	/* Streams */
	private void example05(){
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("5. Java Streams API");

		LOGGER.info(" ");
		LOGGER.info("Calling getFullIntStream() - Range (1, 10)");
		StreamsUtil.getFullIntStream(1, 10);

		LOGGER.info(" ");
		LOGGER.info("Calling getSkippedIntStream() - Range (1, 10) Skip(5)");
		StreamsUtil.getSkippedIntStream(1, 10, 5);
	}

	/* Binary Tree */
	private void example06(){
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("6. Binary Tree Operations");

		LOGGER.info(" ");
		LOGGER.info("Retrieving singleton instance of the statically created binary tree object");
		BinaryTree binaryTree = BinaryTree.getInstance();
		LOGGER.info("Binary Tree: " + binaryTree);

		LOGGER.info(" ");
		LOGGER.info("Filling dinamically a binary tree with 6 elements from left to right filling all childs as possible");
		binaryTree.add(1);
		binaryTree.add(2);
		binaryTree.add(3);
		binaryTree.add(4);
		binaryTree.add(5);
		binaryTree.add(6);
	}
}