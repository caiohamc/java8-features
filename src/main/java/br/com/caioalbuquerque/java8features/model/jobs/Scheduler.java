package br.com.caioalbuquerque.java8features.model.jobs;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 27/02/2022
 */
@Component
public class Scheduler {
    private static final Logger LOGGER = java.util.logging.Logger.getLogger("Scheduler");

    private static final int SEGUNDO = 1000;
    // private static final int MINUTO = SEGUNDO * 60;
    // private static final int HORA = MINUTO * 60;
    // private static final int DIA = HORA * 24;

    private static final String TIME_ZONE = "America/Sao_Paulo";

//    @Scheduled(cron = "1 0 0 * * *", zone = TIME_ZONE)
//    public void scheduleWithCron(){
//        LOGGER.info("Logging with cron (1 0 0 * * *) and zone Brazil");
//    }

    @Scheduled(fixedDelay = SEGUNDO * 5)
    public void scheduleWithFixedDelay(){
        LOGGER.info("Logging with fixed delay 5 seconds");
    }

    @Scheduled(fixedRate = SEGUNDO * 2)
    public void scheduleWithFixedRate(){
        LOGGER.info("Logging with fixed rate 2 seconds");
    }
}