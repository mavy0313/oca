package chapter3;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.UnsupportedTemporalTypeException;

import static org.junit.Assert.assertEquals;

public class DateAndTimeTest {

    @Test
    public void print() {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
        LocalDate date2 = LocalDate.of(2015, 1, 20);

        System.out.println(date1);
        System.out.println(date2);

        LocalTime time1 = LocalTime.of(6, 15);
        LocalTime time2 = LocalTime.of(6, 15, 30);
        LocalTime time3 = LocalTime.of(6, 15, 30, 200);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);

        LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
    }

    @Test(expected = DateTimeException.class)
    public void dateTimeException() {
        LocalDate d = LocalDate.of(2015, 1, 32);
    }

    @Test
    public void addingDateAndTimes() {
        LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);

        assertEquals("2014-01-20", date.toString());

        date = date.plusDays(2);

        assertEquals("2014-01-22", date.toString());

        date = date.plusWeeks(1);

        assertEquals("2014-01-29", date.toString());

        date = date.plusMonths(1);

        assertEquals("2014-02-28", date.toString());

        date = date.plusYears(5);

        assertEquals("2019-02-28", date.toString());
    }

    @Test
    public void subtracting() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        assertEquals("2020-01-20T05:15", dateTime.toString());

        dateTime = dateTime.minusDays(1);
        assertEquals("2020-01-19T05:15", dateTime.toString());

        dateTime = dateTime.minusHours(10);
        assertEquals("2020-01-18T19:15", dateTime.toString());

        dateTime = dateTime.minusSeconds(30);
        assertEquals("2020-01-18T19:14:30", dateTime.toString());

    }

    @Test
    public void noPeriods() {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        performAnimalEnrichment(start, end);
    }

    private void performAnimalEnrichment(LocalDate start, LocalDate end) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plusMonths(1);
        }
    }

    @Test
    public void periods() {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1);
        performAnimalEnrichment(start, end, period);
    }

    private void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }

    @Test(expected = UnsupportedTemporalTypeException.class)
    public void usingPeriod() {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Period period = Period.ofMonths(1);

        assertEquals("2015-02-20", date.plus(period).toString());
        assertEquals("2015-02-20T06:15", dateTime.plus(period).toString());
        time.plus(period); //UnsupportedTemporalTypeException Unsupported units: Months
    }

    @Test
    public void dateTimeFormatter() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        assertEquals("20.01.20 11:12", shortF.format(dateTime));
        assertEquals("20.01.2020 11:12:34", mediumF.format(dateTime));
    }

    @Test
    public void dateTimeFormatterPattern() {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");

        assertEquals("января 20, 2020, 11:12", f.format(dateTime));
    }

    @Test
    public void parsing() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:12");

        assertEquals("2015-01-02", date.toString());
        assertEquals("11:12", time.toString());
    }
}
