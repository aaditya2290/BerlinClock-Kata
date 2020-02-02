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

}
