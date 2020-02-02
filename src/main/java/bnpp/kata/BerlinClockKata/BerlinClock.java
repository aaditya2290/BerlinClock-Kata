package bnpp.kata.BerlinClockKata;

public class BerlinClock {

	public String convertSecondsToSecondsLamp(int seconds)
	{
		return (seconds%2==0?"Y":"O");
	}

	public String convertHoursToFiveHoursRow(int hours)
	{
		String result="";
		int onCountFiveHoursRow=hours/5;
		for (int i=1;i<=4;i++)
			if (i<=onCountFiveHoursRow)
				result+="R";
			else
				result+="O";
		return result;
	}

}
