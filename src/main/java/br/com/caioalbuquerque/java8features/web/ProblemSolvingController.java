package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.util.ProblemSolvingUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 06/03/2022
 */
@RestController
@RequestMapping("/problemsolving")
public class ProblemSolvingController {
    private static final Logger LOGGER = Logger.getLogger("ProblemSolvingController");

    @GetMapping("/firstcharnotrepeated")
    public static void getFirstNotRepeateadCharacter(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve first not repeated char ");
        ProblemSolvingUtil.getFirstNotRepeateadCharacter("aaabcddef");
        ProblemSolvingUtil.getFirstNotRepeateadCharacter("abcabcabcc");
        ProblemSolvingUtil.getFirstNotRepeateadCharacter("abbcdbcdef");
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/twoSumIndexes")
    public static void getTwoSumIndexes(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve first not repeated char ");
        int[] n1 = { 2, 7, 11, 19}, n2 = { 11, 19, 21, 25, 31, 33},  n3 = { 2, 3, 6, 7, 9};
        ProblemSolvingUtil.getTwoSumIndexes(n1, 9);
        ProblemSolvingUtil.getTwoSumIndexes(n2, 46);
        ProblemSolvingUtil.getTwoSumIndexes(n3, 10);
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/maxSequenceOfZerosInsideBinaryGap")
    public static void getMaxSequenceOfZerosInsideBinaryGap(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve max sequence of zeros inside two ones ");
        ProblemSolvingUtil.getMaxSequenceOfZerosInsideBinaryGap(1435);
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/lowerPositiveIntegerNotPresentInsideIntArray")
    public static void getLowerPositiveIntegerNotPresentInsideIntArray(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve lower positive integer not present inside int array");
        int[] inputIntArray = { 1, 3, 6, 4, 1, 2};
        for(int intValue : inputIntArray)
            LOGGER.info("InputIntArray: " + intValue);
        ProblemSolvingUtil.getLowerPositiveIntegerNotPresentInsideIntArray(inputIntArray);
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }
}