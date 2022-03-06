package br.com.caioalbuquerque.java8features.util;

import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Caio Albuquerque
 * @since 06/03/2022
 */
public class RecursionUtil {

    /**
     * This method retrieves the factorial of an integer number
     * @param number to be used in factorial
     * @return result of the factorial calculation
     */
    public static Integer getFactorialOf(@PathVariable Integer number){
        if (number == null) {
            return -1;
        } else if (number >= 1) {
            return number * getFactorialOf(number - 1);
        } else if (number == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    /**
     * This method retrieves the fibonacci at an integer number index
     * @param number of the index of fibonacci operation
     * @return result of fibonacci operation
     */
    public static Integer getFibonacciAt(Integer number){
        if (number == null) {
            return -1;
        } else if (number >= 3) {
            return getFibonacciAt(number - 1) + getFibonacciAt(number - 2);
        } else if (number > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}