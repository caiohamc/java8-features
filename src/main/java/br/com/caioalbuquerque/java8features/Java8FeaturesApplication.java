package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.model.binarytree.BinaryTree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 11/02/2022
 */
@SpringBootApplication
@EnableScheduling
public class Java8FeaturesApplication implements CommandLineRunner {
	private static final Logger LOGGER = Logger.getLogger("MAIN");

	public static void main(String[] args) {
		SpringApplication.run(Java8FeaturesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		runJobs();
		runBinaryTreeCreation();
	}

	/* Jobs */
	private void runJobs(){
		LOGGER.info("---------------------");
		LOGGER.info("JOBs EXECUTION");
		LOGGER.info(" ");
		LOGGER.info("Running jobs with a few parameters ...");
		LOGGER.info("---------------------");
	}

	/* Binary Tree */
	private void runBinaryTreeCreation(){
		LOGGER.info("---------------------");
		LOGGER.info("BINARY TREE PROBLEM SOLVING");

		LOGGER.info(" ");
		LOGGER.info("Retrieving singleton instance of the statically created binary tree object");
		BinaryTree binaryTree = BinaryTree.getInstance();
		LOGGER.info("Binary Tree: " + binaryTree);

		LOGGER.info(" ");
		LOGGER.info("Filling dinamically a binary tree with a few elements");
		LOGGER.info(" ");
		binaryTree.addNode(5);
		binaryTree.addNode(3);
		binaryTree.addNode(4);
		binaryTree.addNode(1);
		binaryTree.addNode(8);
		binaryTree.addNode(9);
		binaryTree.addNode(2);
	}
}