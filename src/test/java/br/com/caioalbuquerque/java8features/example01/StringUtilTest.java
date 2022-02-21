package br.com.caioalbuquerque.java8features.example01;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 * @author Caio Albuquerque
 * @since 15/02/2022
 */
public class StringUtilTest {
    @Test
    public void createsAnyStringUsingStringJoinerOnlyWithDelimiterParam(){
        String returnedString = StringUtil.createStringUsingStringJoiner(":");
        assertNotNull(returnedString);
    }

    @Test
    public void createsSpecificStringWithSpecificDelimiterOnlyWithDelimiterParam(){
        String returnedString = StringUtil.createStringUsingStringJoiner(":");
        assert(returnedString.contains(":"));
    }

    @Test
    public void createsAnyStringUsingStringJoinerWithDelimiterPrefixAndSuffixParams(){
        String returnedString = StringUtil.createStringUsingStringJoiner(":", "<", ">");
        assertNotNull(returnedString);
    }

    @Test
    public void createsSpecificStringUsingStringJoinerWithDelimiterPrefixAndSuffixParams(){
        String returnedString = StringUtil.createStringUsingStringJoiner(":", "<", ">");
        assert(returnedString.startsWith("<"));
        assert(returnedString.contains(":"));
        assert(returnedString.endsWith(">"));
    }
}