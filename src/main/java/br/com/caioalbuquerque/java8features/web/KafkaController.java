package br.com.caioalbuquerque.java8features.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 14/03/2022
 */
@RestController
@RequestMapping("/kafka")
public class KafkaController {
    private static final Logger LOGGER = Logger.getLogger("KafkaController");

    @GetMapping("/foo")
    public void getFoo(){
        // TODO not implemented yet
    }
}
