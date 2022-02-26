package br.com.caioalbuquerque.java8features.example02;

import java.time.Clock;
import java.time.Instant;

/**
 * @author Caio Albuquerque
 * @since 12/02/2022
 */
public class TimeUtil {
    /**
     * @return current time millis
     */
    public static Long getCurrentTimeMillis() {
        return Clock.systemUTC().millis();
    }

    /**
     * @return instant
     */
    public static Instant getInstant(){
        return Clock.systemUTC().instant();
    }
}
