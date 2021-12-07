//POJO of time sort objects
public class TimeSort 
	{
	private String sortMethod;
	private double time;
	
	public TimeSort(String s, double t)
	{
		sortMethod = s;
		time = t;
	}

	public String getSortMethod() {
		return sortMethod;
	}

	public void setSortMethod(String sortMethod) {
		this.sortMethod = sortMethod;
	}

	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;
	}
		
	}
