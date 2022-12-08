package main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class TestCalendar {

    @ParameterizedTest
    @ValueSource(ints = {1925, 1904, 2000, 1961, 1996})
    void Should_check_if_year_is_leap_also_in_gregorian(int year) {
        // Implement
        Calendar calendar = new Calendar(year);
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        Boolean expectedValue = gregorianCalendar.isLeapYear(year);
        Boolean actualValue = calendar.isLeapYear();

        assertEquals(expectedValue, actualValue);

    }

    // Implement test cases for the equivalent partitions

    @ParameterizedTest
    @ValueSource(ints = {1896, 1855, 1600})
    void Should_return_false_for_years_below_1900(int year) {
        Calendar calendar = new Calendar(year);
        assertFalse(calendar.isLeapYear());
    }

    @ParameterizedTest
    @ValueSource(ints = {2004, 2005, 2400})
    void Should_return_false_for_years_above_2001(int year) {
        Calendar calendar = new Calendar(year);
        assertFalse(calendar.isLeapYear());
    }

}
