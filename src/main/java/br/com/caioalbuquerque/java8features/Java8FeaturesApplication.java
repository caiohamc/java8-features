package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.model.binarytree.BinaryTree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Locale;
import java.util.logging.Logger;

import javax.money.Monetary;
import javax.money.MonetaryAmount;
import javax.money.format.MonetaryFormats;

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
		getConvertedLambda("private void add(int x, int y) { System.out.println(x+y); }");

		MonetaryAmount monetaryAmount = Monetary
			.getDefaultAmountFactory()
			.setCurrency(Monetary.getCurrency("BRL"))
			.setNumber(1231234.56)
			.create();

		String formattedMonetaryAmount = MonetaryFormats.getAmountFormat(new Locale("pt", "BR")).format(monetaryAmount);
		System.out.println("-> " + formattedMonetaryAmount.replace("BRL", "R$"));

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

	private String getConvertedLambda(String nonLambdaCodeText){
		/**
		 * nonLambdaCodeText = "private void add(int x, int y) { System.out.println(x+y); }"
		 */
		String convertedLambda;

		// Step 1 - Removendo modificadores de acesso
		convertedLambda = nonLambdaCodeText.substring(8);   /** "void add(int x, int y) { System.out.println(x+y); }" */
		// Step 2 - Removendo tipo de retorno
		convertedLambda = convertedLambda.substring(5);     /** "add(int x, int y) { System.out.println(x+y); }" */
		// Step 3 - Removendo nome do método
		convertedLambda = convertedLambda.substring(3);     /** "(int x, int y) { System.out.println(x+y); }" */
		// Step 4 - Inserindo símbolo ->
		String[] aux = convertedLambda.split("\\{");
		convertedLambda = aux[0] + "-> {" + aux[1];                  /** "(int x, int y) -> { System.out.println(x+y); }" */
		// Step 5 - Removendo tipos de parâmetros e chaves
		convertedLambda = convertedLambda
			.replace("int ", "");                   /** "(x, y) -> { System.out.println(x+y); }" */
		convertedLambda = convertedLambda
			.replace("{ ", "");                     /** "(int x, int y) -> System.out.println(x+y); }" */
		convertedLambda = convertedLambda
			.replace(" }", "");                     /** "(int x, int y) -> System.out.println(x+y);" */

		return convertedLambda; /** (int x, int y) -> System.out.println(x+y); */
	}
}