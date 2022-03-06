package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.util.TimeUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 01/03/2022
 */
@RestController
@RequestMapping("/time")
public class TimeController {
    private static final Logger LOGGER = Logger.getLogger("TimeController");

    @GetMapping("/currenttimemillis")
    public Long getTimeWithCurrentTimeMillis(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve a long time value -> Clock.systemUTC().millis(); ");
        LOGGER.info(" ");
        Long currentTimeMillis = TimeUtil.getCurrentTimeMillis();
        LOGGER.info("Current time millis: " + currentTimeMillis);
        return currentTimeMillis;
    }

    @GetMapping("/instant")
    public Instant getTimeWithInstantInstance(){
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve a Instant instance -> Clock.systemUTC().instant()");
        Instant instant = TimeUtil.getInstant();
        LOGGER.info("Instant instance: " + instant);
        return instant;
    }
}