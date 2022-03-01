package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.util.StringUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 01/03/2022
 */
@RestController
@RequestMapping(value = "/string")
public class StringController {
    private static final Logger LOGGER = Logger.getLogger("StringController");

    @GetMapping(value = "/create/stringjoiner/onlydelimiter")
    public String createUsingStringJoinerOnlyWithDelimiter(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to create a String using StringJoiner only with Delimiter ; ");
        LOGGER.info(" ");
        return StringUtil.createStringUsingStringJoiner(";");
    }

    @GetMapping(value = "/create/stringjoiner/delimiterprefixsuffix")
    public String createUsingStringJoinerWithDelimiterPrefixAndSuffix(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to create a String using StringJoiner with Delimiter ; Prefix [ and Suffix )");
        LOGGER.info(" ");
        return StringUtil.createStringUsingStringJoiner(";","[",")");
    }

}