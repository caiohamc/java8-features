package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.model.lambda.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 01/03/2022
 */
@RestController
@RequestMapping(value = "/lambda")
public class LambdaController {
    private static final Logger LOGGER = Logger.getLogger("LambdaController");

    @GetMapping(value = "/noreturn/noparams")
    public String getLambdaResponseWithNoReturnAndNoParams() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve lambda response without return and no params");
        LOGGER.info(" ");
        LOGGER.info("lfNoReturnNoParams.executeNoReturnNoParams(): ");
        LambdaFunctionsNoReturnNoParams lfNoReturnNoParams = () -> LOGGER.info("Hello Lambda!");
        lfNoReturnNoParams.executeNoReturnNoParams();
        return "OK";
    }

    @GetMapping(value = "/noreturn/oneparam")
    public String getLambdaResponseWithNoReturnAndOneParam() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve lambda response without return and one param");
        LOGGER.info(" ");
        LOGGER.info("lfNoReturnOneParam.executeNoReturnOneParam(param1): ");
        LambdaFunctionsNoReturnOneParam lfNoReturnOneParam = (param1) -> LOGGER.info("param1: " + param1);
        lfNoReturnOneParam.executeNoReturnOneParam("foo");
        return "OK";
    }

    @GetMapping(value = "/noreturn/twoparams")
    public String getLambdaResponseWithNoReturnAndTwoParams() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve lambda response without return and two params");
        LOGGER.info(" ");
        LOGGER.info("lfNoReturnTwoParams.executeNoReturnTwoParams(param1, param2): ");
        LambdaFunctionsNoReturnTwoParams lfNoReturnTwoParams = (param1, param2) -> {
            LOGGER.info("param1: " + param1);
            LOGGER.info("param2: " + param2);
        };
        lfNoReturnTwoParams.executeNoReturnTwoParams("foo", "bar");
        return "OK";
    }

    @GetMapping(value = "/withreturn/noparams")
    public String getLambdaResponseWithReturnAndNoParams() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve lambda response with return and no params");
        LOGGER.info(" ");
        LOGGER.info("lfWithReturnNoParams.executeWithReturnNoParams(): ");
        LambdaFunctionsWithReturnNoParams lfWithReturnNoParams = () -> "Hello Lambda!";
        LOGGER.info("return: " + lfWithReturnNoParams.executeWithReturnNoParams());
        return lfWithReturnNoParams.executeWithReturnNoParams();
    }

    @GetMapping(value = "/withreturn/oneparam")
    public String getLambdaResponseWithReturnAndOneParam() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve lambda response with return and one param");
        LOGGER.info(" ");
        LOGGER.info("lfWithReturnOneParam.executeWithResultOneParam(param1): ");
        LambdaFunctionsWithReturnOneParam lfWithReturnOneParam = (param1) -> {
            LOGGER.info("param1: " + param1);
            return param1;
        };
        LOGGER.info("return (param1): " + lfWithReturnOneParam.executeWithReturnOneParam("foo"));
        return lfWithReturnOneParam.executeWithReturnOneParam("foo");
    }

    @GetMapping(value = "/withreturn/twoparams")
    public String getLambdaResponseWithReturnAndTwoParams() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve lambda response with return and two params");
        LOGGER.info(" ");
        LOGGER.info("lfWithReturnTwoParams.executeWithReturnTwoParams(param1, param2): ");
        LambdaFunctionsWithReturnTwoParams lfWithReturnTwoParams = (param1, param2) -> {
            LOGGER.info("param1: " + param1);
            LOGGER.info("param2: " + param2);
            return param1 + " + " + param2;
        };
        LOGGER.info("return (param1 + param2): " + lfWithReturnTwoParams.executeWithReturnTwoParams("foo", "bar"));
        return lfWithReturnTwoParams.executeWithReturnTwoParams("foo", "bar");
    }
}