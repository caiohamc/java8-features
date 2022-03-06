package br.com.caioalbuquerque.java8features.util;

import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 * @author Caio Albuquerque
 * @since 15/02/2022
 */
public class StreamsUtil {
    private static final Logger LOGGER = Logger.getLogger("StreamsUtil");

    /* intermediate actions */
    // anyMatch();
    // distinct();
    // filter();
    // findFirst();
    // flatMap();
    // map();
    // skip();
    // sorted();
    // filterFirst();

    /* final actions */
    // count();
    // max();
    // min();
    // reduce();
    // summaryStatistics();

    public static void getFullIntStream(int rangeStart, int rangeEnd){
        IntStream.range(rangeStart, rangeEnd)
                .forEach(intValue -> LOGGER.info("-> " + intValue));
    }

    public static void getSkippedIntStream(int rangeStart, int rangeEnd, int skip) {
        IntStream.range(rangeStart, rangeEnd)
                .skip(skip)
                .forEach(intValue -> LOGGER.info("-> " + intValue));
    }

    public static void getFilteredStream(){
    }

    public static void getSortedStream(){
    }

    public static void getMappedStream(){
    }

    public static void getCollectedStream(){
    }
}