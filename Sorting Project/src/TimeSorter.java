import java.util.Comparator;

public class TimeSorter implements Comparator<TimeSort> 
{
	public int compare(TimeSort t1, TimeSort t2)
	{
		if(t1.getTime() > t2.getTime())
		{
			return 1;
		}
		else 
			return -1;
	}
}
