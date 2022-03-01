package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.model.staticmethdinterface.StaticMethodInsideInterfaceImpl;
import br.com.caioalbuquerque.java8features.util.StreamsUtil;
import br.com.caioalbuquerque.java8features.model.binarytree.BinaryTree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashMap;
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
		example04();
		example05();
		example06();
		example07();

		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("PROBLEM 01 - First Not Repeating Char");

		String s1 = "aaabcddef", s2 = "abcabcabcc", s3 = "abbcdbcdef";
		Character problem01_answer1 = problem01_firstNotRepeatingCharacter(s1);
		Character problem01_answer2 = problem01_firstNotRepeatingCharacter(s2);
		Character problem01_answer3 = problem01_firstNotRepeatingCharacter(s3);
		LOGGER.info("String (" + s1 + ") has first not repeating char (" + problem01_answer1 + ")");
		LOGGER.info("String (" + s2 + ") has first not repeating char (" + problem01_answer2 + ")");
		LOGGER.info("String (" + s3 + ") has first not repeating char (" + problem01_answer3 + ")");

		LOGGER.info("---------------------");
		LOGGER.info("PROBLEM 02 - Two Sum");
		int[] n1 = { 2, 7, 11, 19}, n2 = { 11, 19, 21, 25, 31, 33},  n3 = { 2, 3, 6, 7, 9};
		int[] problem02_answer1 = problem02_twoSum(n1, 9);
		int[] problem02_answer2 = problem02_twoSum(n2, 46);
		int[] problem02_answer3 = problem02_twoSum(n3, 10);
		LOGGER.info("Índices: " + problem02_answer1[0] + " e " + problem02_answer1[1]);
		LOGGER.info("Índices: " + problem02_answer2[0] + " e " + problem02_answer2[1]);
		LOGGER.info("Índices: " + problem02_answer3[0] + " e " + problem02_answer3[1]);
	}

	/* Streams */
	private void example04(){
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("4. Java Streams API");

		LOGGER.info(" ");
		LOGGER.info("Calling getFullIntStream() - Range (1, 10)");
		StreamsUtil.getFullIntStream(1, 10);

		LOGGER.info(" ");
		LOGGER.info("Calling getSkippedIntStream() - Range (1, 10) Skip(5)");
		StreamsUtil.getSkippedIntStream(1, 10, 5);
	}

	/* Interface with Static Method */
	private void example05(){
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("5. Interface with static method");
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

	/* Data Structures - Binary Tree */
	private void example06(){
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("6. Data Structures - Binary Tree Operations");

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

		LOGGER.info("Searching for maximum and minimum keys ");
		binaryTree.getMinKey(binaryTree.getRoot());
		binaryTree.getMaxKey(binaryTree.getRoot());

		LOGGER.info(" ");
		LOGGER.info("Searching for the height of the binary tree ");
		LOGGER.info("   Height: " + binaryTree.getHeight(binaryTree.getRoot()));
		binaryTree.getHeight(binaryTree.getRoot());
	}

	/* Jobs */
	private void example07(){
		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("7. Jobs Execution");
		LOGGER.info(" ");
		LOGGER.info("Running jobs with a few parameters ...");
	}

	/* Problem Solving 01 - First Not Repeating Character */
	private Character problem01_firstNotRepeatingCharacter(String inputString){
		// SOLUTION 1
		for (int i=0; i<inputString.length(); i++) {
			if(inputString.indexOf(inputString.charAt(i)) == inputString.lastIndexOf(inputString.charAt(i))) {
				return inputString.charAt(i);
			}
		}

		// SOLUTION 2
		//HashMap<Character, Integer> charCount = new HashMap<>();
		//for (int i=0; i<inputString.length(); i++) {
		//	Character c = inputString.charAt(i);
		//	if(charCount.containsKey(c))
		//		charCount.put(c, charCount.get(c) + 1);
		//	else
		//		charCount.put(c, 1);
		//}
		//for (int i=0; i< inputString.length(); i++) {
		//	Character c = inputString.charAt(i);
		//	if(charCount.get(c) == 1)
		//		return c;
		//}

		return '_';
	}

	private int[] problem02_twoSum(int[] nums, int target){
		if (nums == null || target < 0) {
			return null;
		}

		HashMap<Integer, Integer> auxNums = new HashMap<>();

		for (int i=0; i< nums.length; i++) {
			int current = nums[i]; 					// retrieve specific number of for loop
			auxNums.put(current, i); 				// insert number in hashMap to future verification
			int complement = target - current;

			if (auxNums.containsKey(complement)){
				return new int[]{auxNums.get(complement), i};
			}
		}

		return null;
	}
}