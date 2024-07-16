package dev.bego.Exercise1Tests;

import org.junit.jupiter.api.Test;

import dev.bego.Exercise1.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MonthsTest {

    @Test
    public void testMonthNameValid() {
        Month months = new Month();
        assertEquals("January", months.monthName(1));
        assertEquals("February", months.monthName(2));
        assertEquals("March", months.monthName(3));
        assertEquals("April", months.monthName(4));
        assertEquals("May", months.monthName(5));
        assertEquals("June", months.monthName(6));
        assertEquals("July", months.monthName(7));
        assertEquals("August", months.monthName(8));
        assertEquals("September", months.monthName(9));
        assertEquals("October", months.monthName(10));
        assertEquals("November", months.monthName(11));
        assertEquals("December", months.monthName(12));
    }

    @Test
    public void testMonthNameInvalid() {
        Month months = new Month();
        assertEquals("not a valid month number", months.monthName(0));
        assertEquals("not a valid month number", months.monthName(13));
    }
}