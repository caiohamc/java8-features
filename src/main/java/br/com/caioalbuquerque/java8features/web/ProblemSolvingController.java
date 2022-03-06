package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.util.ProblemSolvingUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/firstcharnotrepeated/{inputString}")
    public Character getFirstNotRepeateadCharacter(@PathVariable("inputString") String inputString){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve first not repeated char ");
        Character result = ProblemSolvingUtil.getFirstNotRepeateadCharacter(inputString);
        LOGGER.info("-----------------------------------------------------------------------------------------");
        return result;
    }

    @GetMapping("/twoSumIndexes/{target}")
    public String getTwoSumIndexes(@PathVariable("target") Integer target){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve two sum indexes ");
        int[] arrayOfIntegers = { 2, 7, 11, 19};
        String result = ProblemSolvingUtil.getTwoSumIndexes(arrayOfIntegers, target);
        LOGGER.info("-----------------------------------------------------------------------------------------");
        return result;
    }

    @GetMapping("/maxSequenceOfZerosInsideBinaryGap/{inputNumber}")
    public Integer getMaxSequenceOfZerosInsideBinaryGap(@PathVariable("inputNumber") Integer inputNumber) {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve max sequence of zeros inside two ones ");
        Integer result = ProblemSolvingUtil.getMaxSequenceOfZerosInsideBinaryGap(inputNumber);
        LOGGER.info("-----------------------------------------------------------------------------------------");
        return result;
    }

    @GetMapping("/lowerPositiveIntegerNotPresentInsideIntArray")
    public Integer getLowerPositiveIntegerNotPresentInsideIntArray(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve lower positive integer not present inside int array");
        int[] inputIntArray = { 1, 3, 7, 4, 5, 2};
        for(int intValue : inputIntArray)
            LOGGER.info("InputIntArray: " + intValue);
        Integer result = ProblemSolvingUtil.getLowerPositiveIntegerNotPresentInsideIntArray(inputIntArray);
        LOGGER.info("-----------------------------------------------------------------------------------------");
        return result;
    }
}