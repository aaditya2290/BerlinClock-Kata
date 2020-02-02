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

	@Test
	public void testMinutesToFiveMinutesRowConversion(){
		assertEquals("YYRYYRYOOOO",clock.convertMinutesToFiveMinutesRow(37));
		assertEquals("YYRYYRYYRYO",clock.convertMinutesToFiveMinutesRow(53));
	}

	@Test
	public void testMinutesToSingleMinutesRowConversion(){
		assertEquals("YYOO",clock.convertMinutesToSingleMinutesRow(22));
		assertEquals("YYYO",clock.convertMinutesToSingleMinutesRow(48));
	}
	
	@Test
	public void testDigitalTimeToBerlinTimeConversion(){
		String[] berlinTime=clock.convertDigitalTimeToBerlinTime("15:47:33");
		String[] expectedValue=new String[]{"O","RRRO","OOOO","YYRYYRYYROO","YYOO"};
		for (int i=0;i<expectedValue.length;i++)
			assertEquals(expectedValue[i],berlinTime[i]);
	}

}
