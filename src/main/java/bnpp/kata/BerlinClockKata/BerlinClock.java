package bnpp.kata.BerlinClockKata;

public class BerlinClock {

	public String[] convertDigitalTimeToBerlinTime(String digitalTime)
	{
		String[] digitalTimeArray=digitalTime.split(":");
		int[] digitalTimeNumeric=new int[digitalTimeArray.length];

		for (int i=0;i<digitalTimeArray.length;i++)
			digitalTimeNumeric[i]=Integer.parseInt(digitalTimeArray[i]);

		return new String[]{
				convertSecondsToSecondsLamp(digitalTimeNumeric[2]),
				convertHoursToFiveHoursRow(digitalTimeNumeric[0]),convertHoursToSingleHoursRow(digitalTimeNumeric[0]),
				convertMinutesToFiveMinutesRow(digitalTimeNumeric[1]),convertMinutesToSingleMinutesRow(digitalTimeNumeric[1])
		};
	}

	public String convertSecondsToSecondsLamp(int seconds)
	{
		return (seconds%2==0?"Y":"O");
	}

	public String convertHoursToFiveHoursRow(int hours)
	{
		String result="";
		int onCountFiveHoursRow=getOnCountForRow(0,hours);
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
		int onCountSingleHoursRow=getOnCountForRow(1,hours);
		for (int i=1;i<=4;i++)
			if (i<=onCountSingleHoursRow)
				result+="R";
			else
				result+="O";
		return result;
	}

	public String convertMinutesToFiveMinutesRow(int minutes)
	{
		String result="";
		int onCountFiveMinutesRow=getOnCountForRow(0,minutes);
		for (int i=1;i<=11;i++)
			if (i<=onCountFiveMinutesRow)
			{
				if (i%3==0)
					result+="R";
				else
					result+="Y";	
			}
			else
				result+="O";
		return result;

	}

	public String convertMinutesToSingleMinutesRow(int minutes)
	{
		String result="";
		int onCountSingleMinutesRow=getOnCountForRow(1,minutes);
		for (int i=1;i<=4;i++)
			if (i<=onCountSingleMinutesRow)
				result+="Y";	
			else
				result+="O";
		return result;	
	}

	public int getOnCountForRow(int type,int time)
	{
		switch(type)
		{
		case 0:
			return time/5;
		case 1:
			return time%5;
		default:
			return -1;

		}
	}

}
