package br.com.caioalbuquerque.java8features.example01;

import java.util.StringJoiner;
import java.util.logging.Logger;

/**
 * @author Caio Albuquerque
 * @since 11/02/2022
 */
public final class StringUtil {
    private static final Logger LOGGER = Logger.getLogger("StringUtil");

    /**
     * This util method creates a custom string with StringJoiner.
     * This creation receive items to compose the string and a delimiter.
     *
     * Ex: items (1,2,3) with delimiter ; will result in the string "1;2;3"
     *
     * @param delimiter items are separated with delimiters
     * @return String
     */
    public static String createStringUsingStringJoiner(String delimiter) {
        LOGGER.info("Calling createStringUsingStringJoiner() method only with DELIMITER " + delimiter);
        StringJoiner stringJoiner = new StringJoiner(delimiter);

        LOGGER.info("Adding 'aaa', 'bbb', 'ccc'");
        String createdString = stringJoiner.add("aaa").add("bbb").add("ccc").toString();

        LOGGER.info("Created string ---> " + createdString);
        return createdString;
    }

    /**
     * This util method creates a custom string with StringJoiner.
     * This creation receive items to compose the string, a delimiter, a prefix and a suffix.
     *
     * Ex: items (1,2,3) with delimiter ; prefix < and suffix ) will result in the string "<1;2;3)"
     *
     * @param delimiter items are separated with delimiters
     * @param prefix this element comes in the start of the string
     * @param suffix this element comes in the end of the string
     * @return String
     */
    public static String createStringUsingStringJoiner(String delimiter, String prefix, String suffix) {
        LOGGER.info("Calling createStringUsingStringJoiner() method only with DELIMITER " + delimiter
                + " PREFIX " + prefix + " SUFFIX " + suffix);
        StringJoiner stringJoiner = new StringJoiner(delimiter, prefix, suffix);

        LOGGER.info("Adding 'ddd', 'eee' and 'fff'");
        String createdString = stringJoiner.add("ddd").add("eee").add("fff").toString();

        LOGGER.info("Created string ---> " + createdString);
        return createdString;
    }
}