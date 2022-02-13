package br.com.caioalbuquerque.java8features.example04;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 12/02/2022
 */
public interface StaticMethodInsideInterface {
    Logger LOGGER = Logger.getLogger("StaticMethodInsideInterface");

    static void executeSomethingNoReturnNoParam(){
        LOGGER.info("Hello Value printed with static method inside interface with no return and no params");
    }

    static void executeSomethingNoReturnOneParam(String param1){
        LOGGER.info("Hello Value printed with static method inside interface with no return and one param");
        LOGGER.info("param1: " + param1);
    }

    static void executeSomethingNoReturnTwoParam(String param1, String param2){
        LOGGER.info("Hello Value printed with static method inside interface with no return and two params");
        LOGGER.info("param1: " + param1);
        LOGGER.info("param2: " + param2);
    }

    static String executeSomethingWithReturnNoParams(){
        return "Hello Value returned from static method inside interface with return and no params";
    }

    static String executeSomethingWithReturnOneParam(String param1){
        LOGGER.info("param1: " + param1);
        return "Hello Value returned from static method inside interface with return and one param: " + param1;
    }

    static String executeSomethingWithReturnTwoParams(String param1, String param2){
        LOGGER.info("param1: " + param1);
        LOGGER.info("param2: " + param2);
        String returnedValue = param1 + " + " + param2;
        return "Hello Value returned from static method inside interface with return and two params: " + returnedValue;
    }
}