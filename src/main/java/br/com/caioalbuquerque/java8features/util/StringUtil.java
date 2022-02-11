package br.com.caioalbuquerque.java8features.util;

import java.util.StringJoiner;

/**
 * @author Caio Albuquerque
 * @since 11/02/2022
 */
public final class StringUtil {

    /**
     * This util method creates a custom string with StringJoiner.
     * This creation receive items to compose the string and a delimiter.
     *
     * Ex: items (1,2,3) with delimiter ; will result in the string "1;2;3"
     *
     * @param delimiter items are separated with delimiters
     * @param items each part of the strings, excluding delimiters, prefix and suffix
     * @return String
     */
    public static String createStringUsingStringJoiner(String delimiter, Object... items) {
        StringJoiner stringJoiner = new StringJoiner(";");
        for (Object item : items) {
            stringJoiner.add(item.toString());
        }
        return stringJoiner.toString();
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
     * @param items each part of the strings, excluding delimiters, prefix and suffix
     * @return String
     */
    public static String createStringUsingStringJoiner(String delimiter, String prefix, String suffix, Object... items) {
        StringJoiner stringJoiner = new StringJoiner(delimiter, prefix, suffix);
        for (Object item : items) {
            stringJoiner.add(item.toString());
        }
        return stringJoiner.toString();
    }
}