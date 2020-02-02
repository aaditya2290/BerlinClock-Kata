package bnpp.kata.BerlinClockKata;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BerlinClockTest {

	BerlinClock clock;

	@Before
	public void InitializeBerlinClock() {
		clock=new BerlinClock();
	}

	@Test
	public void testSecondsToSecondsLampConversion(){
		assertEquals("Y",clock.convertSecondsToSecondsLamp(10));
		assertEquals("O",clock.convertSecondsToSecondsLamp(7));
	}

	@Test
	public void testHoursToFiveHoursRowConversion(){
		assertEquals("RROO",clock.convertHoursToFiveHoursRow(13));
		assertEquals("RRRR",clock.convertHoursToFiveHoursRow(21));
	}

	@Test
	public void testHoursToSingleHoursRowConversion(){
		assertEquals("RRRO",clock.convertHoursToSingleHoursRow(18));
		assertEquals("ROOO",clock.convertHoursToSingleHoursRow(11));
	}

}
