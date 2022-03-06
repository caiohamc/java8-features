package br.com.caioalbuquerque.java8features.util;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 06/03/2022
 */
public class ProblemSolvingUtil {
    private static final Logger LOGGER = Logger.getLogger("ProblemSolvingUtil");

    /**
     * This method works with the first not repeating character
     * @param inputString string to be traversed
     */
    public static void getFirstNotRepeateadCharacter(String inputString){
        // SOLUTION 1
        for (int i=0; i<inputString.length(); i++) {
            if(inputString.indexOf(inputString.charAt(i)) == inputString.lastIndexOf(inputString.charAt(i))) {
                LOGGER.info("String: " + inputString + " | Char: " + inputString.charAt(i));
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
    }

    /**
     * This method works with the indexes of two number in array that
     * matches the target integer with the sum operation.
     * @param nums integers to be used in sum operation.
     * @param target integer to be compared with the result of sum operation.
     */
    public static void getTwoSumIndexes(int[] nums, int target){
        if (nums == null || target < 0) {
            return;
        }

        HashMap<Integer, Integer> auxNums = new HashMap<>();

        for (int i=0; i< nums.length; i++) {
            int current = nums[i]; 					// retrieve specific number of for loop
            auxNums.put(current, i); 				// insert number in hashMap to future verification
            int complement = target - current;

            if (auxNums.containsKey(complement)) {
                LOGGER.info("Target: "+ target + " | Indexes: "
                        + auxNums.get(complement) + " and " + i);
            }
        }
    }

    /**
     * This method works with the max sequence of zeros inside two ones
     * @param number int value to be converted to binary and used in the method operation
     */
    public static void getMaxSequenceOfZerosInsideBinaryGap(int number) {
        LOGGER.info("Integer Number: " + number);

        String numberBinary = Integer.toBinaryString(number);
        LOGGER.info("Binary Number: " + numberBinary);

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

        LOGGER.info("Max zeros: " + max);
    }

    /**
     * This method works with the lower positive integer not present in the array of integers
     * @param inputArray array of integers
     */
    public static void getLowerPositiveIntegerNotPresentInsideIntArray(int[] inputArray){
        if (inputArray == null) {
            return;
        }

        boolean isSearchFactorInsideInputArray;
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

        LOGGER.info("Number: " + searchFactor);
    }
}