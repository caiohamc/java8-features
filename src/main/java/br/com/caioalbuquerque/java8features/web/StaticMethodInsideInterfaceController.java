package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.model.staticmethdinterface.StaticMethodInsideInterfaceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 06/03/2022
 */
@RestController
@RequestMapping("/staticmethodfrominterface")
public class StaticMethodInsideInterfaceController {
    private static final Logger LOGGER = Logger.getLogger("StaticMethodInsideInterfaceController");

    static StaticMethodInsideInterfaceImpl staticMethodInsideInterface = new StaticMethodInsideInterfaceImpl();
    static String returnedValue = null;

    @GetMapping("/noreturn/noparams")
    public static void callStaticMethodFromInterfaceNoReturnNoParams(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with no return and no param");
        LOGGER.info(" ");
        staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnNoParams();
    }

    @GetMapping("/noreturn/oneparam")
    public static void callStaticMethodFromInterfaceNoReturnOneParam(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with no return and one param");
        LOGGER.info(" ");
        staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnOneParam("foo");
    }

    @GetMapping("/noreturn/twoparams")
    public static void callStaticMethodFromInterfaceNoReturnTwoParams(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with no return and two params");
        LOGGER.info(" ");
        staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnTwoParams("foo", "bar");
    }

    @GetMapping("/withreturn/noparams")
    public static void callStaticMethodFromInterfaceWithReturnNoParams(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with return and no params");
        LOGGER.info(" ");
        LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithReturnNoParams());
    }

    @GetMapping("/withreturn/oneparam")
    public static void callStaticMethodFromInterfaceWithReturnOneParam(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with return and one param");
        LOGGER.info(" ");
        LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithResultOneParam("foo"));
    }

    @GetMapping("/withreturn/twoparams")
    public static void callStaticMethodFromInterfaceWithReturnTwoParams(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with return and two params");
        LOGGER.info(" ");
        LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithResultTwoParams("foo", "bar"));
    }
}