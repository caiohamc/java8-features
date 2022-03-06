package br.com.caioalbuquerque.java8features;

import br.com.caioalbuquerque.java8features.model.binarytree.TreeNode;
import br.com.caioalbuquerque.java8features.model.staticmethdinterface.StaticMethodInsideInterfaceImpl;
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
		example05();
		example06();
		example07();

		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("Print In Order Binary Tree");
		printInOrder(BinaryTree.getInstance().getRoot());

		LOGGER.info("Print Post Order Binary Tree");
		printPostOrder(BinaryTree.getInstance().getRoot());

		LOGGER.info("Print Pre Order Binary Tree");
		printPreOrder(BinaryTree.getInstance().getRoot());

		LOGGER.info("-----------------------------------------------------------------------------------------");
		LOGGER.info("PROBLEM SOLVING");

		LOGGER.info(" ");
		LOGGER.info("PROBLEM 01 - First Not Repeating Character");
		String s1 = "aaabcddef", s2 = "abcabcabcc", s3 = "abbcdbcdef";
		Character problem01_answer1 = getFirstNotRepeatingCharacter(s1);
		Character problem01_answer2 = getFirstNotRepeatingCharacter(s2);
		Character problem01_answer3 = getFirstNotRepeatingCharacter(s3);
		LOGGER.info("String (" + s1 + ") has first not repeating char (" + problem01_answer1 + ")");
		LOGGER.info("String (" + s2 + ") has first not repeating char (" + problem01_answer2 + ")");
		LOGGER.info("String (" + s3 + ") has first not repeating char (" + problem01_answer3 + ")");

		LOGGER.info("---------------------");
		LOGGER.info("PROBLEM 02 - Two Sum");
		int[] n1 = { 2, 7, 11, 19}, n2 = { 11, 19, 21, 25, 31, 33},  n3 = { 2, 3, 6, 7, 9};
		int[] problem02_answer1 = getTwoSumIndexes(n1, 9);
		int[] problem02_answer2 = getTwoSumIndexes(n2, 46);
		int[] problem02_answer3 = getTwoSumIndexes(n3, 10);
		LOGGER.info("Índices: " + problem02_answer1[0] + " e " + problem02_answer1[1]);
		LOGGER.info("Índices: " + problem02_answer2[0] + " e " + problem02_answer2[1]);
		LOGGER.info("Índices: " + problem02_answer3[0] + " e " + problem02_answer3[1]);

		LOGGER.info("---------------------");
		LOGGER.info("PROBLEM 03 - Bigger Sequence Of Zeros Between Two Ones");
		int numberOfZeros = getMaxSequenceOfZerosInsideBinaryGap(Integer.toBinaryString(1435));
		LOGGER.info("Max number of zeros inside binary gap: " + numberOfZeros);

		LOGGER.info("---------------------");
		LOGGER.info("PROBLEM 04 - Lower Positive Integer Not Inside Int Array");
		int[] inputIntArray = { 1, 3, 6, 4, 1, 2};
		for(int x : inputIntArray) {
			LOGGER.info("InputIntArray: " + x);
		}
		int lowerPositiveNumberNotInsideIntArray = getLowerPositiveIntegerNotInsideIntArray(inputIntArray);
		LOGGER.info("Number: " + lowerPositiveNumberNotInsideIntArray);

		LOGGER.info("---------------------");
		LOGGER.info("RECURSION PROBLEMS");

		LOGGER.info(" ");
		LOGGER.info("PROBLEM 01 - Factorials");
		LOGGER.info("Fatorial de -2: " + getFactorialOf(-2));
		LOGGER.info("Fatorial de 0: " + getFactorialOf(0));
		LOGGER.info("Fatorial de 1: " + getFactorialOf(1));
		LOGGER.info("Fatorial de 5: " + getFactorialOf(5));
	}

	/**
	 * @param numberBinary int value in a binary representation
	 * @return max sequence of zeros inside ones
	 */
	private int getMaxSequenceOfZerosInsideBinaryGap(String numberBinary) {
		LOGGER.info("numberBinary: " + numberBinary);

		if (numberBinary == null || numberBinary.isEmpty()) {
			return -1;
		}

		int max=0;
		int counter=0;
		boolean isBinaryGap = false;

		for (int i=0; i<numberBinary.length(); i++) {
			if(numberBinary.charAt(i) == '0') {
				if (isBinaryGap) {
					counter++;
				}
			}

			if(numberBinary.charAt(i) == '1') {
				if(isBinaryGap) {
					if(counter > max) {
						max = counter;
					}
					counter=0;
				}

				if(!isBinaryGap){
					isBinaryGap = true;
				}
			}
		}

		LOGGER.info("max: " + max);
		return max;
	}

	/**
	 * @param inputArray array of integers
	 * @return lower positive not in the array
	 */
	private int getLowerPositiveIntegerNotInsideIntArray(int[] inputArray){
		if (inputArray == null) {
			return -1;
		}

		boolean isSearchFactorInsideInputArray = false;
		boolean keepSearching = true;
		int searchFactor = 1;
		int counter;

		while (keepSearching) {
			isSearchFactorInsideInputArray = false;
			counter = 0;

			for(int i=0; i<inputArray.length; i++) {
				LOGGER.info("inputArray[i]: " + inputArray[i]);

				if (inputArray[i] == searchFactor) {
					searchFactor++;
					i = inputArray.length;
					isSearchFactorInsideInputArray = true;
					LOGGER.info("searchFactor: " + searchFactor);
				}

				counter++;
				LOGGER.info("counter: " + counter);

				if(counter == inputArray.length && !isSearchFactorInsideInputArray) {
					keepSearching = false;
				}
			}
		}

		return searchFactor;
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

	private void printInOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		printInOrder(node.getLeftChild()); 	// recur on left subtree
		LOGGER.info(node.getKey() + " ");
		printInOrder(node.getRightChild()); 	// recur on right subtree
	}

	private void printPostOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		printPostOrder(node.getLeftChild()); 	// recur on left subtree
		printPostOrder(node.getRightChild()); 	// recur on right subtree
		LOGGER.info(node.getKey() + " ");
	}

	private void printPreOrder(TreeNode node) {
		if (node == null) {
			return;
		}

		LOGGER.info(node.getKey() + " ");
		printPreOrder(node.getLeftChild()); 	// recur on left subtree
		printPreOrder(node.getRightChild()); 	// recur on right subtree
	}

	/**
	 * Problem Solving 01 - This method retrieves the first not repeating character
	 * @param inputString string to be traversed
	 * @return the founded first not repeating char
	 */
	private Character getFirstNotRepeatingCharacter(String inputString){
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

	/**
	 * Problem Solving 02 - This method retrieves the indexes of two number in
	 * array that matches the target integer with the sum operation.
	 * @param nums integers to be used in sum operation.
	 * @param target integer to be compared with the result of sum operation.
	 * @return two indexes of two integers that matches the conditions
	 */
	private int[] getTwoSumIndexes(int[] nums, int target){
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

	/**
	 * Recursion 01 - This method retrieves the factorial of an integer number
	 * @param number to be used in factorial
	 * @return result of the factorial calculation
	 */
	private int getFactorialOf(int number) {
		if (number >= 1) {
			return number * getFactorialOf(number - 1);
		} else if (number == 0) {
			return 1;
		} else {
			return -1;
		}
	}
}