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

    private final StaticMethodInsideInterfaceImpl staticMethodInsideInterface = new StaticMethodInsideInterfaceImpl();

    @GetMapping("/noreturn/noparams")
    public  void callStaticMethodFromInterfaceNoReturnNoParams(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with no return and no param");
        staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnNoParams();
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/noreturn/oneparam")
    public void callStaticMethodFromInterfaceNoReturnOneParam(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with no return and one param");
        staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnOneParam("foo");
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/noreturn/twoparams")
    public void callStaticMethodFromInterfaceNoReturnTwoParams(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with no return and two params");
        staticMethodInsideInterface.executeStaticMethodFromInterfaceNoReturnTwoParams("foo", "bar");
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/withreturn/noparams")
    public void callStaticMethodFromInterfaceWithReturnNoParams(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with return and no params");
        LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithReturnNoParams());
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/withreturn/oneparam")
    public void callStaticMethodFromInterfaceWithReturnOneParam(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with return and one param");
        LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithResultOneParam("foo"));
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }

    @GetMapping("/withreturn/twoparams")
    public void callStaticMethodFromInterfaceWithReturnTwoParams(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to call static method from an interface with return and two params");
        LOGGER.info(staticMethodInsideInterface.executeStaticMethodFromInterfaceWithResultTwoParams("foo", "bar"));
        LOGGER.info("-----------------------------------------------------------------------------------------");
    }
}