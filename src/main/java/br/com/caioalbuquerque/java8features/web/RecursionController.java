package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.util.RecursionUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 06/03/2022
 */
@RestController
@RequestMapping("/recursion")
public class RecursionController {
    private static final Logger LOGGER = Logger.getLogger("RecursionController");

    @GetMapping("/factorial/{id}")
    public static Integer getFactorialOf(Integer number){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve factorials ");
        LOGGER.info("Factorial of " + number + ": " + RecursionUtil.getFactorialOf(number));
        LOGGER.info("-----------------------------------------------------------------------------------------");
        return RecursionUtil.getFactorialOf(number);
    }

    @GetMapping("/fibonacci/{id}")
    public static Integer getFibonacciAt(Integer number){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve fibonaccis ");
        LOGGER.info("Fibonacci at " + number + ": " + RecursionUtil.getFibonacciAt(number));
        LOGGER.info("-----------------------------------------------------------------------------------------");
        return RecursionUtil.getFibonacciAt(number);
    }
}