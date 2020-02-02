package bnpp.kata.BerlinClockKata;

public class BerlinClock {

	public String convertSecondsToSecondsLamp(int seconds)
	{
		return (seconds%2==0?"Y":"O");
	}

	public String convertHoursToFiveHoursRow(int hours)
	{
		String result="";
		int onCountFiveHoursRow=getOnCountForHoursRow(0,hours);
		for (int i=1;i<=4;i++)
			if (i<=onCountFiveHoursRow)
				result+="R";
			else
				result+="O";
		return result;
	}

	public String convertHoursToSingleHoursRow(int hours)
	{
		String result="";
		int onCountSingleHoursRow=getOnCountForHoursRow(1,hours);
		for (int i=1;i<=4;i++)
			if (i<=onCountSingleHoursRow)
				result+="R";
			else
				result+="O";
		return result;
	}

	public int getOnCountForHoursRow(int type,int hours)
	{
		switch(type)
		{
		case 0:
			return hours/5;
		case 1:
			return hours%5;
		default:
			return -1;

		}
	}

}
