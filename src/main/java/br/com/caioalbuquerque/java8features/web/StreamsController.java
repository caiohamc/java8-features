package br.com.caioalbuquerque.java8features.web;

import br.com.caioalbuquerque.java8features.model.lambda.LambdaFunctionsNoReturnNoParams;
import br.com.caioalbuquerque.java8features.util.StreamsUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 02/03/2022
 */
@RestController
@RequestMapping("/streams")
public class StreamsController {
    private static final Logger LOGGER = Logger.getLogger("StreamsController");

    @GetMapping("/fullintstream")
    public String getFullIntStrem() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve full int stream");
        LOGGER.info(" ");

        LOGGER.info("StreamsUtil.getFullIntStream(1,10)");
        StreamsUtil.getFullIntStream(1, 10);
        return "OK";
    }

    @GetMapping("/skippedintstream")
    public String getSkippedIntStrem() {
        LOGGER.info("-----------------------------------------------------------------------------------------");
        LOGGER.info("REST API method to retrieve skipped int stream");
        LOGGER.info(" ");

        LOGGER.info("StreamsUtil.getFullIntStream(1,10, 5)");
        StreamsUtil.getSkippedIntStream(1, 10, 5);
        return "OK";
    }
}