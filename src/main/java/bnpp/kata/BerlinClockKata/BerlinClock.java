package bnpp.kata.BerlinClockKata;

public class BerlinClock {

	public String convertSecondsToSecondsLamp(int seconds)
	{
		return (seconds%2==0?"Y":"O");
	}

}
